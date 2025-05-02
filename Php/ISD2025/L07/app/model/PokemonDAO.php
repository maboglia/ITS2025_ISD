<?php
declare(strict_types=1);
require APP."model/Pokemon.php";
require APP."model/Connessione.php";

interface PokemonIDAO
{

    const FIND_ALL = "select * from pokemon";
    const FIND_BY_ID = "select * from pokemon where id =:id";
    const FIND_BY_NAME = "select * from pokemon where name =:name";

    public function getByPokemonId(int $pokemonId): ?Pokemon;
    public function getByPokemonName(string $name): ?Pokemon;
    public function getAllPokemon(): array;
}
class PokemonDAO implements PokemonIDAO
{   
   private $conn ;

   public function __construct(){
    $c = new Connessione();
    $this->conn = $c ->getConn();
   }


    public function getByPokemonId(int $pokemonId): ?Pokemon
    {
        return null;
    }
    public function getByPokemonName(string $name): ?Pokemon
    {
        return null;
    }
    public function getAllPokemon(): array
    {
        $pokemon = [] ;
        try{
    $result =  $this->conn->query(PokemonIDAO::FIND_ALL);

        $result->setFetchMode(PDO::FETCH_CLASS , "Pokemon");
       

    while($giovanni = $result->fetch()){

       $pokemon[] = $giovanni;

    }

}catch(PDOException $e){
            
}
        return $pokemon;
    }
}