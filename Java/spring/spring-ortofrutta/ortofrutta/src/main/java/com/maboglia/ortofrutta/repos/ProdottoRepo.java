package com.maboglia.ortofrutta.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maboglia.ortofrutta.entities.Prodotto;

@Repository
public interface ProdottoRepo extends JpaRepository<Prodotto, Integer> {

}
