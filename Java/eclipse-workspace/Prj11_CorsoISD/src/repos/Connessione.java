package repos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final String DB = "fondamenti";
	private final String HOST = "jdbc:mysql://localhost:3306/" + DB;
	private final String USER = "ITS_2025";
	private final String PASS = "ITS_2025";
	
	private Connection conn = null;
	
	private void connetti() {
		try {
			this.conn = DriverManager.getConnection(HOST, USER, PASS);
			System.out.println("Sei connesso al DB");
		} catch (SQLException e) {
			System.err.println("Errore nella connessione al DB");
			System.err.println("Il messaggio SQL: " + e.getMessage());

		}
	}
	
	public Connection getConn() {
	
		if (this.conn == null)
			connetti();
		
		return conn;
	}
	
	public static void main(String[] args) {
		Connessione c = new Connessione();
		c.connetti();
	}
	
	
}
