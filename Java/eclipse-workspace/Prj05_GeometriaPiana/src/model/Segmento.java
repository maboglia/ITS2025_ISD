package model;

public class Segmento {

	private Punto a, b;

	public Segmento(Punto a, Punto b) {//dependency injection 
		this.a = a;
		this.b = b;
	}

	public Punto getA() {
		return a;
	}

	public void setA(Punto a) {
		this.a = a;
	}

	public Punto getB() {
		return b;
	}

	public void setB(Punto b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Segmento [" + a + ", " + b + ", lunghezza = " + this.lunghezza() + "]";
	}
	
	public double lunghezza() {
		
		double diffX2 = Math.pow((  a.getX() - b.getX()  ), 2);//16
		double diffY2 = Math.pow((  a.getY() - b.getY()  ), 2);//0
		return Math.sqrt(diffX2 + diffY2);//4
	}
	
}
