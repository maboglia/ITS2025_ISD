<?php

class ProdottiCtrl{

    private $prodotti = [];

    public function addProdotto($prodotto){
        $this->prodotti[] = $prodotto;//aggiungo il prodotto alla collezione di prodotti
    }

    public function getProdotti(){
        return $this->prodotti;
    }


}






