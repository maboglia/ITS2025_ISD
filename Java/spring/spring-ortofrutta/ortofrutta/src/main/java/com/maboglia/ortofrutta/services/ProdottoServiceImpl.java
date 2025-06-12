package com.maboglia.ortofrutta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.ortofrutta.entities.Prodotto;
import com.maboglia.ortofrutta.repos.ProdottoRepo;

@Service
public class ProdottoServiceImpl implements ProdottoService{

    @Autowired
    private ProdottoRepo repo;

    @Override
    public List<Prodotto> getProdotti() {
        return repo.findAll();
    }

    @Override
    public Prodotto addProdotto(Prodotto p) {
        return repo.save(p);
    }

}
