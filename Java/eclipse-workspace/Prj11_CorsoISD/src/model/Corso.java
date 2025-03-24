package model;

public class Corso {

	private int id;
	private String nome;
	private int ore;
	private Docente docente;
	
	public Corso(int id, String nome, int ore, Docente docente) {
		this.id = id;
		this.nome = nome;
		this.ore = ore;
		this.docente = docente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getOre() {
		return ore;
	}

	public void setOre(int ore) {
		this.ore = ore;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	
	
	
	
}
