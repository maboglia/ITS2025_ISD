package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import integration.PokemonREST;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
		PokemonREST rest = new PokemonREST();
		
		File f = new File("pokemon.json");
		PrintWriter pw = new PrintWriter(f);
		
		pw.println(rest.getPokemon().toString());
		
		pw.close();

	}

}
