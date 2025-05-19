package com.maboglia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entities.Editore;
import com.maboglia.entities.Libro;
import com.maboglia.services.LibreriaService;

@RestController
@RequestMapping("api")
public class LibreriaRest {

	@Autowired
	private LibreriaService service;
	
	@GetMapping("editori")
	public List<Editore> getEditori(){
		return service.getEditori();
	} 
	@GetMapping("libri")
	public List<Libro> getLibri(){
		return service.getLibri();
	} 
	
	@PostMapping("editori")
	public Editore addEditore(@RequestBody Editore e) {
		return service.addEditore(e);
	}
	
	@PostMapping("libri")
	public Libro addLibro(@RequestBody Libro l) {
		return service.addLibro(l);
	}
	
}
