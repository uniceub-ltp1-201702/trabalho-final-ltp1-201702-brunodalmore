package util;

import bd.BancoDeDados;
import view.MenssagensView;

public class Opcoes {
	MenssagensView mv = new MenssagensView();
	BancoDeDados db = new BancoDeDados();

	//VALIDAR DIGITACOES DE OPCOES DO USUARIO
	public Boolean validarOpcaoMenu(String numero) {

		try {
			int i = Integer.parseInt(numero);
			if(numero.length() > 1) {
				mv.erroOpcaoMenu();
				return false;
			}	
			if (i >= 5) {
				mv.erroOpcaoMenu();
				return false;
			}
			if (i < 0) {
				mv.erroOpcaoMenu();
				return false;
			}
		} catch (NumberFormatException ex) {
			mv.erroOpcaoMenu();
			return false;
		}
		return true;
	}
	public Boolean validarOpcaoConsulta(String opcao) {
		try {
			int i = Integer.parseInt(opcao);
			if(opcao.length() > 1) {
				mv.erroOpcaoConsulta();
				return false;
			}
			if (i > 4) {
				mv.erroOpcaoConsulta();
				return false;
			}
			if (i < 0) {
				mv.erroOpcaoConsulta();
				return false;
			}
		} catch (NumberFormatException e) {
			mv.erroOpcaoConsulta();
			return false;
		}

		return true;

	}

	

	public Boolean validarOpcaoSaida(String sair) {
		try {
			int i = Integer.parseInt(sair);
			if(sair.length() > 1) {
				mv.erroOpcaoSairInvalida();
				return false;
			}
			if (i > 2) {
				mv.erroOpcaoSairInvalida();
				return false;
			}
			if (i <= 0) {
				mv.erroOpcaoSairInvalida();
				return false;
			}
		} catch (NumberFormatException e) {
			mv.erroOpcaoSairInvalida();
			return false;
		}

		return true;

	}

	public Boolean validarConfirmacoes(String confirmacao) {

		try {
			int i = Integer.parseInt(confirmacao);
			if (i > 2) {
				mv.erroOpcaoConfirmarInvalida();
				return false;
			}
			if (i <= 0) {
				mv.erroOpcaoConfirmarInvalida();
				return false;
			}
		} catch (NumberFormatException e) {
			mv.erroOpcaoConfirmarInvalida();
			return false;
		}

		return true;

	}
	public Boolean validarOpcaoExclusao(String exclusao) {

		try {
			int i = Integer.parseInt(exclusao);
			if(exclusao.length() > 1) {
				mv.erroOpcaoExcluirInvalida();
				return false;
			}
			if (i > 2) {
				mv.erroOpcaoExcluirInvalida();
				return false;
			}
			if (i < 0) {
				mv.erroOpcaoExcluirInvalida();
				return false;
			}
		} catch (NumberFormatException e) {
			mv.erroOpcaoExcluirInvalida();
			return false;
		}

		return true;

	}

}
