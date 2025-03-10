package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import controller.LibreriaCtrl;
import model.Libro;
import util.Lettore;

public class LibreriaDemo {

	public static void main(String[] args) throws FileNotFoundException {

		LibreriaCtrl ctrl = new LibreriaCtrl(23);//istanzio un controller per gestire la libreria java
		
		String[][] leggiFile = Lettore.leggiFile("documenti/libri.csv");//chiamo lo scanner che legge il file di testo
		
		PrintWriter stampante = new PrintWriter(new File("documenti/libri.html"));
		
		int indice = 0;
		
		for (String[] riga : leggiFile) {//scorro le righe
			
			
			
			for(int i =0; i < riga.length; i++) {//scorro le colonne (attributi del libro)
				
				int id = Integer.parseInt(riga[0]);
				String titolo = riga[1].replaceAll("\"", "");
				double prezzo = Double.parseDouble(riga[2]);
				int pagine = !riga[3].equals("NULL") ? Integer.parseInt(riga[3]) : 0;
				int editore_id = Integer.parseInt(riga[4]);
				
				
				
				Libro temp = new Libro(id, titolo, prezzo, pagine, editore_id);//creao un oggetto di tipo libro
				ctrl.addLibro(temp, indice);//attraverso il ctrl aggiungo il libro alla collezione
			}
			indice++;
			
		}
		
		try {


			Libro[] libri = ctrl.getLibri();
			
			stampante.println("<ul>");
			for (Libro libro : libri) {
				System.out.println(libro);
				stampante.println("<li>" + libro.getTitolo() + "</li>");
			}
			stampante.println("</ul>");
			stampante.close();
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Ehi tu!! Non devi chiedere questi numeri alti");
			System.err.println(e.getMessage());
		}
		

		
		System.out.println("Game Over");
		
	}

}
