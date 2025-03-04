package autosalone;

public class Automobile {

	String marca;
	String modello;
	String colore;
	double prezzo;
	int km;
	
	public Automobile(String marca, String modello, String colore, double prezzo, int km) {
		this.marca = marca;
		this.modello = modello;
		this.colore = colore;
		this.prezzo = prezzo;
		this.km = km;
	}

	@Override
	public String toString() {
		return "Automobile [marca=" + marca + ", modello=" + modello + ", colore=" + colore + ", prezzo=" + prezzo
				+ ", km=" + km + "]";
	}
	
	
	
	
}
