package Figuras;

public class Circulo extends Figura 
{
    private double radio;
    
    static final double pi = 3.1415;

    private static final String tipoF = "Circulo";

    public Circulo(double radio) 
    {
    	super(tipoF);
        this.radio = radio;
    }

    public double getRadio() 
    {
        return radio;
    }

    public void setRadio(double radio) 
    {
        this.radio = radio;
    }

    @Override
    public String getArea() 
    {
    	area = pi * radio * radio;
        return " es pi (3,1415..) x radio: " + this.getRadio() + " al cuadrado= " + String.valueOf(area);
    }

    
}