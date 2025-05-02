<?php

class Connessione{
    private $conn;
    private $dsn= "mysql:host=".HOST.";dbname=".DB_NAME."";
    private function connetti(){
        try {
            $this->conn = new PDO($this->dsn, USER, PASS);
            echo "Connessione avvenuta con successo!";
        } catch (PDOException $e) {
            throw new PDOException($e->getMessage(), (int)$e->getCode());
        }
    }
    public function disconnetti(){
        if($this->conn){
            $this->conn = null;
        }
        
    }
    public function getConn(){
        if($this->conn === null){
            $this->connetti();
        }
        return $this->conn;
    }
}