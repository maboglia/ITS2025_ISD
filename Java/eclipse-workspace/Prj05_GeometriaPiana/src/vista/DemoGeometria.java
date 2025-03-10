package vista;

import model.*;

public class DemoGeometria {

	public static void main(String[] args) {

		Punto a = new Punto(3, 2);
		Punto b = new Punto(7, 2);
		Punto c = new Punto(3, 5);
		
		Segmento ab = new Segmento(a, b);//4
		Segmento ac = new Segmento(a, c);//3
		Segmento bc = new Segmento(b, c);//5
		
		System.out.println("Punto a " + a);
		System.out.println("Punto b " + b);
		System.out.println("Punto c " + c);

		System.out.println("Segmento ab " + ab);
		System.out.println("Segmento ac " + ac);
		System.out.println("Segmento bc " + bc);
		
		Rettangolo r = new Rettangolo(ab, ac);
		
		System.out.println(r);
		
		Quadrato q = new Quadrato(ab);
		
		System.out.println(q);
		
		Rettangolo q2 = new Quadrato(bc);
		
		
		
	}

}
