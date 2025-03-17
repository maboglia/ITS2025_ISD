package gioco;

import java.util.Random;
import java.util.Scanner;

public class Gioco {

	public static void main(String[] args) {

		String umano = chiediAllUmano();
		String macchina = chiediAllaMacchina();

		System.out.println("Scelta umano: " + umano);
		System.out.println("Scelta macchina: " + macchina);
		
		String risultato = valutaScelte(umano, macchina);
		
		if (risultato.equals("PAREGGIO"))
			System.out.println("Il risultato è " + risultato);
		else
			System.out.println("Vince " + risultato);
		
	}

	private static String valutaScelte(String umano, String macchina) {

		//String risposta = "UMANO";
		
		if (umano.equalsIgnoreCase(macchina)) {
			return "PAREGGIO";
		} else {
			switch(umano.toUpperCase()) {
			
				case "P":
					if (macchina.equalsIgnoreCase("C"))
						return "MACCHINA";
					break;	
				case "F":
					if (macchina.equalsIgnoreCase("P"))
						return "MACCHINA";
					break;	
				case "C":
					if (macchina.equalsIgnoreCase("F"))
						return "MACCHINA";
					break;	
				default:
					return "MACCHINA";
			}
		}
		
		return "UMANO";
	}

	private static String chiediAllaMacchina() {

		Random random = new Random();
		
		String[] scelte = {"P", "F", "C"};

		int nextInt = random.nextInt(scelte.length);
		
		return scelte[nextInt];
	}

	private static String chiediAllUmano() {

		Scanner input = new Scanner(System.in);
		String risposta = null;
		
		System.out.println("Scegli tra:");
		System.out.println("P: pietra");
		System.out.println("F: forbici");
		System.out.println("C: carta");
		
		risposta = input.nextLine();
		
		input.close();
		
		return risposta;
	}
	
	
	
	
	
	
	
	
	
	

}
