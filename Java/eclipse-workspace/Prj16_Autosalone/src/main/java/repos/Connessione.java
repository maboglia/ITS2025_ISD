package repos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final String HOST = "jdbc:mysql://localhost:3306/esercitazioni";
	private final String USER = "ITS_2025";
	private final String PASS = "ITS_2025";
	
	private Connection conn;
	
	private void connetti() {
		try {
			this.conn = DriverManager.getConnection(HOST, USER, PASS);

		} catch (SQLException e) {
			System.err.println("NON CONNESSO AL DB: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Eccezione generica: " + e.getMessage());
		}
	}

	public Connection getConnessione() {
		
		if (conn == null) connetti();
		
		return conn;
	}
	
}
