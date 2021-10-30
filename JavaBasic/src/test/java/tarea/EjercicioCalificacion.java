package tarea;

import java.util.Scanner;

public class EjercicioCalificacion {

	public static void main(String[] args) {
		//realizadoWitch();
		realizadoIF();
		
	}
		
	public static void realizadoIF() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10:");
       int calificacion = Integer.parseInt(scanner.nextLine());
       //Si esta entre 9 y 10 imprimir: A
       if (calificacion >= 9 && calificacion <= 10)
           System.out.println("A");
       //Si esta entre  8 y menor a 9 imprimir: B
       else if(calificacion >= 8 && calificacion < 9)
           System.out.println("B");
       //Si esta entre 7 y menor a 8 imprimir: C
       else if(calificacion >= 7 && calificacion < 8)
           System.out.println("C");
       //Si esta entre 6 y menor a 7 imprimir: D
       else if(calificacion >= 6 && calificacion < 7)
           System.out.println("D");
       //Si esta entre 0 y menor a 6 imprimir: F
       else if(calificacion >= 0 && calificacion < 6)
           System.out.println("F");
       //Si no esta en el rago, imprimir: Valor desconocido
       else
           System.out.println("Valor desconocido");
   
	
	}
	public static void realizadoWitch() {
		
		var user = new Scanner(System.in);
		System.out.println("Proporciona un numero entre 0 Y 10 :");
		var number = Integer.parseInt(user.nextLine());
		String impresion;
		switch (number) {
		case 9: case 10:
			impresion = "A+";
			break;
		case 8:    
			impresion = "B";
		case 7:
			impresion = "C";
			break;
		case 6: 
			impresion = "D";
			break;
		case 5: case 4: case 3: case 2: case 1: case 0:
			impresion = "F";
			break;
		default:
			impresion = "sorry, debe ser numeros enteros de 0 a 10";
			break;
		}
		System.out.println("imprimiendo... : "+ impresion);
	}
	

}
