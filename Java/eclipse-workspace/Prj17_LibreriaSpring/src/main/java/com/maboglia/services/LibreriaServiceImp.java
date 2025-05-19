package com.maboglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Editore;
import com.maboglia.entities.Libro;
import com.maboglia.repos.EditoreDAO;
import com.maboglia.repos.LibroDAO;

@Service
public class LibreriaServiceImp implements LibreriaService {

	@Autowired
	private EditoreDAO editoreDAO;
	
	@Autowired
	private LibroDAO libroDAO;

	@Override
	public List<Editore> getEditori() {
		return editoreDAO.findAll();
	}

	@Override
	public List<Libro> getLibri() {
		return libroDAO.findAll();
	}

	@Override
	public Editore addEditore(Editore e) {
		return editoreDAO.save(e);
	}

	@Override
	public Libro addLibro(Libro l) {
		return libroDAO.save(l);
	}
	
}
