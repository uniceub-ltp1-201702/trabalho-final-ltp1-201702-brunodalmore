package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import bd.BancoDeDados;
import model.Artista;
import model.Musicas;
import util.Buscar;
import util.Validar;
import view.ArtistaView;
import view.MenssagensView;
import view.MusicaView;

public class MusicasController {

	MusicaView m = new MusicaView();
	MenssagensView mv = new MenssagensView();
	Validar v = new Validar();
	Buscar b = new Buscar();
	ArtistaView av = new ArtistaView();

	//FUNÇÃO PARA REALIZAR O REGRISTO DA MUSICA.
	public void registrarMusica(Artista artista) {
		BancoDeDados db = new BancoDeDados();
		String a = artista.getName();
		String musica = m.perguntarMusica();
		if (v.vejaSeMusicaEstaRegistrada(db.musicas, musica, a) == true) {
			Musicas m = new Musicas(musica, a);
			db.adicionarMusica(m);
			mv.musicaRegistrada();
		} else {
			return;
		}

	}

	//FUNÇÃO PARAR MOSTRAR A LISTA DE MUSICAS DE UM DETERMINADO ARTISTA DEFINIDO PPELO USUÁRIO
	public void listarMusicasDeUmArtista() {
		BancoDeDados db = new BancoDeDados();
		String nome = av.perguntarNome();
		Artista a = b.procurarArtistaPorNome(db.artistas, nome);
		if (db.artistas.contains(a)) {
			ArrayList<String> musicas = b.procurarMusicasDeUmArtista(db.musicas, nome);
			if(musicas.size() == 0) {
				JOptionPane.showMessageDialog(null, "Esse artista nao contem nenhuma musica");
			}else {
				JOptionPane.showMessageDialog(null, musicas);
			}
		} else {
			mv.erroArtistaNaoEncontrado();
		}
	}
}
