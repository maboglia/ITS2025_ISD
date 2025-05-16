package test;

import java.util.Random;

public class Laboratorio {

	public String saluto;
	//costante
	final int ETA = 30;

	public Laboratorio() {
		this.saluto = "Hello world";
	}
	
	public static void main(String[] args) {

		
		
		Laboratorio lab = new Laboratorio();
		lab.procedura();
		String parolaCasuale = lab.parolaCasuale("amore", "cuore", "pizza");
		System.out.println(parolaCasuale);
	}
	
	public String parolaCasuale(String... parole ) {
		Random r = new Random();
		int casuale = r.nextInt(0, parole.length);
		return parole[casuale];
	}
	
	public static void procedura() {
		System.out.println("procedura");
	}
}
