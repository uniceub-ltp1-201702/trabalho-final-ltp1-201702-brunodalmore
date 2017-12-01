package model;

public class Medalha {

	private String pais;
	private int QtdMedalhaOuro;
	private int QtdMedalhaPrata;
	private int QtdMedalhaBronze;
	private int Ranking;
	
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getQtdMedalhaOuro() {
		return QtdMedalhaOuro;
	}

	public void setQtdMedalhaOuro(int qtdMedalhaOuro) {
		QtdMedalhaOuro = qtdMedalhaOuro;
	}

	public int getQtdMedalhaPrata() {
		return QtdMedalhaPrata;
	}

	public void setQtdMedalhaPrata(int qtdMedalhaPrata) {
		QtdMedalhaPrata = qtdMedalhaPrata;
	}

	public int getQtdMedalhaBronze() {
		return QtdMedalhaBronze;
	}

	public void setQtdMedalhaBronze(int qtdMedalhaBronze) {
		QtdMedalhaBronze = qtdMedalhaBronze;
	}

	public int getRanking() {
		return Ranking;
	}

	public void setRanking(int ranking) {
		Ranking = ranking;
	}

	public String toString() {
		return "<<< Quadro de Medalhas >>> \nPaís: " + pais + " - Qtd Melhas de Ouro: " + QtdMedalhaOuro
				+ " - Qtd Melhas de Prata: " + QtdMedalhaPrata + " - Qtd Melhas de Bronze: " + QtdMedalhaBronze + "- Classificacao: "
				+ Ranking;
	}

	public Medalha(String pais, int qtdMedalhaOuro, int qtdMedalhaPrata, int qtdMedalhaBronze, int ranking) {
		super();
		this.pais = pais;
		QtdMedalhaOuro = qtdMedalhaOuro;
		QtdMedalhaPrata = qtdMedalhaPrata;
		QtdMedalhaBronze = qtdMedalhaBronze;
		Ranking = ranking;

	}
}
