package presentation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Libro;
import repos.LibroDAO;
import util.Lettore;

public class DemoLibreria {

	public static void main(String[] args) {

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
		
		Collections.sort(libri);
		
		for(Libro l : libri) {
			System.out.println(l);
		}
		

	}

}
