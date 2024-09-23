package Figuras;

public class Cuadrado extends Figura {
	
	private double lado;
    private static final String tipoF = "Cuadrado";

    public Cuadrado(double lado) 
    {
        super(tipoF);
    	this.lado = lado;
    }
    public Cuadrado() 
    {
        super(tipoF);    	
    }
    
    public double getLado() 
    {
        return lado;
    }

    public void setLado(double lado) 
    {
        this.lado = lado;
    }

    //@Override
     public String getArea() 
    {
        
    	area = lado * lado;
    	return " es " + " lado: " + this.getLado() + " al cuadrado= " + String.valueOf(area);
    }       
        

}
