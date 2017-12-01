package model;


public class Artista {
	private String nome;
	private String cpf;
	
	
	public Artista(String name, String cpf) {
		this.nome = name;
		this.cpf = cpf;
	}
	public Artista() {
		
	}
	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString(){
		String artista = "Nome: " + this.nome + " || " + " Cpf: " + this.cpf;
		String line = "\n";
		return artista + line;
	}
	
	public String stringToFile() {
		return  this.nome        + "#" 
	          + this.cpf;
	}
}
