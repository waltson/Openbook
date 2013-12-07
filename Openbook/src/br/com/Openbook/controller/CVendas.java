package br.com.Openbook.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.apache.log4j.Logger;

import br.com.Openbook.dados.RepositorioVendaBD;
import br.com.Openbook.negocio.Util;
import br.com.Openbook.negocio.UtilGui;
import br.com.Openbook.negocio.Vendas;

public class CVendas {

	private static Logger Log = Logger.getLogger(CVendas.class);
	private RepositorioVendaBD conect;

	public CVendas() {
		conect = new RepositorioVendaBD();

	}

	public Map<String, String> getClienteInfoById(int parseInt) {

		Map<String, String> resultMap = null;

		ResultSet rs = (ResultSet) conect.pesquisaComRetorno("clientes",
				"id_cliente", String.valueOf(parseInt), false);

		try {
			resultMap = Util.getMapFromResultSet(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Log.error(e.getMessage());
		}

		return resultMap;

	}

	public Map<String, String> getFilmeInfoById(int parseInt) {
		Map<String, String> resultMap = null;

		ResultSet rs = (ResultSet) conect.pesquisaComRetorno("filmes",
				"id_filme", String.valueOf(parseInt), false);

		try {
			resultMap = Util.getMapFromResultSet(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Log.error(e.getMessage());
		}

		return resultMap;
	}

	public boolean cadastrarTransacao(Vendas vendas) {

		Log.debug("Cadastrando Transação:" + vendas);

		boolean res = false;

		try {
			conect.cadastrarTransacao(vendas);
			res = true;
		} catch (Exception e) {
			Log.error("Erro ao cadastrar cliente: " + e.getMessage());
			UtilGui.errorMessage("Erro ao cadastrar cliente: " + e.getMessage());
		}

		return res;
	}
}
