package services;

import java.util.List;

import model.Corso;
import repos.*;

public class CorsiService {

	private CorsoDAO daoCorsi = new CorsoDAOImpl();
	private CorsoDAO daoCorsiDB = new CorsoDAOImplDB();
	private StudenteDAO daoStudenti = new StudenteDAOImpl();
	private DocenteDAO daoDocenti = new DocenteDAOImpl();
	
	public List<Corso> getCorsi(){
		return daoCorsi.findAll();
	}
	
	public List<Corso> getCorsiDB(){
		return daoCorsiDB.findAll();
	}
	
	
}
