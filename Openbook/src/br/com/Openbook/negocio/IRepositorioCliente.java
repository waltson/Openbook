package br.com.Openbook.negocio;

import java.util.List;


public interface IRepositorioCliente {

	
	public boolean existeCliente(String cpf) throws Exception;

	public List<Cliente> pesquisarCliente(String cpf) throws Exception;

	public void cadastrarCliente(Cliente novoCliente) throws Exception;

	public void atualizarCliente(Cliente cliente) throws Exception;

	public void excluirCliente(String cpf) throws Exception;

}
