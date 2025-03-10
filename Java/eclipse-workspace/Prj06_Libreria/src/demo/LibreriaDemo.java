package demo;

import controller.LibreriaCtrl;
import model.Libro;

public class LibreriaDemo {

	public static void main(String[] args) {

		Libro libro1 = new Libro(1, "Io robot", 10, 100, 1);
		Libro libro2 = new Libro(2, "Tu robot", 12, 90, 2);
		
		LibreriaCtrl ctrl = new LibreriaCtrl(2);
		
		ctrl.addLibro(libro1, 0);
		ctrl.addLibro(libro2, 1);

		try {
			System.out.println(ctrl.getLibro(2));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Ehi tu!! Non devi chiedere questi numeri alti");
			System.err.println(e.getMessage());
		}
		

		
		System.out.println("Game Over");
		
	}

}
