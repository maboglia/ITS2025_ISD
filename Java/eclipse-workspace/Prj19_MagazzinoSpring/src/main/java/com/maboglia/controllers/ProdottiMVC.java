package com.maboglia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.maboglia.services.MagazzinoService;

import jakarta.servlet.http.HttpSession;


@Controller
public class ProdottiMVC {

	@Autowired
	private MagazzinoService service;
	
	@GetMapping("prodotti")
	public String getProdotti(Model m) {
		m.addAttribute("prodotti", service.getProdotti());
		return "prodotti";
	}
	
	@GetMapping("prodotti/{id}")
	public String getProdotto(Model m, @PathVariable int id) {
		m.addAttribute("prodotto", service.getProdottoById(id));
		return "dettaglio_prodotto";
	}
	
	@GetMapping("prodotti/categoria/{cat}")
	public String getProdottiByCat(Model m, @PathVariable String cat) {
		m.addAttribute("prodotti", service.getProdottiByCategoria(cat));
		return "prodotti";
	}
	
	
	
}
