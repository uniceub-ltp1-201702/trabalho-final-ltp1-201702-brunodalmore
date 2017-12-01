package model;


public class Musicas {
	private String musica;
	private String artista;

	public Musicas(String musica, String artista) {
		this.artista = artista;
		this.musica = musica;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}
	
	public String stringToFile() {
		return  this.musica + "#"
				+this.artista;
	}
	
}
