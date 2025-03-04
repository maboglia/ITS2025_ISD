package view;

import java.time.LocalTime;

import controller.LibroMatricola;
import model.Dipendente;

public class Programma extends Object{

	public static void main(String[] args) {
//		System.out.println("Sono le ore " + LocalTime.now());
//		System.out.println("è l'ora della pausa");

		/*
		 * 
			Artem	Bulgakov
			Lorenzo	Cattano
		 * 
		 */
		
		//dichiarazione     inizializzazione
		Dipendente d1;
		d1 = new Dipendente();
		d1.nome = "Francesco";
		d1.cognome = "Amerio";
		d1.ruolo = "BOSS";
		
		Dipendente d2 = new Dipendente();
		d2.nome = "Elisa";
		d2.cognome = "Andreoli";
		d2.ruolo = "Addetto vendite";
		
		Dipendente d3 = new Dipendente();
		d3.nome = "Mattia";
		d3.cognome = "Borrelli";
		d3.ruolo = "Manager";
		
		LibroMatricola libro = new LibroMatricola();
		libro.addDipendente(0, d1);
		libro.addDipendente(1, d2);
		libro.addDipendente(2, d3);
		
		int lunghezza = libro.dipendenti.length;
		
		for (int i = 0; i < lunghezza; i++) {
			
			if (libro.getDipendenti()[i] != null) {
				//System.out.println(libro.getDipendenti()[i].nome);
			}
		}
		
		Dipendente test = libro.getDipendenteById(3);
			if (test != null)
				System.out.println(test.nome);
			else
				System.out.println("Dipendente non disponibile");
		
	}

}
