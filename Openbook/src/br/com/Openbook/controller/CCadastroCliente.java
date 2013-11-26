package br.com.Openbook.controller;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import br.com.Openbook.dados.RepositorioCliente_Banco_de_Dados;
import br.com.Openbook.negocio.Cliente;
import br.com.Openbook.negocio.Conexao;

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
					Log.error("Erro ao Cadastrar o Cliente " + e.getMessage());

				}
				return rs;

			}

		
	}


