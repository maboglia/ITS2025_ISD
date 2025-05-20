package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.entities.Docente;

public interface DocenteDAO extends JpaRepository<Docente, Integer> {

}
