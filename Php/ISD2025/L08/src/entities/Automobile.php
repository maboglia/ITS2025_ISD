<?php

class Automobile {

    private $id;
    private $marca;
    private $modello;
    private $cilindrata;
    private $post;
    private $prezzo;

    public function __get($nomeVariabile) {
       return $this->$nomeVariabile; 
    }

    public function __set($nomeVariabile, $valoreVariabile){
        $this->$nomeVariabile = $valoreVariabile;
    }

}

