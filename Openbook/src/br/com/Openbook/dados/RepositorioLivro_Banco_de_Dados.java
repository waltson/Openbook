package br.com.Openbook.dados;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import br.com.Openbook.negocio.Conexao;
import br.com.Openbook.negocio.Livro;

public class RepositorioLivro_Banco_de_Dados {

	private static Logger Log = Logger
			.getLogger(RepositorioLivro_Banco_de_Dados.class);
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
				+ "nome_Livro,isbn_Livro,edicao_Livro,genero_livro,idioma_Livro,n_pagina,preco_livro)"
				+ "VALUES(" + LivroInfo(novoLivro) + ")";

		Log.debug(sql);
		conn.executeUpdate(sql);

	}

	private String LivroInfo(Livro livro) {
		
		StringBuilder saida = new StringBuilder();
		saida.append("'" + livro.getNomeLivro() + "',");
		saida.append("'" + livro.getIsbn() + "',");
		saida.append("'" + livro.getEdicao() + "',");
		saida.append("'" + livro.getGenero() + "',");
		saida.append("'" + livro.getIdioma() + "',");
		saida.append("'" + livro.getNumerosPaginas() + "',");
		saida.append(livro.getPreco());

		return saida.toString();
	}

	public ResultSet pesquisaComRetorno(String exibirColunas[], String table, String coluna, String criterio, boolean withLike) {

		ResultSet rs = null;
		
		
		String sql ;
		
		
		if (exibirColunas == null)
			sql = "SELECT * FROM main."+table;
		else{
			
			sql = "SELECT ";
			
			for (int i = 0; i < exibirColunas.length ; i++){
				sql += exibirColunas[i];
				if(i+1 < exibirColunas.length )
					sql += ",";
			}
			
			sql+= " FROM main."+table;
				
		}
		
		if(!criterio.equals("")){
			if(withLike)
				sql += " WHERE "+coluna+" LIKE '%"+criterio+"%'";
			else
				sql += " WHERE "+coluna+" = '"+criterio+"'";
		}
		
		Log.debug("Sql: "+sql);
		
		 try {
			rs = conn.executeQuery(sql);
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Log.error(e.getMessage());
		}
		
		 return rs;
	}

}
