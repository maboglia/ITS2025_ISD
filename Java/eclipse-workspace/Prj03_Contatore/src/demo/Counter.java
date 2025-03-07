package demo;

public class Counter {

	String nomeCounter;
	int number;
	
	//metodo costruttore: si deve chiamare come l'oggetto che costruisce, non ha tipo di ritorno
	
	/**
	 * Questo è il metodo costruttore del contatore
	 * @param valoreIniziale inserire come primo argomento il valore iniziale del counter
	 * @param nomeDiQuestoCounter inserire come secondo argomento il nome del counter
	 */
	public Counter(int number, String nomeDiQuestoCounter) {
		
		//assegno un valore alle proprietà dell'oggetto
		nomeCounter = nomeDiQuestoCounter;
		this.number = number;
		//do un feedback all'utente sulla creazione dell'oggetto
		System.out.println( this );
	}
	
	public void incrementa() {
		number = number + 1;
	}
	
	public void decrementa() {
		number -= 1;
	}
	
	public int getValoreCounter() {
		return number;
	}
	
	public String toString() {
		String risposta = new String("");
		risposta += "-".repeat(80);
		risposta += "\n";
		risposta += "Oggetto counter: " + nomeCounter ;
		risposta += "\nValore attuale del counter: " + number ;
		return risposta;
	}
	
}
