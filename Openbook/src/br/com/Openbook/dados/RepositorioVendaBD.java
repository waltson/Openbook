package br.com.Openbook.dados;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import br.com.Openbook.negocio.Conexao;
import br.com.Openbook.negocio.Vendas;

public class RepositorioVendaBD {

	private static Logger Log = Logger.getLogger(RepositorioVendaBD.class);
	private Conexao conect;

	public RepositorioVendaBD() {
		conect = new Conexao();
		conect.openDB("Openbook.sqlite");

	}

	public void cadastrarTransacao(Vendas vendas) throws SQLException {

		String sql = "";

		int livrosIds[] = vendas.getLivrosIds();
		int idCliente = vendas.getIdCliente();

		for (int i = 0; i < livrosIds.length; i++) {
			sql = "INSERT INTO main.transacoes(id_cliente,id_livro) "
					+ "VALUES (" + idCliente + "," + livrosIds[i] + ")";

			Log.debug("Sql: " + sql);

			conect.executeUpdate(sql);
		}

	}

	public ResultSet pesquisaComRetorno(String table, String coluna,
			String criterio, boolean wihtlike) {
		// TODO Auto-generated method stub

		ResultSet rs = null;
		String sql = "SELECT * FROM main." + table;
		if (!criterio.equals("")) {
			if (wihtlike)
				sql += " WHERE " + coluna + " LIKE '%" + criterio + "%'";
			else
				sql += " WHERE " + coluna + " = '" + criterio + "'";
		}

		Log.debug("Sql: " + sql);

		try {
			rs = conect.executeQuery(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Log.error(e.getMessage());
		}

		return rs;
	}
}
