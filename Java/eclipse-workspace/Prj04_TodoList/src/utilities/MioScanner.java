package utilities;

import java.util.Scanner;

public class MioScanner {

	Scanner canon;
	
	public MioScanner() {
		this.canon = new Scanner(System.in);
	}
	
	public String leggiStringa(String domanda) {
		System.out.println(domanda);
		
		String risposta = this.canon.nextLine();//legge una string fino alla pressione di invio
		return risposta;
		
	}
	
	public int leggiIntero(String domanda) {
		System.out.println(domanda);
		int risposta = this.canon.nextInt();
		
		this.canon.nextLine();//consumare il fine linea

		return risposta;
	}
	
	
}
