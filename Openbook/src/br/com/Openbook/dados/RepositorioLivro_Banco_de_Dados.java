package br.com.Openbook.dados;

import java.util.List;

import br.com.Openbook.negocio.Conexao;
import br.com.Openbook.negocio.IRepositorioLivro;
import br.com.Openbook.negocio.Livro;

public class RepositorioLivro_Banco_de_Dados implements IRepositorioLivro {

	private Conexao conn;

	public RepositorioLivro_Banco_de_Dados() {
		conn = new Conexao();
		conn.openDB("Openbook.sqlite");

	}

	@Override
	public boolean existeLivro(String cpf) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Livro> pesquisarLivro(String cpf) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cadastrarLivro(Livro novoLivro) throws Exception {
		// TODO Auto-generated method stub
		String sql = "";
		sql = "INSERT INTO Openboo.Livro("
				+ "nome_Livro,isbn_Livro,edicao_Livro,idioma_Livro,n_pagina)"
				+ "VALEUS(" +LivroInfo(novoLivro)+ ")";

		conn.executeUpdate(sql);

	}

	private String LivroInfo(Livro livro) {
		StringBuilder saida = new StringBuilder();
		saida.append("'" + livro.getNomeLivro() + "',");
		saida.append("'" + livro.getIsbn() + "',");
		saida.append("'" + livro.getEdicao() + "',");
		saida.append("'" + livro.getIdioma() + "',");
		saida.append("'" + livro.getNumerosPaginas() + "',");

		return saida.toString();

	}

	@Override
	public void atualizarLivro(Livro livro) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluirLivro(String cpf) throws Exception {
		// TODO Auto-generated method stub

	}

}
