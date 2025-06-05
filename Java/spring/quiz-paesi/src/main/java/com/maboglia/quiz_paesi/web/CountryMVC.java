package com.maboglia.quiz_paesi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.maboglia.quiz_paesi.services.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CountryMVC {

    @Autowired
    private CountryService service;

    @GetMapping("countries")
    public String countries(Model m) {
        m.addAttribute("title", "Studia la geografia col nostro quiz: elenco dei paesi");
        m.addAttribute("paesi", service.getCountries());
        return "countries";//nome di un file countries.html nell cartella templates
    }
    

}
