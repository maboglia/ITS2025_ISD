package repos;

import java.util.List;

import model.Corso;
import model.Docente;
import model.Studente;

public interface DocenteDAO {

	List<Docente> findAll();
	Docente findById(int id);
	
	void addDocente(Docente d);
	void updateDocente(Docente d);
	void deleteDocente(Docente d);
	
}
