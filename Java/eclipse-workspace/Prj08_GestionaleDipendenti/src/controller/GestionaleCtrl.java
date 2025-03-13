package controller;

import java.util.ArrayList;

import model.Dipendente;

public class GestionaleCtrl {

	private ArrayList<Dipendente> libroMatricola;
	private String azienda;
	
	public GestionaleCtrl(String azienda) {
		this.libroMatricola = new ArrayList<>();
		this.azienda = azienda;
	}
	
	public void addDipendente(Dipendente d) {
		this.libroMatricola.add(d);
	}

	public Dipendente getDipendente(int nMat) {
		//TODO: dopo la pausa trovare una strategia
		return null;
	}
	
	
}
