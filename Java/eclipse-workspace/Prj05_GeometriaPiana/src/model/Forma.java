package model;

public abstract class Forma {

	protected String nome;
	
	public Forma() {
		System.out.println("Forma costruita");
		this.nome = "Forma geometrica";
	}

	public abstract double area() ;
	
	@Override
	public String toString() {
		return "Forma [nome=" + nome 
				+ " area " + area()
				+ "]";
	}
	
	
	
}
