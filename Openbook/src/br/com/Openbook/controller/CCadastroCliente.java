package br.com.Openbook.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.swing.table.DefaultTableModel;

import org.apache.log4j.Logger;

import br.com.Openbook.dados.RepositorioCliente_Banco_de_Dados;
import br.com.Openbook.negocio.Cliente;
import br.com.Openbook.negocio.Livro;
import br.com.Openbook.negocio.Util;
import br.com.Openbook.negocio.UtilGui;

public class CCadastroCliente {

	private static Logger Log = Logger.getLogger(CCadastroCliente.class);

	private RepositorioCliente_Banco_de_Dados conect;

	public CCadastroCliente() {
		conect = new RepositorioCliente_Banco_de_Dados();
	}

			public List<Cliente> pesquisarCliente(String cpf) throws Exception {
				// TODO Auto-generated method stub
				return null;
			}

			public boolean existeCliente(String cpf) throws Exception {
				return false;
			}

			public boolean cadastrarCliente(Cliente cliente) {
				Log.debug("Cadastro Cliente:\n" + cliente);
				boolean rs = false;

				try {
					conect.cadastrarCliente(cliente);
					rs = true;

				} catch (Exception e) {
					
					UtilGui.errorMessage("Erro ao Cadastar o Cliente: "+e.getMessage());
					Log.error("Erro ao Cadastrar o Cliente " + e.getMessage());

				}
				return rs;

			}

			public Map<String, String> getClienteInfoById(int codigoCliente) {
				
				Map<String,String> resultMap = null;
				
				ResultSet rs = (ResultSet) conect.pesquisaComRetorno(null,"Cliente_Livraria","id_Livro", String.valueOf(codigoCliente),false);
				
				try{
					resultMap = Util.getMapFromResultSet(rs);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					Log.error(e.getMessage());
				}
			
				return resultMap;
			}
			
			public DefaultTableModel procurarCliente( String coluna, String criterio, boolean withlike){
				
				ResultSet rs = (ResultSet) conect.pesquisaComRetorno(Cliente.getColunas(),"Livro_Livraria",coluna, criterio,withlike);
				DefaultTableModel model = null;
				
				try {
					model =  Util.buildTableModel(rs);
				} catch (SQLException e) {
					Log.error(e.getMessage());
				}
				
				return model;
			}
		
	}


