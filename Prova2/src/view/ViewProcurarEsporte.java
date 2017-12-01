package view;

import javax.swing.JOptionPane;

public class ViewProcurarEsporte {

	@SuppressWarnings("unused")
	public ViewProcurarEsporte(String esportes) {

		if (esportes != "") {
			JOptionPane.showMessageDialog(null, esportes);
			ViewPrincipal vp = new ViewPrincipal();
		} else {
			JOptionPane.showConfirmDialog(null, "Esporte não esta cadastrado!");
		}
	}

}
