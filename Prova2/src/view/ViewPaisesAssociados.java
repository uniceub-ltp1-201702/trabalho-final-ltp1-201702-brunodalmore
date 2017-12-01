package view;

import javax.swing.JOptionPane;

public class ViewPaisesAssociados {
	
	private int validador;

	public ViewPaisesAssociados() {

		validador = Integer.parseInt(JOptionPane.showInputDialog("Deseja visualizar a lista de Paises Associados: \n 1 - Sim desejo visualizar?\n 2 - Não Voltar ao menu principal."));
	}

	public int getValidador() {
		return validador;
	}


}
