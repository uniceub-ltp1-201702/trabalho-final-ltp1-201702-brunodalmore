package view;

import javax.swing.JOptionPane;

public class ViewDiferençaPaises {
	public ViewDiferençaPaises(String diferenca) {

		if (diferenca != "") {
			JOptionPane.showMessageDialog(null, diferenca);
		} else {
			JOptionPane.showMessageDialog(null, "País não encontrado");
		}
	}
}
