package br.com.Openbook.negocio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {

	private Connection c = null;
	private Statement stmt = null;

	public boolean openDB() {
		return openDB("Openbook.sqlite");
	}

	public boolean openDB(String dbname) {

		try {

			Class.forName("org.sqlite.JDBC");

			c = DriverManager.getConnection("jdbc:sqlite:" + dbname);

			stmt = c.createStatement();
			return true;

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}

		return false;
	}

	public void closeDB() {

		try {
			stmt.close();
			c.close();
		} catch (SQLException e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}

	}

	public void executeUpdate(String sql) throws SQLException {
		stmt.executeUpdate(sql);

	}

	public ResultSet executeQuery(String sql) throws SQLException {
		return stmt.executeQuery(sql);
	}

}
