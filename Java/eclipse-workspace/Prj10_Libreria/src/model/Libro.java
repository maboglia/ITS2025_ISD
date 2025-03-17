package model;

public class Libro implements Comparable<Libro> {

	private int id;
	private String titolo;
	private double prezzo;
	private int pagine;
	
	//da cambiare con oggetto editore, 
	//quando il collega ha finito
	private int editore;

	/**
	 * Costruttore del libro
	 * @param id
	 * @param titolo
	 * @param prezzo
	 * @param pagine
	 * @param editore
	 */
	public Libro(int id, String titolo, double prezzo, int pagine, int editore) {
		this.id = id;
		this.titolo = titolo;
		this.prezzo = prezzo;
		this.pagine = pagine;
		this.editore = editore;
	}

	//getters e  setters
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

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	public int getEditore() {
		return editore;
	}

	public void setEditore(int editore) {
		this.editore = editore;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", prezzo=" + prezzo + ", pagine=" + pagine + ", editore="
				+ editore + "]";
	}

	@Override
	public int compareTo(Libro altro) {
		
		return Double.compare(this.prezzo, altro.prezzo);
				//     100             101
		//return this.pagine - altro.pagine;
		//return this.titolo.compareTo(altro.titolo);
	}
	
	
}
