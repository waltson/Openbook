package br.com.Openbook.dados;

import java.util.List;

import br.com.Openbook.negocio.Cliente;
import br.com.Openbook.negocio.Conexao;
import br.com.Openbook.negocio.IRepositorioCliente;
import br.com.Openbook.negocio.Livro;

public class RepositorioCliente_Banco_de_Dados implements IRepositorioCliente {

	private Conexao con;

	public RepositorioCliente_Banco_de_Dados() {
		con = new Conexao();
		con.openDB("Openbook.sqlite");

	}

	@Override
	public List<Cliente> pesquisarCliente(String cpf) throws Exception {
		// TODO Auto-generated method stub
		boolean retorno = false;

		return null;
	}

	@Override
	public void cadastrarCliente(Cliente novoCliente) throws Exception {
		// TODO Auto-generated method stub
		String sql = "";
		sql = "INSERT INTO Openbook.Cliente("
				+ "nome,endereco,bairro,cidade,estado,cep,telefone,cpf,sexo)"
				+ "VALEUS(" + ClienteInfo(novoCliente) + ");";

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
		saida.append("'" + cliente.getSexo() + "',");
		return saida.toString();

	}

	@Override
	public boolean existeCliente(String cpf) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void atualizarCliente(Cliente cliente) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluirCliente(String cpf) throws Exception {
		// TODO Auto-generated method stub

	}

}
