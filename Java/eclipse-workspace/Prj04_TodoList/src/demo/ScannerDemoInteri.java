package demo;

import utilities.MioScanner;

public class ScannerDemoInteri {

	public static void main(String[] args) {

		MioScanner ms = new MioScanner();
		
		int a = ms.leggiIntero("Dammi il primo numero");
		int b = ms.leggiIntero("Dammi il secondo numero");

		System.out.println("L'addizione è: " + (a + b));
		System.out.println("La sottrazione è: " + (a - b));
		System.out.println("La moltiplicazione è: " + (a * b));
		System.out.println("La divisione è: " + (  (double)  a / b));
		
	}

}
