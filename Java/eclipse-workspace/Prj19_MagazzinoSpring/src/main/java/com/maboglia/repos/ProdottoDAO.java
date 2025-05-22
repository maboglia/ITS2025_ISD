package com.maboglia.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maboglia.entities.Prodotto;

@Repository
public interface ProdottoDAO extends JpaRepository<Prodotto, Long> {

	List<Prodotto> findByGiacenzaBetween(int min, int max);
	
}
