package primitivos;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EjercicioPrimitivo {

	public static void main(String arg[]) {
		tienda_de_libro();
	}
	
	public static void tienda_de_libro() {
		var scanner = new Scanner(System.in);
		System.out.println("Introduzca el nombre del libro: ");
		
		var nombre = scanner.nextLine();
	
		if(Pattern.matches("[a-zA-Z] +", nombre) == nombre.length() > 50) {
			System.out.println("Introduzca el numero ID: ");
			int id = Integer.parseInt( scanner.nextLine());
			System.out.println("Introduzca el precio");
			double precio = Double.parseDouble(scanner.nextLine());
			System.out.println("introduzca el simbolo(€, $)");
			char simbolo = scanner.nextLine().charAt(0);;
			//System.out.println(simbolo);
			System.out.println("¿Quieres envio gratuito? elegina si o no");
			String gratis = String.valueOf(scanner.nextLine());
			if(gratis.equals("si")) {
				System.out.println("has elegido gratis");
				System.out.println(nombre +" #" + id);
				System.out.println(precio+""+simbolo);
				System.out.println("Envio gratuito: " + gratis);
				
			}
			else if(gratis.equals("no")) {
				System.out.println("has elegido de pago");
				System.out.println(nombre +" #" + id);
				System.out.println(precio+""+simbolo);
				System.out.println("Envio gratuito: " + gratis);
				System.out.println("coste de envio: 3.52€");
			}
			//System.out.println("error");
		}
		else {
			System.out.println("error");
		}
		
		
	}
}
