package repos;

import java.util.Map;

import entities.Pokemon;

public interface PokemonDAO {

	String FIND_ALL = "SELECT * FROM pokemon";
	
	Map<Integer, Pokemon> getAll();
	
}
