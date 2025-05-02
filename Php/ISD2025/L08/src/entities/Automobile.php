<?php

class Automobile implements JsonSerializable{

    private $id;
    private $marca;
    private $modello;
    private $cilindrata;
    private $posti;
    private $prezzo;

    public function __get($nomeVariabile) {
       return $this->$nomeVariabile; 
    }

    public function __set($nomeVariabile, $valoreVariabile){
        $this->$nomeVariabile = $valoreVariabile;
    }

    public function jsonSerialize(){
        return [
            'marca'=>$this->marca,
            'modello'=>$this->modello,
            'prezzo'=> number_format( $this->prezzo * 1.1, 2, ',','.' ),
        ];
    }

}

