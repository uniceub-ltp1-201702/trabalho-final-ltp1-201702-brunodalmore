package view;

import javax.swing.JOptionPane;

import util.Opcoes;
import util.Validar;

public class ArtistaView {

	MenssagensView mv = new MenssagensView();
	Validar va = new Validar();
	Opcoes o = new Opcoes();

	public String perguntarNome() {

		String name = JOptionPane.showInputDialog("Digite o nome do artista:");
		if(name == null){
			return null;
		}
		if (name.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Digite um nome!");
				return perguntarNome();
			}
		
		return name;
	}

	public String perguntarCpf() {

		String cpf = JOptionPane.showInputDialog("Digite o cpf do artista:");

		return cpf;
	}
	
	//SOLICITAR UMA AÇÃO AO USUÁRIO 
public String perguntarOqueFazer() {
		
		String ok = JOptionPane.showInputDialog("Opcoes do artista:" + "\n" + "Digite a opcao que deseja fazer:" + "\n" + 
		"1.Para adicionar uma musica para o artista\n" + 
		"2.Ver musicas do artista\n" + 
		"3.Remover musicas de um artista");
		
		return ok;
	}

}
