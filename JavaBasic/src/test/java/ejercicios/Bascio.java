package ejercicios;

import java.util.Scanner;

public class Bascio {

	public void basicoOne() {
		
		/**Escribe un programa java que declare una variable A de tipo entero y asígnale un valor. 
		 * A continuación muestra un mensaje indicando si A es par o impar. Utiliza el operador condicional ( ? : )
		   dentro del println para resolverlo.*/
		
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("escriba un numero");
		
		a = Integer.parseInt(sc.nextLine());
		
		if (a%2 == 0) {
			System.out.println("numero par: " + a);
		}else {
			System.out.println("numero impar: " + a);
		}
		
	}
	
	public void basicoTwo() {
		/**Escribe un programa java que declare una variable B de tipo entero y asígnale un valor. 
		 * A continuación muestra un mensaje indicando si el valor de B es positivo o negativo. Consideraremos el 0 
		 * como positivo. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.*/
		
		int B;
		Scanner sc = new Scanner(System.in);
		System.out.println("escriba un numero");
		 B = Integer.parseInt(sc.nextLine());
		 
		 if(B >= 0) {
			 System.out.println("numero positivo:  " + B);
		 }
		 else {
			 System.out.println("numero negativo " + B);
		 }
		
		
	}
	
	public void basicoThree() {
		/**Escribe un programa java que declare una variable C de tipo entero y asígnale un valor. 
		 * A continuación muestra un mensaje indicando si el valor de C es positivo o negativo, si es par o impar, 
		 * si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100. Consideraremos el 0 como positivo.
		 *  Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.*/
		
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("escriba un numero");
		 c = Integer.parseInt(sc.nextLine());
		 
		 if(c >= 0 ) {
			 System.out.println("numero positivo:  " + c);
		 }
		 else {
			 System.out.println("numero negativo:  " + c);
			 
		 }
		 if (c%2==0) {
			 System.out.println("numero par " + c);
		} else{
			 System.out.println("numero impar:  " + c);
		 }
		 if (c%5==0) {
			 System.out.println("numero multiplo de 5 " + c);
		} else{
			 System.out.println("numero no es multiplo de 5:  " + c);
		 }
		 if (c%10==0) {
			 System.out.println("numero multiplo de 10 " + c);
		} else{
			 System.out.println("numero no es multiplo de 10:  " + c);
		 }if (c>100) {
			 System.out.println("es mayor que 100 " + c);
		} else{
			 System.out.println("es menor que 100:  " + c);
		 }
		
	}
	
}
