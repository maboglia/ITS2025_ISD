package controller;

import model.Libro;

public class LibreriaCtrl {

	private Libro[] libri;
	
	public LibreriaCtrl(int numLibri) {
		this.libri = new Libro[numLibri];
	}
	
	public void addLibro(Libro l, int pos) {
		this.libri[pos] = l;
	}
	
	public Libro getLibro(int pos) {
		return this.libri[pos];
	}

	public Libro[] getLibri() {
		return libri;
	}
	
	public void updateLibro(Libro l, int pos) {
		this.libri[pos] = l;
	}
	
	public void deleteLibro(int pos) {
		this.libri[pos] = null;
	}
}
