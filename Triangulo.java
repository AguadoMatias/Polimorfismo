package Figuras;

public class Triangulo extends Figura {
	 private double base;
	 private double altura;
	 private static final String tipoF = "Triangulo";
	    	
	    
	    public Triangulo(double base, double altura) 
	    {
	    	super(tipoF);
	        this.base = base;
	        this.altura = altura;
	    }
	    
	    public double getBase() 
	    {
	        return base;
	    }

	    public void setBase(double base)
	    {
	        this.base = base;
	    }

	    public double getAltura() 
	    {
	        return altura;
	    }

	    public void setAltura(double altura) 
	    {
	        this.altura = altura;
	    }

	    @Override
	    public String getArea() 
	    {
	    	area = base * altura / 2;
	    	return " es " + " (base: " + this.getBase() +" x " + " altura: " + this.getAltura() + ") / 2= " + String.valueOf(area);
	    }
	        
	    
	    
	}