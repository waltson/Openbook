package br.com.Openbook.negocio;

import java.util.HashMap;
import java.util.Map;

public class Vendas {

	private int idCliente;
	private Map<String, Integer> transacoes;

	public Vendas(int idCliente) {
		super();
		this.idCliente = idCliente;
	}

	public Vendas() {
		transacoes = new HashMap<>();
		// TODO Auto-generated constructor stub
	}

	public void addLivro(String nome, int id) {
		transacoes.put(nome, id);

	}

	public void removeLivro(String key) {
		transacoes.remove(key);
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public int[] getLivrosIds() {

		int array[] = new int[transacoes.size()];
		int i = 0;
		for (Object name : transacoes.keySet()) {
			array[i++] = (int) transacoes.get(name);
		}

		return array;
	}

	@Override
	public String toString() {

		StringBuilder out = new StringBuilder();
		for (Object name : transacoes.keySet()) {
			out.append(String.format("Cliente Id: [%s] = Filme Id: %s",
					name.toString(), transacoes.get(name).toString()));
		}

		return out.toString();
	}

	public String[] getCampos() {
		String campos[] = { "id_transacao", "id_cliente", "nome",
				"titulo_original", "titulo_traduzido", "data" };
		return campos;
	}

}
