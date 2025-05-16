package com.maboglia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {

	@GetMapping({"artem", "artiom"})
	public String getArtem() {
		return "artem";
	}
	
	@GetMapping({"torres", "danger"})
	public String getTorres() {
		return "torres";
	}
	
}
