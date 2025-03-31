package repos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import model.Docente;

public class DocentiDAOImplDB implements DocenteDAO {

	Connessione conn = new Connessione();
	
	Statement stat = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	@Override
	public List<Docente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Docente findById(int id) {

		try {
			ps = conn.getConn().prepareStatement(FIND_ONE);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				return new Docente(rs.getInt("id"), rs.getString("nome"), "generico");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void addDocente(Docente d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDocente(Docente d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDocente(Docente d) {
		// TODO Auto-generated method stub

	}

}
