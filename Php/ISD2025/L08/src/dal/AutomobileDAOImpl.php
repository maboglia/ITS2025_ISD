<?php

class AutomobileDAOImpl implements AutomobileDAO {

    private $db;


    function __construct() {
        $this->db = new Connessione();
    }

    public function getAutomobili() {
        
        $automobili = [];

        $auto = new Automobile();
        $auto->marca = 'BMW';
        $auto->modello = 'Z3';
        $auto->prezzo = 15000;
        $auto->cilindrata = 3000;
        $auto->posti = 2;

        $automobili[] = $auto;//aggiungo automobile al contenitore di automobili

        return $automobili;

    }


}


