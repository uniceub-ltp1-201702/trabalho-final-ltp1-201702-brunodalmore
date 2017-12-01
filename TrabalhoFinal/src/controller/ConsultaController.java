package controller;

import javax.swing.JOptionPane;
import bd.BancoDeDados;
import util.Buscar;
import util.Opcoes;
import view.MenssagensView;
import view.MusicaView;

public class ConsultaController {

	MenssagensView mv = new MenssagensView();
	Opcoes o = new Opcoes();
	MusicasController mc = new MusicasController();
	Buscar b = new Buscar();
	MusicaView m = new MusicaView();

	// VIEW DA OPÇAO REALIZAR CONSULTA//VALIDA OPCAO DIGITADA//STRING OPCAO INPUT
	// DIALOG//BUSCAS DE MUSICAS> OPCAO 2 POR NOME OPCAO 3 POR CARACTERE
	public void consulta() {
		String opcao = mv.consultaView();
		if (o.validarOpcaoConsulta(opcao) == false) {
			this.consulta();
		} else {
			if (opcao.equals("0")) {
				return;
			}
			if (opcao.equals("1")) {
				mc.listarMusicasDeUmArtista();
				this.consulta();
			}
			if (opcao.equals("2")) {
				BancoDeDados bd = new BancoDeDados();
				String musicas = b.procurarMusicasPorNome(bd.musicas, m.perguntarMusica());
				if (musicas != null) {
					JOptionPane.showMessageDialog(null, musicas);
				}
				this.consulta();
			}
			if (opcao.equals("3")) {
				BancoDeDados bd = new BancoDeDados();
				String musicas = b.procurarMusicaContida(bd.musicas, m.perguntarMusica());
				if (musicas != null) {
					JOptionPane.showMessageDialog(null, musicas);
					this.consulta();
				}
			}
			if (opcao.equals("4")) {
				BancoDeDados bd = new BancoDeDados();
				JOptionPane.showMessageDialog(null, bd.artistas.toString());
				this.consulta();
			}

		}
	}

}
