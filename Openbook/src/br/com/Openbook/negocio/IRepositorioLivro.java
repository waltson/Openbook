package br.com.Openbook.negocio;

import java.util.List;


public interface IRepositorioLivro {

	public boolean existeLivro(String cpf) throws Exception;

	public List<Livro> pesquisarLivro(String cpf) throws Exception;

	public void cadastrarLivro(Livro novoLivro) throws Exception;

	public void atualizarLivro(Livro livro) throws Exception;

	public void excluirLivro(String cpf) throws Exception;

}
