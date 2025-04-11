package integration;

import org.json.JSONArray;
import org.json.JSONObject;

import entities.Pokemon;
import services.PokemonService;
import services.PokemonServiceImpl;

public class PokemonREST {

	private PokemonService service = new PokemonServiceImpl();
	
	public JSONArray getPokemon() {
		
		JSONArray array = new JSONArray();
		
		for(Pokemon p : service.listPokemon()) {
			//JSONObject obj = new JSONObject(p);
			array.put(new JSONObject(p));
		}
		
		return array;
		
	}
	
	
}
