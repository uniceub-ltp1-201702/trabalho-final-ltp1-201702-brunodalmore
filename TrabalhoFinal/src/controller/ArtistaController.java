package controller;


import bd.BancoDeDados;
import model.Artista;
import util.ManipuladorArquivo;
import util.Opcoes;
import util.Buscar;
import util.Validar;
import view.MenssagensView;
import view.ArtistaView;

public class ArtistaController {
	
	ArtistaView v = new ArtistaView();
	MenssagensView mv = new MenssagensView();
	Opcoes o = new Opcoes();
	Validar va = new Validar();
	Buscar s = new Buscar();
	ManipuladorArquivo fm = new ManipuladorArquivo();
	MusicasController mc = new MusicasController();
	
	//REGISTRA O ARTISTA DEPOIS DE CONFERIR SE ELE JA NAO ESTA REGISTRADO E NÃO DEIXA O USUÁRIO DEIXAR O CAMPO VAZIO.(JA CHAMA AS VALIDAÇOES PARA O CPF)
	public void registrarArtista() {
		BancoDeDados bd = new BancoDeDados();
		String nome = v.perguntarNome();
		if(nome == null){return;}
		String cpf = v.perguntarCpf();
		if(cpf == null){return;}
		if (va.validarArtista(bd.artistas, nome, cpf) == true) {
			Artista p = new Artista(null, null);
			p.setName(nome);
			p.setCpf(va.posicionarCpf(cpf));
			bd.adicionarArtista(p);
			mv.artistaRegistrado();
		} else {
			return;
		}

	}
	//CHAMA O MUSICA CONTROLLER PARA REGISTRAR UMA MUSICA
	public void adicionaMusica() {
		BancoDeDados bd = new BancoDeDados();
		Artista a = s.procurarArtistaPorNome(bd.artistas, v.perguntarNome());
		if (bd.artistas.contains(a)) {
			mc.registrarMusica(a);
		} else {
			mv.erroArtistaNaoCadastrado();
		}
	}
}
