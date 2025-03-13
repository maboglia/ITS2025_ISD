package model;

import java.time.LocalDate;

public class Impiegato extends Dipendente {

	private double pagaBase;
	private int oreLavoro;
	
	public Impiegato(String nome, String cognome, LocalDate dataNascita) {
		super(nome, cognome, dataNascita);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcolaStipendio() {
		// TODO Auto-generated method stub
		return pagaBase * oreLavoro;
	}

	public double getPagaBase() {
		return pagaBase;
	}

	public void setPagaBase(double pagaBase) {
		this.pagaBase = pagaBase;
	}

	public int getOreLavoro() {
		return oreLavoro;
	}

	public void setOreLavoro(int oreLavoro) {
		this.oreLavoro = oreLavoro;
	}

	
	
}
