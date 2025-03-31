package repos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Corso;

public class CorsoDAOImplDB implements CorsoDAO {

	Connessione conn = null;
	
	Statement stat = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public CorsoDAOImplDB() {
		this.conn = new Connessione();
	}
	
	@Override
	public List<Corso> findAll() {
		
		List<Corso> corsi = new ArrayList<Corso>();
		
		try {
			stat = conn.getConn().createStatement();
			rs = stat.executeQuery(FIND_ALL);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				int ore = rs.getInt("ore");
				int docenteId = rs.getInt("docente_id");
				
				corsi.add( new Corso(id, nome, ore, null) );
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
		
		return corsi;
	}

	@Override
	public Corso findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCorso(Corso c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCorso(Corso c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCorso(Corso c) {
		// TODO Auto-generated method stub

	}

}
