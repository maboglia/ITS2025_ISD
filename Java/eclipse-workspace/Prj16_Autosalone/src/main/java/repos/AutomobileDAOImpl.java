package repos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import entities.Automobile;

public class AutomobileDAOImpl implements AutomobileDAO {

	private Connessione connessione = new Connessione();
	
	private Statement statement;
	private ResultSet rs;
	
	@Override
	public Map<Integer, Automobile> getAutomobili() {
		
		Map<Integer, Automobile> mappa = new HashMap<>();
		
		try {
			statement = connessione.getConnessione().createStatement();
			rs = statement.executeQuery(FIND_ALL);
			
			while(rs.next()) {
				
				Automobile a = new Automobile();//costruisco l'oggetto
				
				a.setId(rs.getInt("id"));//inizializzo le proprietà
				a.setCilindrata(rs.getInt("cilindrata"));
				a.setPosti(rs.getInt("posti"));
				
				a.setMarca(rs.getString("marca"));
				a.setModello(rs.getString("modello"));
				
				a.setPrezzo(rs.getDouble("prezzo"));
				
				mappa.put(a.getId(), a);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mappa;
	}

}
