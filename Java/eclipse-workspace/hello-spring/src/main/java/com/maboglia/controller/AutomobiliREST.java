package com.maboglia.controller;

import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entities.Automobile;
import com.maboglia.services.AutomobileService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AutomobiliREST {

	@Autowired
	private AutomobileService service;
	
	@GetMapping("api/automobili")
	public List<Automobile> automobili() {
		return service.getAutomobili();
	}
	
	
}
