package demo;

import java.time.LocalDate;

import controller.GestionaleCtrl;
import model.Dipendente;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;

public class DemoGestionale {

	public static void main(String[] args) {
		Dipendente d1 = new Fattorino("mauro", "rossi", LocalDate.of(2000, 4, 1));
		Dipendente d2 = new Impiegato("paolo", "verdi", LocalDate.of(2001, 3, 2));
		Dipendente d3 = new Dirigente("giovanna", "gialli", LocalDate.of(2002, 2, 3));
		Dipendente d4 = new Fattorino("francesca", "blue", LocalDate.of(2003, 1, 4));

		GestionaleCtrl ctrl = new GestionaleCtrl("ITS 2025 ISD");
		
		ctrl.addDipendente(d1);
		ctrl.addDipendente(d2);
		ctrl.addDipendente(d3);
		ctrl.addDipendente(d4);
		
		for(Dipendente d : ctrl.getDipententi()) {

			if (d instanceof Fattorino) {//faccio il cast e gestisco il fattorino
				((Fattorino) d).setPagaBase(5);
				((Fattorino) d).setNumConsegne(100);
			} 
			else if (d instanceof Impiegato) {//faccio il cast e gestisco l'impiegato

				((Impiegato) d).setPagaBase(8);
				((Impiegato) d).setOreLavoro(160);
			}
			else {//faccio il cast e gestisco il dirigente
				((Dirigente) d).setMensile(1000);
				((Dirigente) d).getResponsabileDi().add(d1);
				((Dirigente) d).getResponsabileDi().add(d2);
				((Dirigente) d).getResponsabileDi().add(d4);
			}
		}
		
		
		System.out.println("Stipendi del mese di marzo 2025");
		double totale = 0;
		
		for (Dipendente d : ctrl.getDipententi()) {
			System.out.printf("Lo stipendio del dipendente %s è di € %.2f %n", d.getCognome(), d.calcolaStipendio());
			totale += d.calcolaStipendio();
		}
		
		System.out.println("Il totale degli stipendi del mese € " + totale);
		
		
		
		
	}

}
