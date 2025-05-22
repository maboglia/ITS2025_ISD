package com.maboglia.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Prodotto;
import com.maboglia.repos.ProdottoDAO;

@Service
public class MagazzinoServiceImpl implements MagazzinoService {

	@Autowired
	private ProdottoDAO dao;
	
	@Override
	public List<Prodotto> getProdotti() {
		return dao.findAll();
	}

	@Override
	public List<Prodotto> getProdottiByCategoria(String categoria) {

		return getProdotti()
				.stream()
				.filter(p -> p.getCategoria().equalsIgnoreCase(categoria))
				.toList();
		
	}

	@Override
	public Prodotto getProdottoById(int id) {
		return getProdotti()
				.stream()
				.filter(p -> p.getId() == id)
				.toList()
				.get(0);
	}

	@Override
	public Prodotto addProdotto(Prodotto p) {
		return dao.save(p);
	}

	@Override
	public Prodotto updateProdotto(Prodotto p) {
		return dao.save(p);
	}

	@Override
	public void delProdotto(long id) {
		dao.deleteById(id);

	}

}
