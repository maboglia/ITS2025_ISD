package laboratorio;

public class ProvaDiCarattere {

	public static void main(String[] args) {


		final int NUMERO = 60000;
		
		for (int i = 0; i < NUMERO; i++) {
			System.out.print( (char) i );
			
			if (i % 80 == 0) {
				System.out.println();
			}
		}
		
		
		

	}

}
