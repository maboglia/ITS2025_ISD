package integration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;

import model.Libro;
import repos.LibroDAO;
import util.Lettore;

public class LibreriaRest {

	public static void main(String[] args) throws FileNotFoundException {
		
LibroDAO dao = new LibroDAO();
		
		ArrayList<String[]> letturaFileCSV = Lettore.leggiFile("files/libri.csv");
		
		for (String[] strings : letturaFileCSV) {
			
			int id = Integer.parseInt(strings[0]);//id del libro
			String titolo =strings[1].replaceAll("\"", "");//titolo del libro
			double prezzo = Double.parseDouble(strings[2]);//prezzo del libro
			int pagine = Integer.parseInt(strings[3]);//pagine del libro
			int idEditore = Integer.parseInt(strings[4]);//editore_id del libro

			Libro l = new Libro(id, titolo, prezzo, pagine, idEditore);
			dao.addLibro(l);
			
		}
		
		//scorro l'arraylist di libro
		
		List<Libro> libri = dao.getLibri();
		
		JSONArray array = new JSONArray(libri);
		System.out.println(array);
		
		PrintWriter stampante = new PrintWriter(new File("files/libreria.json"));
		
		stampante.print(array);
		
		stampante.close();
		
		
	}
	
	
}
