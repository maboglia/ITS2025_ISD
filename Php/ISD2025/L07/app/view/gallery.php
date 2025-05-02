<h1>Gallery</h1>
<?php 
 require APP."model/PokemonDAO.php";
$dao = new PokemonDAO();
var_dump($dao->getAllPokemon());