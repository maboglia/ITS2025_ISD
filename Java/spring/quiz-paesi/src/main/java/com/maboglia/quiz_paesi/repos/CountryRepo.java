package com.maboglia.quiz_paesi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.quiz_paesi.entities.Country;

public interface CountryRepo extends JpaRepository<Country, String>{

}
