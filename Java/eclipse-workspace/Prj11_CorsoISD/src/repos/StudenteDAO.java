package repos;

import java.util.List;

import model.Corso;
import model.Studente;

public interface StudenteDAO {

	List<Studente> findAll();
	Studente findById(int id);
	
	void addStudente(Studente s);
	void updateStudente(Studente s);
	void deleteStudente(Studente s);
	
}
