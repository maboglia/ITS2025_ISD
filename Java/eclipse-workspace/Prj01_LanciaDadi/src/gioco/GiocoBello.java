package gioco;

public class GiocoBello {

	public static void main(String[] args) {
		
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		
		final int NUM_LANCI = 1000_000;
		int vittorie = 0;
		
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < NUM_LANCI; i++) {
					
			int res1 = dado1.lancia();
			int res2 = dado2.lancia();
			
//			System.out.println("Il risultato del dado 1 è " + res1);
//			System.out.println("Il risultato del dado 2 è " + res2);
			
			if (res1==res2) {
				vittorie++;
//				System.out.println("HAI VINTOOOOOOOOOOOOOOOOO");
			}
		}
		long stop = System.currentTimeMillis();
		
		long durata = stop - start;
		double percentuale = (double) vittorie / NUM_LANCI;
		
		System.out.println("Hai giocato " + NUM_LANCI);
		System.out.println("Hai vinto " + vittorie);
		System.out.println("L'elaborazione è durata " + durata + "ms");
		System.out.println("La percentuale di successo " + percentuale);
		
	}
	
}
