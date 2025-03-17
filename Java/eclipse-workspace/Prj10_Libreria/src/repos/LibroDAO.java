package repos;

import java.util.ArrayList;

import model.Libro;

public class LibroDAO {

	private ArrayList<Libro> libri = new ArrayList<>();//contenitore di Libro

	/**
	 * Metodo per aggiungere un libro
	 * @param l Passare un libro da aggiungere alla collezione (List)
	 */
	public void addLibro(Libro l) {
		this.libri.add(l);
	}

	/**
	 * Usa questo metodo per ottenere la collezione di libri
	 * @return Un arraylist (una lista) di oggetti di tipo libro
	 */
	public ArrayList<Libro> getLibri() {
		return libri;
	}
	
	/**
	 * Metodo per ottenere un libro dato il titolo
	 * @param titolo inserire il titolo completo del libro
	 * @return Se lo ha trovato, ritorna il libro col titolo dato, altrimenti null
	 */
	public Libro getLibroByTitolo(String titolo) {
		for (Libro libro : libri) {
			if (libro.getTitolo().equalsIgnoreCase(titolo))
				return libro;
		}
		return null;
	}
	
}
