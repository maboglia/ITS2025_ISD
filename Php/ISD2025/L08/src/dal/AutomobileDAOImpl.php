<?php

class AutomobileDAOImpl implements AutomobileDAO {

    private $db;


    function __construct() {
        $this->db = new Connessione();
    }

    public function getAutomobili() {
        
        $automobili = [];

        $result = $this->db->getConn()->query(self::FIND_ALL);

        $result->setFetchMode(PDO::FETCH_CLASS, "Automobile");//riversare i risultati nell'oggetto

        while ($automobile = $result->fetch()){
            $automobili[] = $automobile;
        }

        // $auto = new Automobile();
        // $auto->marca = 'BMW';
        // $auto->modello = 'Z3';
        // $auto->prezzo = 15000;
        // $auto->cilindrata = 3000;
        // $auto->posti = 2;

        // $automobili[] = $auto;//aggiungo automobile al contenitore di automobili

        return $automobili;

    }

    public function save($automobile){

        $statement = $this->db->getConn()->prepare(self::ADD);

        $statement->bindParam(':marca', $automobile->marca);
        $statement->bindParam(':modello', $automobile->modello);
        $statement->bindParam(':cilindrata', $automobile->cilindrata);
        $statement->bindParam(':posti', $automobile->posti);
        $statement->bindParam(':prezzo', $automobile->prezzo);

        $statement->execute();

    }
}


