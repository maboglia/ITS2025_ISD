package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maboglia.entities.Editore;

@Repository
public interface EditoreDAO extends JpaRepository<Editore, Integer>{

}
