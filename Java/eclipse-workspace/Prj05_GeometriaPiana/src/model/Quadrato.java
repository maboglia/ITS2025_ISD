package model;

public class Quadrato extends Rettangolo {

	private Segmento lato;
	
	public Quadrato(Segmento lato) {
		super(lato, lato);//stiamo costruendo un rettangolo
		this.lato = lato;
		this.nome = "Quadrato";
	}

	@Override
	public double perimetro() {
		return this.lato.lunghezza() * 4;
	}

	@Override
	public double area() {
		return Math.pow(this.lato.lunghezza(), 2);
	}

	@Override
	public String toString() {
		return "Quadrato [lato=" + lato 
				+ ", perimetro()=" + perimetro() 
				+ ", area()=" + area() 
				+ "]";
	}

	
	
}
