package gioco;

public class Dado {

	int facce = 6;
	
	int lancia() {

		double random = Math.random();
		
		return (int)(random * facce)+1;
		
		
	}
	
}
