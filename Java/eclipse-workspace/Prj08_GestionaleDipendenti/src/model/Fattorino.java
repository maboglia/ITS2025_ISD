package model;

import java.time.LocalDate;

public class Fattorino extends Dipendente {

	private double pagaBase;
	private int numConsegne;
	
	public Fattorino(String nome, String cognome, LocalDate dataNascita) {
		super(nome, cognome, dataNascita);
		// TODO Auto-generated constructor stub
	}
	
	
	public double getPagaBase() {
		return pagaBase;
	}

	public void setPagaBase(double pagaBase) {
		this.pagaBase = pagaBase;
	}

	public int getNumConsegne() {
		return numConsegne;
	}

	public void setNumConsegne(int numConsegne) {
		this.numConsegne = numConsegne;
	}

	@Override
	public double calcolaStipendio() {
		// TODO Auto-generated method stub
		return pagaBase * numConsegne;
	}

}
