<?php

include './app/model/Pokemon.php';
include './app/controller/PokedexController.php';

session_start();

if (isset($_SESSION['controller'])) {
    $ctrl = $_SESSION['controller']  ;
}   else {
    $_SESSION['controller'] = new PokedexController();
    $ctrl = $_SESSION['controller']  ;
}


define('TITOLO_SITO', 'Pokedex');








