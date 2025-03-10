package model;

public class Triangolo extends Forma{

	protected Punto a, b, c;
	protected Segmento ab, ac, bc;

	public Triangolo(Punto a, Punto b, Punto c) {
		this.a = a;
		this.b = b;
		this.c = c;
	
		this.ab = new Segmento(a, b);
		this.ac = new Segmento(a, c);
		this.bc = new Segmento(b, c);
	
		this.nome = "Triangolo generico";
		
	}
	
	public double perimetro() {
		return ab.lunghezza() + ac.lunghezza() + bc.lunghezza();
	}
	
	public double superficie() {
		double sp = this.perimetro() / 2;
		
		double area = Math.sqrt(  
					sp  
					* (sp - ab.lunghezza() )                  
					* (sp - ac.lunghezza() )
					* (sp - bc.lunghezza() )
				);
		
		return area;
		
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.superficie();
	}
	
}
