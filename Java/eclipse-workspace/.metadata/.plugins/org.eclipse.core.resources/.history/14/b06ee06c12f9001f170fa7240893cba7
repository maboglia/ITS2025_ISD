package view;

import controller.TodoController;
import model.Todo;

public class TodoView {

	public static void main(String[] args) {
		TodoController ctrl = new TodoController(2);
		
		ctrl.addTodo("E' proprio l'ora", 0);
		ctrl.addTodo("Di andare in pausa", 1);
		
		Todo[] laCopiaDellaLista = ctrl.getLista();
		
		for (Todo todo : ctrl.getLista()) {
			System.out.println(todo);
		}
		
		

	}

}
