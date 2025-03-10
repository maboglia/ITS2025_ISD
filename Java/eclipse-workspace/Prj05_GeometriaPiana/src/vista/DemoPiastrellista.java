package vista;

import model.*;

public class DemoPiastrellista {

	public static void main(String[] args) {

		Punto a = new Punto(3, 2);
		Punto b = new Punto(7, 2);
		Punto c = new Punto(3, 5);
		
		Segmento ab = new Segmento(a, b);//4
		Segmento ac = new Segmento(a, c);//3
		Segmento bc = new Segmento(b, c);//5
		
		Forma[] stanze = new Forma[4];
		
		stanze[0] = new Rettangolo(ab, ac); //12mq
		stanze[1] = new Triangolo(a, b, c);//6 mq
		stanze[2] = new Quadrato(ac);//9
		stanze[3] = new Rettangolo(ac, bc);//15mq
		
		double totaleMQ = 0;
		
		for (Forma stanza : stanze) {
			totaleMQ += stanza.area();
		}
		
		System.out.println("La superficie totale dell'appartamento");
		System.out.println(totaleMQ + "mq");
		
	}

}
