package bd;

import java.util.ArrayList;
import model.Artista;
import model.Musicas;
import util.ManipuladorArquivo;

public class BancoDeDados {
	
	//ARRAYLIST DE ARTISTA E MUSICA
	private ManipuladorArquivo fm;
	public ArrayList<Artista> artistas;
	public ArrayList<Musicas> musicas;

	public BancoDeDados() {
		artistas = new ArrayList<Artista>();
		musicas = new ArrayList<Musicas>();
		fm = new ManipuladorArquivo();
		populateArtista();
		populateMusicas();
	}

	//FUN플O PARA ADICIONAR INFOMA합ES DE MUSICA E ARTISTA NO BANCO DE DADOS.
	public void adicionarArtista(Artista p) {
		artistas.add(p);
		fm.write("artistas.txt", p.stringToFile(), true);
	}

	public void adicionarMusica(Musicas m) {
		musicas.add(m);
		fm.write("musicas.txt", m.stringToFile(), true);
	}
		
	//FUN플O PARA REALIZAR ALTERA플O NO BANCO DE DADOS, CASO A INFORMA플O TENHA NO ARRAYLIST E N홒 CONTENHA NO BANCO DE DADOS REALIZAR A ATULIZA플O DA INFORMA플O.
	public void excluirMusica(Musicas m) {
		musicas.remove(m);
		fm.ApagarTudoDoArquivo("musicas.txt");
		for (Musicas musics : musicas) {
			fm.write("musicas.txt", musics.stringToFile(), true);
		}
	}
	public void excluirArtista(Artista a) {
		artistas.remove(a);
		fm.ApagarTudoDoArquivo("artistas.txt");
		for (Artista artista : artistas) {
			fm.write("artistas.txt", artista.stringToFile(), true);
		}
		for (int i = 0; i < musicas.size(); i++) {
			try {
			while(musicas.get(i).getArtista().equals(a.getName())) {
				excluirMusica(musicas.get(i));
			}
			}catch (IndexOutOfBoundsException e) {
				
			}
		}
	}
	
	//PREENCHE O ARRAYLIST DE ARTISTAS COM OS ARTISTAS DO ARQUIVO
	private void populateArtista() {
		ArrayList<String> artistas = fm.readAll("artistas.txt");
		for (String artista : artistas) {
			String[] parameters = artista.split("#");

			Artista p = new Artista(parameters[0], parameters[1]);

			this.artistas.add(p);

		}
	}
	
	//PREENCHE O ARRAYLIST DE MUSICAS COM AS MUSICAS DO ARQUIVO
	private void populateMusicas() {
		ArrayList<String> musicas = fm.readAll("musicas.txt");
		for (String musica : musicas) {
			String[] parameters = musica.split("#");

			Musicas m = new Musicas(parameters[0], parameters[1]);

			this.musicas.add(m);

		}
	}

}
