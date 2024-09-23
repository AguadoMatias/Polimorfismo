package Figuras;

import java.util.Scanner;


public class Polimorfismo {
	
	public static void main(String[] args) 
    {
		Figura f = null;		
		int opcion = 0;		
		do 
		{	
				opcion = obtenerSeleccionMenu();
				switch(opcion)
				{
				case 1:					
					f = new Cuadrado(10);					
					break;
				case 2:
					f = new Circulo(200);					
					break;

				case 3:
					f = new Rectangulo(100, 20);
					break;

				case 4:
					f = new Triangulo(5, 10);
					break;									

				default:
					if (opcion != 0) System.out.println("Debe seleccionar una opcion valida");

				}
				if (opcion != 0) System.out.println("Area del " + f.getTipo() + f.getArea());							
	
				
		} while ((opcion != 0) && (opcion <= 6));	
		System.out.println("\nGracias por utilizar el calculo de Area! ");
		
    }
	
	public static int obtenerSeleccionMenu() 
	{
				
		System.out.println("\n ---------------------------------------------\n");
		System.out.println("Bienvenidos al programa de calculo de area de las figuras geometricas! \n");
		System.out.println("Por favor seleccione el tipo de figura para la que desea calcular el area:\n ");
		System.out.println(" 1.-> Cuadrado\n");
		System.out.println(" 2.-> Circulo\n");
		System.out.println(" 3.-> Rectangulo\n");
		System.out.println(" 4.-> Triangulo.\n");		
		System.out.println("Para abandonar el programa ingrese 0 (cero)");
		System.out.println("\n ---------------------------------------------\n");
		
		
		
		Scanner entrada = new Scanner(System.in);
		int opcion = entrada.nextInt();
		
		return opcion;
	}
}
