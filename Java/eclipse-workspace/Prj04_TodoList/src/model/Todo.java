package model;

import java.time.LocalDate;

public class Todo {

	private String descrizione;
	private LocalDate data;
	private boolean completato;
	
	//costruttore
	public Todo(String descrizione) {//new Todo("Comprare pane");
		this.descrizione = descrizione;
		this.data = LocalDate.now();
		this.completato = false;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public boolean isCompletato() {
		return completato;
	}

	public void setCompletato(boolean completato) {
		this.completato = completato;
	}

	public String getDescrizione() {
		return descrizione;
	}

	@Override
	public String toString() {
		return "Todo [descrizione=" 
				+ descrizione + ", data=" 
				+ data + ", completato=" 
				+ completato 
				+ "]";
	}
	
	//to string 
	
	
	
	
}
