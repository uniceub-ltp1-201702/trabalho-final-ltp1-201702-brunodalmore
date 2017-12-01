package view;

import javax.swing.JOptionPane;
import controller.ArtistaController;
import controller.ConsultaController;
import util.Excluir;
import util.Opcoes;

public class MainView {
	ArtistaController c = new ArtistaController();
	ArtistaView v = new ArtistaView();
	MenssagensView mv = new MenssagensView();
	Opcoes o = new Opcoes();
	ConsultaController cc = new ConsultaController();
	Excluir e = new Excluir();
	public void mainView() {
		
		//MENU PRINCIPAL
		String numero = JOptionPane.showInputDialog("MENU:" + "\n" + "Digite o numero com a opcao que deseja fazer:"
				+ "\n" + 
				"1.Para registrar o artista." + "\n" + 
				"2.Fazer uma consulta." + "\n"+ 
				"3.Adicionar musicas para um artista." + "\n" + 
				"4.Excluir Artista/Musica." + "\n" + 
				"0.Para sair.");
		
		//VERIFICAR SE A INFORMÇÃO QUE O USUÁRIO DIGITOU E VALIDA COM OS OPÇÕES OFERECIDAS.
		if (numero != null) {
			Boolean b = o.validarOpcaoMenu(numero);
			if (b.equals(false)) {
				this.mainView();
			}
			if (numero.equals("1")) {
				c.registrarArtista();
				this.mainView();
			}
			if (numero.equals("2")) {
				cc.consulta();
				this.mainView();
			}
			if (numero.equals("3")) {
				c.adicionaMusica();
				this.mainView();
			}
			if(numero.equals("4")) {
				e.redirecionarExclusao();
				this.mainView();
			}
			if (numero.equals("0")) {
				String sair = mv.perguntarSeQuerSair();
				if (sair != null) {
					boolean bo = o.validarOpcaoSaida(sair);
					if (bo == false) {
						this.mainView();
					}
					if (sair.equals("1")) {
						return;
					}
					if (sair.equals("2")) {
						this.mainView();
					}
				}else {
					this.mainView();
				}
			}
		}
	}
}
