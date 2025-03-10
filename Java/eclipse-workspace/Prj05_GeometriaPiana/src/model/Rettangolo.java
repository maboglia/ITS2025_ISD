package model;

public class Rettangolo extends Forma {

	private Segmento base, altezza;
	
	public Rettangolo(Segmento base, Segmento altezza) {
		this.base = base;
		this.altezza = altezza;
		this.nome = "Rettangolo";
	}

	public double perimetro() {
		return (base.lunghezza() + altezza.lunghezza()) * 2;
	}

	public double area() {
		return this.base.lunghezza() * this.altezza.lunghezza();
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sono rettangolo con perimetro " + this.perimetro()
				+ " e con area " + this.area();

	}

	
	
}
