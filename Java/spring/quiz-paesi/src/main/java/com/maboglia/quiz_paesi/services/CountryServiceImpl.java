package com.maboglia.quiz_paesi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.quiz_paesi.entities.Country;
import com.maboglia.quiz_paesi.repos.CountryRepo;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepo repo;


    @Override
    public List<Country> getCountries() {
        return repo.findAll();
    }

}
