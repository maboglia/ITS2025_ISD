<?php

//declare(strict_types=1);

namespace App\model;

class Libro {

    private $id;
    private $titolo;
    private $prezzo;


    public function __construct($id, $titolo, $prezzo){
        $this->id = $id;
        $this->titolo = $titolo;
        $this->prezzo = $prezzo;
    }

    public function __get($name){
        return $this->$name;
    }

    public function __set($name, $value){
        $this->$name = $value;
    }

}





