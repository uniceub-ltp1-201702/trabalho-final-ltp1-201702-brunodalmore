package model;

import java.util.ArrayList;

import util.DocumentReader;
import util.DocumentWriter;

public class BDSimulado {
	private ArrayList<Esporte> esportes;
	private ArrayList<Medalha> medalhas;
	private String fileEsporte = "esportes.txt";
	private String FileMedalha = "medalhas.txt";

	public BDSimulado() {

		this.esportes = new ArrayList<Esporte>();
		this.medalhas = new ArrayList<Medalha>();

		DocumentReader dr1 = new DocumentReader();
		DocumentReader dr2 = new DocumentReader();

		ArrayList<String> leitura1 = dr1.read(fileEsporte);
		ArrayList<String> leitura2 = dr2.read(FileMedalha);
		
		for (int i = 0; i < leitura1.size(); i++) {
			String[] linhaEsporte = leitura1.get(i).split(";");
			Esporte e = new Esporte(linhaEsporte[0], linhaEsporte[1]);
			this.esportes.add(e);
		}
		for (int i = 0; i < leitura2.size(); i++) {
			String[] linhaMedalha = leitura2.get(i).split(";");
			Medalha m = new Medalha(linhaMedalha[0], Integer.parseInt(linhaMedalha[1]),
					Integer.parseInt(linhaMedalha[2]), Integer.parseInt(linhaMedalha[3]),
					Integer.parseInt(linhaMedalha[4]));
			this.medalhas.add(m);
		}
	}

	public ArrayList<Esporte> getEsportes() {
		return esportes;
	}

	public ArrayList<Medalha> getMedalhas() {
		return medalhas;
	}

	public void gravarEsporte(Esporte e) {
		this.esportes.add(e);
		String esporte = e.getEsporte() + ";" + e.getModalidade();
		DocumentWriter dw = new DocumentWriter();
		dw.write(fileEsporte, esporte);
	}

}