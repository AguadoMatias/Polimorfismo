package Figuras;

public abstract class Figura {
	public String tipo;
	public double area;
	
	public Figura(String tipo) {
		this.tipo = tipo;
	}
// getters & setters
	public abstract String getArea();
	
	public String getTipo(){
		return tipo;
	}
}
	
	