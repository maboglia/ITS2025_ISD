package repos;

import java.util.List;

import model.Corso;

public interface CorsoDAO {

	List<Corso> findAll();
	Corso findById(int id);
	
	void addCorso(Corso c);
	void updateCorso(Corso c);
	void deleteCorso(Corso c);
	
}
