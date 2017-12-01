package view;

import javax.swing.JOptionPane;

public class ViewSolicitarModalidade {
	
	private String modalidade;

	public ViewSolicitarModalidade() {

		modalidade = JOptionPane.showInputDialog("Sigite o nome do Modalidade?");
	}

	public String getModalidade() {
		return modalidade;
	}

}
