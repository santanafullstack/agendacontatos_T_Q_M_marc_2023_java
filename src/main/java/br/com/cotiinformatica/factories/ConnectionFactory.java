package br.com.cotiinformatica.factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	// m�todo para abrir conex�o com um banco de dados do PostGreSQL
	public Connection getConnection() throws Exception {

		// par�metros de conex�o
		String driver = "org.postgresql.Driver";
		String host = "jdbc:postgresql://localhost:5432/bd3_agendacontatos";
		String user = "postgres";
		String password = "coti";

		Class.forName(driver);
		return DriverManager.getConnection(host, user, password);
	}
}
