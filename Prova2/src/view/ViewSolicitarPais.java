package view;

import javax.swing.JOptionPane;

public class ViewSolicitarPais {
	
	private String pais;

	public ViewSolicitarPais() {
		pais = JOptionPane.showInputDialog("Digite o nome do Pais?");
	}

	public String getPais() {
		return pais;
	}

}
