<?php

class PokedexController{

    private $lista;

    public function __construct(){
        $this->lista = [];
    }

    public function addPokemon($pokemon){
        $this->lista[] = $pokemon;
    }

    public function getAllPokemon(){
        return $this->lista;
    }



}







