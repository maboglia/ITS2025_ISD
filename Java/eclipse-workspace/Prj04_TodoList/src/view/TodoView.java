package view;

import controller.TodoController;
import model.Todo;
import utilities.MioScanner;

public class TodoView {

	public static void main(String[] args) {//inizia il main
		
		MioScanner scanner = new MioScanner();
		TodoController ctrl = creaBloccoNote(scanner);
		stampaLista(ctrl);

	}//finisce il main

	private static TodoController creaBloccoNote(MioScanner scanner) {
		int numNote = scanner.leggiIntero("Quante note vuoi inserire?");
		TodoController ctrl = new TodoController(numNote);
		String risposta = null;
		
		for (int i = 0; i < numNote; i++) {
			risposta = scanner.leggiStringa("Dammi la descrizione del Todo");
			ctrl.addTodo(risposta, i);
		}
		return ctrl;
	}

	private static void stampaLista(TodoController ctrl) {
		for (Todo todo : ctrl.getLista()) {
			System.out.println(todo);
		}
	}

	
	
}//finisce la classe Todo
