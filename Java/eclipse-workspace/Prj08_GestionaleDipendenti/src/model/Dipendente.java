package model;

import java.time.LocalDate;

public abstract class Dipendente {

	private static int counter = 1;
	protected int nMat;
	protected String nome;
	protected String cognome;
	protected LocalDate dataNascita;
	
	public Dipendente(String nome, String cognome, LocalDate dataNascita) {
		this.nMat = counter++;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public int getnMat() {
		return nMat;
	}

	@Override
	public String toString() {
		return "Dipendente [nMat=" + nMat + ", nome=" + nome + ", cognome=" + cognome + ", dataNascita=" + dataNascita
				+ "]";
	}
	
	public abstract double calcolaStipendio();
	
	
}
