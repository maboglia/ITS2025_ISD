package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Dirigente extends Dipendente {

	private double mensile;
	private ArrayList<Dipendente> responsabileDi;
	private final double COSTO_PER_DIP = 50;
	
	public Dirigente(String nome, String cognome, LocalDate dataNascita) {
		super(nome, cognome, dataNascita);
		this.responsabileDi = new ArrayList<Dipendente>();
	}

	@Override
	public double calcolaStipendio() {
		// TODO Auto-generated method stub
		return mensile + (responsabileDi.size() * COSTO_PER_DIP);
	}

	public double getMensile() {
		return mensile;
	}

	public void setMensile(double mensile) {
		this.mensile = mensile;
	}

	public ArrayList<Dipendente> getResponsabileDi() {
		return responsabileDi;
	}

	
	
}
