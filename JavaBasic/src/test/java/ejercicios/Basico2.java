package ejercicios;

import java.util.Scanner;

public class Basico2 {

	
	public void cantidadGrados() {
		/*Programa que lea una cantidad de grados cent�grados y la pase a grados Fahrenheit.
		*/
		Scanner sc = new Scanner(System.in);
        double gradosC, gradosF;
        System.out.println("\nIntroduce grados Cent�grados:");
        gradosC = sc.nextDouble();
        //grados centigrados a fahrenheit, es: 
        gradosF = 32 + (9 * gradosC / 5);
        //grados centigrados y fahrenheit
        System.out.println(gradosC +" �C = " + gradosF + " �F");      
		
	}
}
