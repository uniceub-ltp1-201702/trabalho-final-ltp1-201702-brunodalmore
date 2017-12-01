package util;

import java.util.ArrayList;
import model.Artista;
import model.Musicas;
import view.MenssagensView;

public class Validar {

	MenssagensView mv = new MenssagensView();
	Buscar s = new Buscar();

	//CHECA SE ARTISTA EXISTE E VALIDA O CPF
	public boolean validarArtista(ArrayList<Artista> pacientelista, String name, String cpf) {
		boolean b = false;

		if (vejaSeArtistaEstaRegistrado(pacientelista, s.procurarArtistaPorNome(pacientelista, name),
				s.procurarArtistaPorCpf(pacientelista, posicionarCpf(cpf))) == true) {

			if (validarCpf(cpf) == true) {
				b = true;
			}
		}
		return b;
	}

	public Boolean validarCpf(String cpf) {
		if (cpf != null) {
			try {
				Float.parseFloat(cpf);

			} catch (NumberFormatException e) {
				mv.erroCpfInvalido();
				return false;
			}
			if (cpf.length() == 11) {
				return true;
			} else {
				mv.erroCpfInvalido();
			}
		}
		return false;
	}

	public String posicionarCpf(String cpf) {
		String splited = "";
		try {
			if (cpf != null) {
				splited = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-"
						+ cpf.substring(9, cpf.length());
			}
		} catch (StringIndexOutOfBoundsException e) {

		}
		return splited;
	}

	public boolean vejaSeArtistaEstaRegistrado(ArrayList<Artista> artista, Artista nome, Artista cpfPosicionado) {
		boolean b = true;
		if (artista.contains(nome)) {
			mv.erroArtistaJaCadastrado();
			b = false;
		}
		if (artista.contains(cpfPosicionado)) {
			mv.erroCpfEmUso();
			b = false;
		}
		return b;
	}

	public boolean vejaSeMusicaEstaRegistrada(ArrayList<Musicas> musicas, String musica, String artista) {
		boolean b = true;
		for (int i = 0; i < musicas.size(); i++) {
			if (musicas.get(i).getArtista().equals(artista) && musicas.get(i).getMusica().equals(musica)) {
				mv.erroMusicaJaCadastrada();
				b = false;
			}
		}
		return b;
	}
}
