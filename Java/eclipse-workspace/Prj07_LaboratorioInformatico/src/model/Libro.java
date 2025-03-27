package model;

public class Libro implements Comparable<Libro>{

	private int id;
	private String titolo;
	private double prezzo;
	
	public Libro(int id, String titolo, double prezzo) {
		this.id = id;
		this.titolo = titolo;
		this.prezzo = prezzo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", prezzo=" + prezzo + "]";
	}

	@Override
	public int compareTo(Libro altroLibro) {
		// TODO Auto-generated method stub
		return altroLibro.titolo.compareTo(this.titolo);
		//         110         100     = 10
		//         100         100     = 0
		//         100         110     = -10
	}
	
	
	
	
}
