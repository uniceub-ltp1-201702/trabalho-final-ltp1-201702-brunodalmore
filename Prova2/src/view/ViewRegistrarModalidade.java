package view;
import javax.swing.JOptionPane;

public class ViewRegistrarModalidade {
	private int validador;

	public ViewRegistrarModalidade() {

		validador = Integer.parseInt(JOptionPane.showInputDialog("Solicitar o registro de outra modalidade?\n 1 - Registrar\n 2 - Voltar menu principal"));
	}
	public int getValidador() {
		return validador;
	}
}
