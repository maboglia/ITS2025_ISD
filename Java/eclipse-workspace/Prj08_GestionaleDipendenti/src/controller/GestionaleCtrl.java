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
		
		for (Dipendente dipendente : libroMatricola) {
			if (dipendente.getnMat() == nMat)
				return dipendente;
		}
		
		return null;
	}
	
	public ArrayList<Dipendente> getDipententi(){
		return this.libroMatricola;
	}
	
	public void updateDipendente(Dipendente d) {
		//TODO: verificare il funzionamento
		int posizioneDipendente = this.libroMatricola.indexOf(d);
		libroMatricola.set(posizioneDipendente, d);
	}
	
	public void deleteDipendente(Dipendente d) {
		this.libroMatricola.remove(d);
	}
}
