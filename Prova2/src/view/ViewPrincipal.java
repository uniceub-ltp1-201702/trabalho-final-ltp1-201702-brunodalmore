package view;

import javax.swing.JOptionPane;

public class ViewPrincipal {
	private String opcao;
	
	public String getOpcao() {

		this.opcao = JOptionPane.showInputDialog("\t" + "<<<< Estolha uma opção >>>>\n" + 
		" 1 - Busca Modalidade: \n"+ 
		" 2 - Diferença de medalhas dos Estados Unidos\n" + 
		" 3 - Diferença de medalhas dos paises\n" + 
		" 4 - Pesquisar os paises MERCOSUL\n" + 
		" 5 - Procurar modalidade por nome\n" + 
		" 6 - Cadastrar esporte no sistemas\n" + 
		" 7 - Exit\n");
		return this.opcao;
	}

}
