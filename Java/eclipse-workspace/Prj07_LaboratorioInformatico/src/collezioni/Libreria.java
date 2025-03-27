package collezioni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Libro;



public class Libreria {

	public static void main(String[] args) {

		Libro l1 = new Libro(1, "Zorro", 10);
		Libro l2 = new Libro(2, "Albachiara", 13);
		Libro l3 = new Libro(3, "Non ho l'età", 8);
		Libro l4 = new Libro(4, "Domodossola è bella", 11);
		
		List<Libro> libri = new ArrayList<Libro>();
		
		libri.add(l1);
		libri.add(l2);
		libri.add(l3);
		libri.add(l4);
		
			
//		Collections.sort(libri, new ComparatorePrezzoAsc());
		Collections.sort(libri, (lib1, lib2) 
										-> //thin arrow   
										Double.compare(lib1.getPrezzo(), lib2.getPrezzo()));
		
		for (Libro libro : libri) {
			System.out.println(libro);
		}
		
		
		

	}

}
