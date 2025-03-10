package autosalone;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class AutoDemo {

	public static void main(String[] args) throws FileNotFoundException {

		Automobile auto1 = new Automobile("Ferrari", "California","Rosso",500_000, 10_000);
		Automobile auto2 = new Automobile("Porsche", "Cayman","Blu",100_000, 100_000);
		Automobile auto3 = new Automobile("BMW", "X7","Verde",50_000, 200_000);
		Automobile auto4 = new Automobile("Fiat", "Panda","Giallo",5_000, 150_000);
		Automobile auto5 = new Automobile("Nissan", "Qashqay","Grigio top",20_000, 70_000);
		Automobile auto6 = new Automobile("Fiat", "500X","Torres",12_000, 50_000);

//		Automobile[] garage = new Automobile[6];//ho creato un array di Automobile 
//		garage[0] = auto1;
//		garage[1] = auto2;
//		garage[2] = auto3;
//		garage[3] = auto4;
//		garage[4] = auto5;
//		garage[5] = auto6;
		
		Automobile[] garage = {auto1, auto2, auto3, auto4, auto5, auto6};
		
		File fileOutput = new File("elenco.html");
		PrintWriter output = new PrintWriter(fileOutput);
		
		output.println("<ul>");
		
		for (Automobile automobile : garage) {
			output.print("<li>");
			output.print(automobile.modello + ", " + automobile.prezzo);
			output.println("</li>");
		}
		
		output.println("</ul>");
		output.close();
		System.out.println("Ho finito, grazie!");
	}

}
