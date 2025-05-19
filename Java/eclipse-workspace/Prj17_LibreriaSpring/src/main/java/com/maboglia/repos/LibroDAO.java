package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.entities.Libro;

public interface LibroDAO extends JpaRepository<Libro, Integer> {

}
