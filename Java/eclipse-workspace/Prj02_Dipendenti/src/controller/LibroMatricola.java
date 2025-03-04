package controller;

import model.Dipendente;

public class LibroMatricola {

	public Dipendente[] dipendenti = new Dipendente[10];
	
	/**
	 * Metodo per aggiungere un dipendente
	 * @param posizione inserire un intero per la posizione
	 * @param d Passare come parametro un oggetto di tipo dipendente
	 */
	public void addDipendente(int posizione, Dipendente d) {
		dipendenti[posizione] = d;
	}
	
	public Dipendente[] getDipendenti() {
		return dipendenti;
	}
	
	public Dipendente getDipendenteById(int id) {
		return dipendenti[id];
	}
	
	
	
}
