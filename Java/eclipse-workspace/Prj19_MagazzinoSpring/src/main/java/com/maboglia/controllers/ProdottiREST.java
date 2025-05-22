package com.maboglia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entities.Prodotto;
import com.maboglia.services.MagazzinoService;


@RestController
@RequestMapping("api")
public class ProdottiREST {

	@Autowired
	private MagazzinoService service;
	
	@GetMapping("prodotti")
	public List<Prodotto> getProdotti() {
		return service.getProdotti();
	}
	
	@GetMapping("prodotti/{id}")
	public Prodotto getProdotto(@PathVariable int id) {
		return service.getProdottoById(id);
	}
	
	@GetMapping("prodotti/categoria/{cat}")
	public List<Prodotto> getProdottiByCat(@PathVariable String cat) {
		return service.getProdottiByCategoria(cat);
	}
	
}
