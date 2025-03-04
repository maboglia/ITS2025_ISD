package laboratorio;

import utilities.MioScanner;

public class ProvaWhile {

	public static void main(String[] args) {

		MioScanner scanner = new MioScanner();
		boolean gira = true;
		
		int risposta = 0;
		
		while(gira) {
		
			menuScelta();
			
			risposta = scanner.leggiIntero("Quale opzione scegli?");
			
			switch (risposta) {
			case 1:
				System.out.println("Logica per aggiungere Todo");
				break;
			case 2:
				System.out.println("Logica per stampare Todo");
				break;
			case 3:
				System.out.println("Logica per eliminare Todo");
				break;
			case 9:
				System.out.println("Vuoi uscire");
				gira = false;
				break;

			default:
				System.out.println("Opzione non ancora disponibile");
				break;
			}
		}
	}

	private static void menuScelta() {
		System.out.println("Scegliere tra le seguenti opzioni:");
		System.out.println("1) aggiungi todo");
		System.out.println("2) stampa todo");
		System.out.println("3) elimina todo");
		System.out.println("9) esci");
		
	}

}
