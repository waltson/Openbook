package br.com.Openbook.dados;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import br.com.Openbook.negocio.Cliente;
import br.com.Openbook.negocio.Conexao;
import br.com.Openbook.negocio.Livro;

public class RepositorioCliente_Banco_de_Dados{

	private static Logger Log = Logger.getLogger(RepositorioCliente_Banco_de_Dados.class);
	private Conexao con;

	public RepositorioCliente_Banco_de_Dados() {
		con = new Conexao();
		con.openDB("Openbook.sqlite");

	}

	public List<Cliente> pesquisarCliente(String cpf) throws Exception {

		// TODO Auto-generated method stub
		
		
		
		
		boolean retorno = false;

		return null;
	}

	public void cadastrarCliente(Cliente cliente) throws SQLException {
		// TODO Auto-generated method stub
		
		
		String sql = "";
		sql = "INSERT INTO main.Cliente_Livraria("
				+ "nome,endereco,bairro,cidade,estado,cep,telefone,cpf,sexo)"
				+ "VALUES(" + ClienteInfo(cliente) + ")";

		Log.debug(sql);
		con.executeUpdate(sql);

	}

	private String ClienteInfo(Cliente cliente) {
		StringBuilder saida = new StringBuilder();
		saida.append("'" + cliente.getNome() + "',");
		saida.append("'" + cliente.getEndereco() + "',");
		saida.append("'" + cliente.getBairro() + "',");
		saida.append("'" + cliente.getCidade() + "',");
		saida.append("'" + cliente.getEstado() + "',");
		saida.append("'" + cliente.getCep() + "',");
		saida.append("'" + cliente.getTel() + "',");
		saida.append("'" + cliente.getCpf() + "',");
		saida.append("'" + cliente.getSexo() + "'");
		return saida.toString();

	}

	public boolean existeCliente(String cpf) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	
	protected void finalize() throws Throwable {
		con.closeDB();
		super.finalize();
	}

}
