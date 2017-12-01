package util;

import java.util.ArrayList;
import model.Artista;
import model.Musicas;

public class Buscar {
	ManipuladorArquivo fm = new ManipuladorArquivo();
	
	//REALIZA BUSCAS PARA = VER SE JA EXISTE O ARTISTA E NAO REGISTRAR OU BUSCAR MESMO NOVAMANETE
	public Artista procurarArtistaPorNome(ArrayList<Artista> artistas, String name) {
		for (int i = 0; i < artistas.size(); i++) {
			String nome = artistas.get(i).getName();
			if (name != null) {
				if (name.equals(nome)) {
					return artistas.get(i);
				}
			}
		}
		return null;
	}
	
	//PROCURAR ARTISTA POR CPF 
	public Artista procurarArtistaPorCpf(ArrayList<Artista> artistas, String cpfPosicionado) {
		for (int i = 0; i < artistas.size(); i++) {
			String thiscpf = artistas.get(i).getCpf();
			if (cpfPosicionado != null) {
				if (cpfPosicionado.equals(thiscpf)) {
					return artistas.get(i);
				}
			}
		}
		return new Artista(null, null);
	}

	//PROCURAR MUSICA POR NOME
	public ArrayList<Musicas> procurarMusicaPorNome(ArrayList<Musicas> musicas, String musica) {
		ArrayList<Musicas> musics = new ArrayList<Musicas>();
		for (int i = 0; i < musicas.size(); i++) {
			String nome = musicas.get(i).getMusica();
			if (musica.equals(nome)) {
				musics.add(musicas.get(i));
			}
		}
		if(musics.size() == 0) {
			return null;
		}
		return musics;
	}
	
	//PROCURAR MUSICA POR ARTISTA
	public Musicas procurarMusicaPorArtista(ArrayList<Musicas> musicas, String artista) {
		for (int i = 0; i < musicas.size(); i++) {
			String nome = musicas.get(i).getArtista();
			if (artista.equals(nome)) {
				return musicas.get(i);
			}
		}
		
		return null;
	}
	
	//PROCURAR MUSICAS POR NOME
	public String procurarMusicasPorNome(ArrayList<Musicas> musicas, String musica) {
		ArrayList<String> musicaseartistas = new ArrayList<String>();
		if(musica== null) {return "Musica não encontrada";}
		for (int i = 0; i < musicas.size(); i++) {
			String thismusica = musicas.get(i).getMusica();
			if(musica.equals(thismusica)) {
				musicaseartistas.add("Musica: " + musica + "•" + "Artista: " + musicas.get(i).getArtista() + "\n");
			}
		}
		if(musicaseartistas.size() == 0) {
			return "Musica não encontrada!";
		}
		
		return musicaseartistas.toString();
	}
	
	//PROCURAR MUSICAS CONTIDAS NO ARRAYLIST DE MUSICAS.
	public String procurarMusicaContida(ArrayList<Musicas> musicas, String musica){
		ArrayList<String> musicaseartistas = new ArrayList<String>();
		for (int i = 0; i < musicas.size(); i++) {
			String thismusica = musicas.get(i).getMusica();
			if(thismusica.contains(musica)) {
				musicaseartistas.add("Musica: " + thismusica + "•" + "Artista: " + musicas.get(i).getArtista() + "\n");
			}
		}
		if(musicaseartistas.size() == 0) {
			return "Musica não encontrada!";
		}
		
		return musicaseartistas.toString();
	}
	
	//PROCURAR MUSICAS DE UM ARTISTA POR NOME SOLICITADO PELO USUÁRIO, NÃO NECESSARIAMENTE O NOME EXATO.
	public ArrayList<String> procurarMusicasDeUmArtista(ArrayList<Musicas> musicas, String artista) {
		ArrayList<String> linhas = fm.readAll("musicas.txt");
		ArrayList<String> musics = new ArrayList<String>();
		int posicao = 0;
		for (String linha : linhas) {
			String[] parameters = linha.split("#");
			if (parameters[1].equals(artista)) {
				Musicas m = new Musicas(parameters[0], parameters[1]);
				posicao = musics.size() + 1;
				musics.add("musica " + posicao + ": " + m.getMusica() + "\n");
			}
			
		}
		return  musics;
	}
}
