package br.com.Openbook.dados;

import java.util.List;

import br.com.Openbook.negocio.IRepositorioLivro;
import br.com.Openbook.negocio.Livro;

public class RepositorioLivro_Banco_de_Dados implements IRepositorioLivro {

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
