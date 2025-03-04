package gioco;

public class GiocoBello {

	public static void main(String[] args) {
		
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		
		for (int i = 0; i < 100; i++) {
					
		int res1 = dado1.lancia();
		int res2 = dado2.lancia();
		
		System.out.println("Il risultato del dado 1 è " + res1);
		System.out.println("Il risultato del dado 2 è " + res2);
		
		if (res1==res2) {
			System.out.println("HAI VINTOOOOOOOOOOOOOOOOO");
		}
		}

		
		
	}
	
}
