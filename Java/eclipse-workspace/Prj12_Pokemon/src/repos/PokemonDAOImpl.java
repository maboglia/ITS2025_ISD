package repos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import entities.Pokemon;

public class PokemonDAOImpl implements PokemonDAO{

	private Connessione conn = new Connessione();
	
	private Statement stat;
	
	private ResultSet rs;
	
	@Override
	public Map<Integer, Pokemon> getAll() {
		Map<Integer, Pokemon> all = new HashMap<>();
		
		try {
			stat = conn.getConn().createStatement();
			rs = stat.executeQuery(FIND_ALL);
			
			while (rs.next()) {

				Pokemon p = new Pokemon();
				p.setId(rs.getInt("Id"));
				p.setName(rs.getString("Name"));
				p.setType1(rs.getString("Type 1"));
				p.setType2(rs.getString("Type 2"));

				all.put(p.getId(), p);
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return all;
	}

}
