<?php  



    require APP."model/PokemonDAO.php";
    $dao = new PokemonDAO();
    header("content-type:application/json");
    echo json_encode($dao->getAllPokemon());




