package br.com.Openbook.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.swing.table.DefaultTableModel;

import org.apache.log4j.Logger;

import br.com.Openbook.dados.RepositorioLivro_Banco_de_Dados;
import br.com.Openbook.negocio.Livro;
import br.com.Openbook.negocio.Util;

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

	public Map<String, String> getLivroInfoById(int codigoLivro) {
		
		Map<String,String> resultMap = null;
		
		ResultSet rs = (ResultSet) conect.pesquisaComRetorno(null,"Livro_Livraria","id_Livro", String.valueOf(codigoLivro),false);
		
		try{
			resultMap = Util.getMapFromResultSet(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Log.error(e.getMessage());
		}
	
		return resultMap;
	}
	
	public DefaultTableModel procurarLivro( String coluna, String criterio, boolean withlike){
		
		ResultSet rs = (ResultSet) conect.pesquisaComRetorno(Livro.getColunas(),"Livro_Livraria",coluna, criterio,withlike);
		DefaultTableModel model = null;
		
		try {
			model =  Util.buildTableModel(rs);
		} catch (SQLException e) {
			Log.error(e.getMessage());
		}
		
		return model;
	}
}
