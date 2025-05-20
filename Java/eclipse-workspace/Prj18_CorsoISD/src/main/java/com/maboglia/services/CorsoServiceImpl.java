package com.maboglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Docente;
import com.maboglia.entities.Materia;
import com.maboglia.repos.DocenteDAO;
import com.maboglia.repos.MateriaDAO;

@Service
public class CorsoServiceImpl implements CorsoService {

	@Autowired
	private MateriaDAO materiaDAO;
	
	@Autowired
	private DocenteDAO docenteDAO;
	
	@Override
	public Materia addMateria(Materia m) {
		return materiaDAO.save(m);
	}

	@Override
	public Materia getMateria(int id) {
		
		return materiaDAO.findById(id).get();
	}

	@Override
	public List<Materia> getMaterie() {
		return materiaDAO.findAll();
	}

	@Override
	public Materia updateMateria(Materia m) {
		return materiaDAO.save(m);
	}

	@Override
	public void deleteMateria(int id) {
		materiaDAO.deleteById(id);
	}

	@Override
	public Docente addDocente(Docente d) {
		return docenteDAO.save(d);
	}

	@Override
	public Docente getDocente(int id) {
		return docenteDAO.findById(id).get();
	}

	@Override
	public List<Docente> getDocenti() {
		return docenteDAO.findAll();
	}

	@Override
	public Docente updateDocente(Docente d) {
		return docenteDAO.save(d);
	}

	@Override
	public void deleteDocente(int id) {
		docenteDAO.deleteById(id);

	}

}
