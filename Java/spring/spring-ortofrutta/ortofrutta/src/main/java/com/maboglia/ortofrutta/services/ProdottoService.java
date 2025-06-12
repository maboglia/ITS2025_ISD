package com.maboglia.ortofrutta.services;

import java.util.List;

import com.maboglia.ortofrutta.entities.Prodotto;

public interface ProdottoService {

    List<Prodotto> getProdotti();

    Prodotto addProdotto(Prodotto p);

}
