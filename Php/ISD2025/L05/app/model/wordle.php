<?php

class Wordle {

    public $chars;
    private $secretWord;

    public function __construct($chars = ['_','_','_','_','_']) {
        $this->chars = $chars;
        $this->secretWord = $this->secretWord();//creo la parola
        $_SESSION['parola_segreta'] = $this->secretWord ;//la salvo in sessione
    }

    public function sceltaUtente($chars) {
        $this->chars = $chars;
    }

    

    public function reset() {
        unset($_SESSION['parola_segreta']);
    }   


    private function salvaSecretWord(){
        if (isset($_SESSION['parola_segreta'])){
            $this->secretWord = $_SESSION['parola_segreta'];
        } else{
            $this->secretWord = secretWord();
            $_SESSION['parola_segreta'] = $this->secretWord;
        }
    }


    public function __toString() {
        return $this->chars;
    }



    public function secretWord(){
        $parole = ["AMORE","CUORE","pizza","CARNE","SPADA","BURRO"];
        $cas = array_rand($parole);
        return str_split( strtoupper($parole[$cas])   );
    }








}








