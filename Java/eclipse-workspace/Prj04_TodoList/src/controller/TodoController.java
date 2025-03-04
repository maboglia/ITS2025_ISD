package controller;

import model.Todo;

public class TodoController {

	private Todo[] lista;
	
	public TodoController() {
		this.lista = new Todo[10];
	}
	//overload - sovraccarico
	public TodoController(int numeroNote) {
		this.lista = new Todo[numeroNote];
	}
	
	public void addTodo(String descrizione, int pos) {
		Todo temp = new Todo(descrizione);//creo il todo
		this.lista[pos] = temp; //aggiungo il Todo alla posizione pos
	}
	
	public Todo[] getLista() {
		return lista;
	}
	
	public Todo getTodoByPosition(int pos) {
		return this.lista[pos];
	}
	
	
	
	
	
}
