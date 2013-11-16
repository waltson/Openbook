package br.com.Openbook.dados;

import java.util.List;

import br.com.Openbook.negocio.Cliente;
import br.com.Openbook.negocio.IRepositorioCliente;

public class RepositorioCliente_Banco_de_Dados implements IRepositorioCliente {

	@Override
	public boolean existeCliente(String cpf) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Cliente> pesquisarCliente(String cpf) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cadastrarCliente(Cliente novoCliente) throws Exception {
		// TODO Auto-generated method stub
		
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
