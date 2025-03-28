<?php

include './app/config/config.php';

$lista = $ctrl->getAllPokemon();

header('Content-type: application/json');

echo json_encode($lista);







