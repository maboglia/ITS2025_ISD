package com.maboglia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entities.Docente;
import com.maboglia.entities.Materia;
import com.maboglia.services.CorsoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("api")
public class CorsoREST {

	@Autowired
	private CorsoService service;
	
	@GetMapping("materie")
	public ResponseEntity<List<Materia>> getMaterie() {
		return new ResponseEntity<List<Materia>>(service.getMaterie(), HttpStatus.OK);
	}
	
	@GetMapping("docenti")
	public ResponseEntity<List<Docente>> getDocenti() {
		return new ResponseEntity<List<Docente>>(service.getDocenti(), HttpStatus.OK);
	}
	
	@PostMapping("materie")
	public ResponseEntity<Materia> addMateria(@RequestBody Materia m) {
		Materia mRecord = service.addMateria(m);
		
		return new ResponseEntity<Materia>(mRecord, HttpStatus.CREATED);
	}

	@PostMapping("docenti")
	public ResponseEntity<Docente> addDocente(@RequestBody Docente d) {
		Docente dRecord = service.addDocente(d);
		
		return new ResponseEntity<Docente>(dRecord, HttpStatus.CREATED);
	}
	
	
}
