package demo;

import utilities.MioScanner;

public class ScannerDemo {

	public static void main(String[] args) {

		MioScanner ms = new MioScanner();
		
		String nomeUtente = ms.leggiStringa("Come ti chiami");
		
		if (nomeUtente.equals("mauro")) {
			System.out.println("Allora sei proprio mauro benvenuto in Eclipse");
		} else {
			System.out.println("Ehi tu sei il maledetto pitone!!!" + nomeUtente);
		}

	}

}
