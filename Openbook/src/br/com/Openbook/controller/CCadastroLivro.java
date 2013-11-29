package br.com.Openbook.controller;

import java.util.List;

import org.apache.log4j.Logger;

import br.com.Openbook.dados.RepositorioLivro_Banco_de_Dados;
import br.com.Openbook.negocio.Livro;

public class CCadastroLivro {

	private static Logger Log = Logger.getLogger(CCadastroLivro.class);
	
	private RepositorioLivro_Banco_de_Dados conect;
	
	public CCadastroLivro(){
		
		 conect = new RepositorioLivro_Banco_de_Dados ();
	}
	
	public List<Livro> pesquisarLivro(String nome) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean existeLivro(String nome) throws Exception {
		return false;
	}

	public boolean cadastrarLivro(Livro livro) {
		Log.debug("Cadastro livro:\n" + livro);
		boolean rs = false;

		try {
			conect.cadastrarLivro(livro);
			rs = true;

		} catch (Exception e) {
			Log.error("Erro ao Cadastrar o Livro " + e.getMessage());

		}
		return rs;

	}
}
