package view;

import javax.swing.JOptionPane;

import model.Artista;

public class MenssagensView {
	
	//MENSAGENS DO MENU DE OPÇÕES
		public String consultaView() {
			String opcao = JOptionPane
					.showInputDialog("Digite o que deseja fazer:\n" + 
			"1.Listar todas as musicas de um artista\n"+ 
			"2.Buscar musica por nome\n" + 
			"3.Buscar musicas\n" + 
			"4.Listar todos os Artistas\n" + 
			"0. Voltar para o menu principal");

			return opcao;
		}
		public String perguntarQualMusica() {
			String artista = JOptionPane.showInputDialog("Foram encontradas mais de uma musica com esse nome.\n" + "Digite o nome do artista para sabermos qual musica deseja excluir:");
			if(artista == null){
				return null;
			}
			if (artista.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Digite um nome!");
					return perguntarQualMusica();
				}
			
			return artista;
		}

		//CONFIRMAÇÃO COM USUÁRIO SE REALMENTE DESEJA FINALIZAR O PROGRAMA.
		public String perguntarSeQuerSair() {

			String Do = JOptionPane.showInputDialog("Tem certeza que deseja sair do programa?" + "\n"
					+ "Digite 1 para sair, 2 para voltar para o programa.");
			return Do;
		}

		//CONFIRMAÇÃO SE REALEMNTE O USUÁRIO DESEJA EXCLUIR ALGUMA INFORMAÇÃO.
		public String perguntarTipoExclusao() {
			return JOptionPane.showInputDialog(
					"1.Para excluir um artista\n" + 
					"2.Para excluir uma musica\n" + 
					"0.Para voltar para o menu principal");
		}

	////MENSAGENS DE INFORMAÇÃO AO USUÁRIO QUANDO A OPERAÇÃO NÃO FOI REAIZADA COM SUCESSO.
	public void erroArtistaJaCadastrado() {
		JOptionPane.showMessageDialog(null, "Um artista com esse nome ja foi registrado!" + "\n"
				+ "Registre-o com um nome diferente ou confira se e o mesmo que já foi registrado!");
	}

	public void erroCpfEmUso() {
		JOptionPane.showMessageDialog(null, "Um artista com esse numero de cpf ja foi registrado!" + "\n"
				+ "Registre-o com um cpf diferente ou confira se esta tentando registrar o mesmo artista novamente!");
	}

	public void erroArtistaNaoEncontrado() {
		JOptionPane.showMessageDialog(null, "Artista nao encontrado!" + "\n"
				+ "Digite o nome do artista corretamente ou confira se o mesmo precisa ser registrado!");
	}

	public void erroArtistaNaoAdicionado() {
		JOptionPane.showMessageDialog(null, "Artista nao adicionado!");
	}

	public void erroOpcaoMenu() {
		JOptionPane.showMessageDialog(null, "Opicao invalida!" + "\n" + "Digite apenas numeros de 0 a 4.");
	}

	public void erroOpcaoArtista() {
		JOptionPane.showMessageDialog(null, "Opcao invalida!" + "\n" + "Digite apenas numeros de 0 a 5.");
	}

	public void erroCpfInvalido() {
		JOptionPane.showMessageDialog(null, "Cpf invalido!" + "\n" + "Digite apenas numeros, exatamente 11 numeros!");
	}

	public void erroOpcaoSairInvalida() {
		JOptionPane.showMessageDialog(null,
				"Opcao invalida!" + "\n" + "Digite apenas 1 para sair ou 2 para permanecer no programa!");
	}

	public void erroOpcaoConsulta() {
		JOptionPane.showMessageDialog(null, "Digite apenas opcoes entre 0 e 4");
	}

	public void erroOpcaoConfirmarInvalida() {
		JOptionPane.showMessageDialog(null, "Opcao invalida!" + "\n" + "Digite apenas 1 ou 2!");
	}

	public void erroArtistaNaoCadastrado() {
		JOptionPane.showMessageDialog(null, "ERRO!\n"
				+ "Digite o nome do artista corretamente, ou cadastre-o antes de adicionar uma musica para ele");
	}

	public void erroMusicaJaCadastrada() {
		JOptionPane.showMessageDialog(null, "Essa musica já foi cadastrada!");
	}

	public void erroMusicaNaoEncontrada() {
		JOptionPane.showMessageDialog(null, "Musica nao encontrada!");

	}
	public void erroMusicaNaoExcluida() {
		JOptionPane.showMessageDialog(null, "Musica não excluida!");
		
	}
	public void erroOpcaoExcluirInvalida() {
		JOptionPane.showMessageDialog(null, "Digite apenas opcoes validas!");
	}

	//MENSAGENS DE INFORMAÇÃO AO USUÁRIO QUANDO A OPERAÇÃO FOI REAIZADA COM SUCESSO.
	public void artistaRegistrado() {
		JOptionPane.showMessageDialog(null, "Artista registrado!");
	}

	public void artistaAdicionado(Artista artista) {
		JOptionPane.showMessageDialog(null, "O artista " + artista.getName() + " foi adicionado no sistema!");
	}

	public void musicaRegistrada() {
		JOptionPane.showMessageDialog(null, "Musica adicionada!");

	}

	public void musicaExcluida() {
		JOptionPane.showMessageDialog(null, "Musica excluida com sucesso!");
		
	}

	public void artistaExcluido() {
		JOptionPane.showMessageDialog(null, "Artista excluido com sucesso!");
		
	}

}
