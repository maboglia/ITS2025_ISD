package repos;

import java.util.List;

import model.Corso;
import model.Docente;
import model.Studente;

public interface DocenteDAO {

	String FIND_ALL = "SELECT * FROM docenti";
	String FIND_ONE = "SELECT * FROM docenti WHERE id = ?";
	
	String ADD = "INSERT INTO docenti (nome) VALUES (?) ";
	String UPDATE = "UPDATE docenti SET nome = ? WHERE id = ?";
	String DELETE = "DELETE FROM docenti WHERE id = ?";
	
	
	List<Docente> findAll();
	Docente findById(int id);
	
	void addDocente(Docente d);
	void updateDocente(Docente d);
	void deleteDocente(Docente d);
	
}
