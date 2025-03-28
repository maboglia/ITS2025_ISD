<h1><?= TITOLO_SITO ?></h1>

<?php include './app/view/form_pokemon.html';  ?>




<?php

   

    $nomePokemon = isset($_POST['nomePokemon'])  ? $_POST['nomePokemon'] : "Pikachu";
    $tipo1Pokemon = isset($_POST['tipo1Pokemon'])  ? $_POST['tipo1Pokemon'] : "Elettro";
    $tipo2Pokemon = isset($_POST['tipo2Pokemon'])  ? $_POST['tipo2Pokemon'] : "";

    $pok1 = new Pokemon($nomePokemon, $tipo1Pokemon, $tipo2Pokemon);

    $ctrl->addPokemon($pok1);

    $listaPokemon = $ctrl->getAllPokemon();

    include './app/view/tabella_pokemon.php';

?>


