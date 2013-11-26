package br.com.Openbook.dados;

import java.util.List;

import org.apache.log4j.Logger;

import br.com.Openbook.negocio.Conexao;
import br.com.Openbook.negocio.Livro;

public class RepositorioLivro_Banco_de_Dados {

	private static Logger Log = Logger.getLogger(RepositorioLivro_Banco_de_Dados.class);
	private Conexao conn;

	public RepositorioLivro_Banco_de_Dados() {
		conn = new Conexao();
		conn.openDB("Openbook.sqlite");

	}

	public boolean existeLivro(String cpf) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Livro> pesquisarLivro(String cpf) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void cadastrarLivro(Livro novoLivro) throws Exception {
		// TODO Auto-generated method stub
		String sql = "";
		sql = "INSERT INTO main.Livro_Livraria("
				+ "nome_Livro,isbn_Livro,edicao_Livro,idioma_Livro,n_pagina)"
				+ "VALEUS(" + LivroInfo(novoLivro) + ")";

		Log.debug(sql);
		conn.executeUpdate(sql);

	}

	private String LivroInfo(Livro livro) {
		StringBuilder saida = new StringBuilder();
		saida.append("'" + livro.getNomeLivro() + "',");
		saida.append("'" + livro.getIsbn() + "',");
		saida.append("'" + livro.getEdicao() + "',");
		saida.append("'" + livro.getIdioma() + "',");
		saida.append("'" + livro.getNumerosPaginas() + "'");

		return saida.toString();

	}

}
