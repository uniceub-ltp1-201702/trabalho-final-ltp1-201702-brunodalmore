package util;

import java.util.ArrayList;

import bd.BancoDeDados;
import model.Artista;
import model.Musicas;
import view.ArtistaView;
import view.MenssagensView;
import view.MusicaView;

public class Excluir {

	MenssagensView mv = new MenssagensView();
	Opcoes o = new Opcoes();
	MusicaView m = new MusicaView();
	Buscar b = new Buscar();

	public void redirecionarExclusao() {
		String qual = mv.perguntarTipoExclusao();
		if (o.validarOpcaoExclusao(qual) == true) {
			if (qual.equals("0")) {
				return;
			}
			if (qual.equals("1")) {
				excluirArtista();
				this.redirecionarExclusao();
			}
			if (qual.equals("2")) {
				excluirMusica();
				this.redirecionarExclusao();
			}
		}else {
			this.redirecionarExclusao();
		}
	}

	public void excluirMusica() {
		BancoDeDados bd = new BancoDeDados();
		ArrayList<Musicas> mu = b.procurarMusicaPorNome(bd.musicas, m.perguntarMusica());
		if (mu != null) {
			if (mu.size() == 1) {
				for (Musicas m : mu) {
					bd.excluirMusica(m);
					mv.musicaExcluida();
					return;
				}
			}
			if (mu.size() >= 2) {
				String nome = mv.perguntarQualMusica();
				if (nome == null) {
					return;
				}
				Musicas m = b.procurarMusicaPorArtista(bd.musicas, nome);
				if (m != null) {
					bd.excluirMusica(m);
					mv.musicaExcluida();
					return;
				} else {
					mv.erroArtistaNaoEncontrado();
					mv.erroMusicaNaoExcluida();
					return;
				}
			}
		}else {
			mv.erroMusicaNaoEncontrada();
			return;
		}
	}

	public void excluirArtista() {
		BancoDeDados bd = new BancoDeDados();
		Artista a = b.procurarArtistaPorNome(bd.artistas, new ArtistaView().perguntarNome());
		if(a != null) {
			bd.excluirArtista(a);
			mv.artistaExcluido();
		}else {
			mv.erroArtistaNaoEncontrado();
		}
	}

}
