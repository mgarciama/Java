package ejercicios;

import java.util.Scanner;

public class Basico2 {

	
	public void cantidadGrados() {
		/*Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
		*/
		Scanner sc = new Scanner(System.in);
        double gradosC, gradosF;
        System.out.println("\nIntroduce grados Centígrados:");
        gradosC = sc.nextDouble();
        //grados centigrados a fahrenheit, es: 
        gradosF = 32 + (9 * gradosC / 5);
        //grados centigrados y fahrenheit
        System.out.println(gradosC +" ºC = " + gradosF + " ºF");      
		
	}
}
