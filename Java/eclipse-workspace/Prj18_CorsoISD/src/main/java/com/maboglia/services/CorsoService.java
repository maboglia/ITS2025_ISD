package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.Docente;
import com.maboglia.entities.Materia;

public interface CorsoService {

	//CRUD - materie
	Materia addMateria(Materia m);//CREATE

	Materia getMateria(int id);//READ - RETRIEVE
	List<Materia> getMaterie();//READ - RETRIEVE
	
	Materia updateMateria(Materia m);//UPDATE
	void deleteMateria(int id);//DELETE

	//CRUD - docente
	Docente addDocente(Docente d);//CREATE
	
	Docente getDocente(int id);//READ - RETRIEVE
	List<Docente> getDocenti();//READ - RETRIEVE
	
	Docente updateDocente(Docente d);//UPDATE
	void deleteDocente(int id);//DELETE
	
}
