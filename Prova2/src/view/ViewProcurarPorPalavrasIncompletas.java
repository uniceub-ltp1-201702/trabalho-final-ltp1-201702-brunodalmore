package view;

import javax.swing.JOptionPane;

public class ViewProcurarPorPalavrasIncompletas {
	private String nome;

	public ViewProcurarPorPalavrasIncompletas() {
		nome = JOptionPane.showInputDialog("Digite alguma palavra para realizar a busca:");
	}

	public String getNome() {
		return nome;
	}
}
