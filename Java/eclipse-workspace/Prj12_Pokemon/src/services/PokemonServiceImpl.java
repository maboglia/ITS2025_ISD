package services;

import java.util.ArrayList;
import java.util.List;

import entities.Pokemon;
import repos.PokemonDAO;
import repos.PokemonDAOImpl;

public class PokemonServiceImpl implements PokemonService {

	private PokemonDAO dao = new PokemonDAOImpl();
	
	@Override
	public List<Pokemon> listPokemon() {

		//List<Pokemon> all = new ArrayList<>(dao.getAll().values());

		return new ArrayList<>(dao.getAll().values());
	}

}
