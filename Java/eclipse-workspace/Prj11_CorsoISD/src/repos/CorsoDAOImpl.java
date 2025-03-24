package repos;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import model.Corso;
import model.Docente;
import util.StampanteScanner;

public class CorsoDAOImpl implements CorsoDAO {

	DocenteDAO dao = new DocenteDAOImpl();
	
	@Override
	public List<Corso> findAll() {
		
		List<Corso> corsi = new ArrayList<>();
		
		List<String[]> leggiFile = StampanteScanner
			.leggiFile(new File("files/corsi.csv"));
		
		//id, nome, ore, docente_id
		for (String[] strings : leggiFile) {
			int id = Integer.parseInt(strings[0]);
			String nome = strings[1];
			int ore = Integer.parseInt(strings[2]);
			Docente docente = null;
			if (!strings[3].equals("NULL")) {
				int docente_id = Integer.parseInt(strings[3]);
				
				docente = dao.findById(docente_id);
				
			} 
				
			
			corsi.add(new Corso(id, nome, ore, docente));
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
