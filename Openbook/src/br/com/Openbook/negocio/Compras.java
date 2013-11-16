package br.com.Openbook.negocio;

import java.util.HashMap;
import java.util.Map;

public class Compras {

	private int idCliente;
	private Map<String, Integer> compras;

	public Compras(int idCliente) {
		super();
		this.idCliente = idCliente;
	}

	public Compras() {
		compras = new HashMap<>();
	}

	public void addLivro(String nome, int id) {
		compras.put(nome, id);
	}

	public void removerLivro(String key) {
		compras.remove(key);
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;

	}

	public int getIdCliente() {
		return idCliente;
	}

	public int[] getLivroIds() {
		int array[] = new int[compras.size()];
		int i = 0;
		for (Object name : compras.keySet()) {
			array[i++] = (int) compras.get(name);

		}
		return array;
	}

	public String toString() {
		StringBuilder out = new StringBuilder();
		for (Object name : compras.keySet()) {
			out.append(String.format("Cliente Id: [%s] = Livro Id: %s",
					name.toString(), compras.get(name).toString()));
		}
		return out.toString();

	}

	public String[] getCampos() {
		String campos[] = { "id_compras", "id_cliente", "nome",
				"titulo_original", "titulo_traduzido" };
		return campos;

	}

}
