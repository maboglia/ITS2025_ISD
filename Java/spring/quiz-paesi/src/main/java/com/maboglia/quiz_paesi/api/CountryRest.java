package com.maboglia.quiz_paesi.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.quiz_paesi.entities.Country;
import com.maboglia.quiz_paesi.services.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
@RequestMapping("api")
public class CountryRest {

    @Autowired
    private CountryService service;

    @GetMapping("countries")
    public ResponseEntity<List<Country>> getCountries() {
        return new ResponseEntity(service.getCountries(), HttpStatus.OK);
    }
    

}
