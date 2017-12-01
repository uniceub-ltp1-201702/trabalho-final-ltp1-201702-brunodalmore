package view;

import javax.swing.JOptionPane;

public class ViewSolicitarEsporte {

	private String esporte;

	public ViewSolicitarEsporte() {

		esporte = JOptionPane.showInputDialog("Digite o nome do Esporte?");
	}

	public String getEsporte() {
		return esporte;
	}
}
