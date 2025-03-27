package collezioni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Libro;

class ComparatorePrezzoAsc implements Comparator<Libro>{

	@Override
	public int compare(Libro libro1, Libro libro2) {
		
		return Double.compare(libro1.getPrezzo(), libro2.getPrezzo()) ;
	}
	
}

class ComparatorePrezzoDesc implements Comparator<Libro>{
	
	@Override
	public int compare(Libro libro1, Libro libro2) {
		
		return Double.compare(libro2.getPrezzo(), libro1.getPrezzo()) ;
	}
	
}

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
		
		Comparator<Libro> cpa = (lib1, lib2) ->  Double.compare(lib1.getPrezzo(), lib2.getPrezzo());//lambda expression


		
//		Collections.sort(libri, new ComparatorePrezzoAsc());
		Collections.sort(libri, (lib1, lib2) 
										-> //thin arrow   
										Double.compare(lib1.getPrezzo(), lib2.getPrezzo()));
		
		for (Libro libro : libri) {
			System.out.println(libro);
		}
		
		
		

	}

}
