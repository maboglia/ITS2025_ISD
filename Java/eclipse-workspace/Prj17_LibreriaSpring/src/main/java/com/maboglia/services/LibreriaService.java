package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.Editore;
import com.maboglia.entities.Libro;

public interface LibreriaService {

	List<Editore> getEditori();
	List<Libro> getLibri();
	
	Editore addEditore(Editore e);
	Libro addLibro(Libro l);
	
}
