package demo;

public class CounterDemo {

	public static void main(String[] args) {
		
		Counter c1 = new Counter(15, "Contatore giallo");
		c1.incrementa();
		c1.incrementa();
		c1.incrementa();
		c1.decrementa();
		System.out.println( c1 );
		
		Counter c2 = new Counter(1000, "Contatore verde");
		c2.incrementa();
		c2.incrementa();
		c2.incrementa();
		c2.decrementa();
		System.out.println( c2 );
		

		

	}

}
