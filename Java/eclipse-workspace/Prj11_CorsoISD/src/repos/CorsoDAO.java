package repos;

import java.util.List;

import model.Corso;

public interface CorsoDAO {

	String FIND_ALL = "SELECT * FROM corsi";
	String FIND_ONE = "SELECT * FROM corsi WHERE id = ?";
	
	String ADD = "INSERT INTO corsi (nome, ore, docente_id) VALUES (?,?,?) ";
	String UPDATE = "UPDATE corsi SET nome = ?, ore = ?, docente_id = ? WHERE id = ?";
	String DELETE = "DELETE FROM corsi WHERE id = ?";
	
	
	
	List<Corso> findAll();
	Corso findById(int id);
	
	void addCorso(Corso c);
	void updateCorso(Corso c);
	void deleteCorso(Corso c);
	
}
