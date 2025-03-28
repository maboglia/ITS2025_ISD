<?php

class Pokemon {

    private $nome;
    private $tipo1;
    private $tipo2;

    public function __construct($nome, $tipo1, $tipo2){
        $this->nome = $nome;
        $this->tipo1 = $tipo1;
        $this->tipo2 = $tipo2;
    }

    public function __get($name){
        return $this->$name;
    }

    public function __set($name, $value){
        $this->$name = $value;
    }

    public function __tostring() { 
        return $this->nome . ': ' . $this->tipo1;     
    }


}


















