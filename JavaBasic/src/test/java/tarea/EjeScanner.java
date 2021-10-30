package tarea;

import java.util.Scanner;

public class EjeScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prueba2();
	}

	public static void prueba2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Elija una de las siguientes opciones: "
				+ "\n autor \' 1 \'"
				+ "\n título \' 2 \'"
				+ "\n ambos  \' 3 \'");
		
		var opcion = sc.nextLine();


		if(opcion.equals("1")) {
			System.out.print("escriba el autor por favor:");
			var name = sc.nextLine();
			System.out.println(name + " escribio Juego de Tronos");
			
		}
		else if(opcion.equals("2")) {
			System.out.print("escriba el titulo por favor:");
			var nameTitulo = sc.nextLine();
			System.out.println(nameTitulo + " fue escrito por: George");
		} 
		else if (opcion.equals("3")) {
			System.out.print("Proporciona el titulo: ");
			var tituloFinal = sc.nextLine();
			System.out.print("Proporciona el autor: ");
			var autorFinal = sc.nextLine();
			System.out.println(tituloFinal + " fue escrita por: " + autorFinal);
		}
		else {
			System.out.println("lo siento");
			
		}
		
	}
}
