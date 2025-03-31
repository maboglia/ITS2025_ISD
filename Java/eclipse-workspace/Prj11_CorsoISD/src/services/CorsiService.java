package services;

import java.util.List;

import model.Corso;
import model.Docente;
import repos.*;

public class CorsiService {

	private CorsoDAO daoCorsi = new CorsoDAOImpl();
	private CorsoDAO daoCorsiDB = new CorsoDAOImplDB();
	private StudenteDAO daoStudenti = new StudenteDAOImpl();
	private DocenteDAO daoDocenti = new DocenteDAOImpl();
	private DocenteDAO daoDocentiDB = new DocentiDAOImplDB();
	
	public List<Corso> getCorsi(){
		return daoCorsi.findAll();
	}
	
	public List<Corso> getCorsiDB(){
		return daoCorsiDB.findAll();
	}
	
	public Docente getDocenteById(int id) {
		return daoDocentiDB.findById(id);
	}
}
