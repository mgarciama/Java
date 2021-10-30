package operadores;

import java.util.Scanner;

public class EjercicioOperadores {

	public static void main(String[] args) {
		//triangulo();
		dosValores();

	}

	public static void triangulo() {
		int alto;
		int ancho;
		
		var result = new Scanner(System.in);
		System.out.println("proporciona el alto ");
		alto = Integer.parseInt(result.nextLine());
		System.out.println("proporciona el ancho ");
		ancho  = Integer.parseInt(result.nextLine());
		var area = alto*ancho;
		var perimetro = (alto+ancho)*2;
		System.out.println("area " + area);
		System.out.println("perimetro " + perimetro);
		
	}
	public static void prueba() {
		int a;
		System.out.println("whrite");
		Scanner sc = new Scanner(System.in);
		a = Integer.parseInt(sc.nextLine());
	
		double b;
		b = Double.parseDouble(sc.nextLine());
		System.out.println("resultado de int " + a + "\n resultado de double "+ b);
		String c = String.valueOf(sc.next());
		System.out.println("resultado de String "+ c );
		
	}
	public static void dosValores() {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduzca un numero");
		double numeroMayor = Double.parseDouble(sc.nextLine());
		double numeroMenor = Double.parseDouble(sc.nextLine());
		
		if(numeroMayor > numeroMenor) {
			System.out.println("numero mayor " + numeroMayor);
		} else if(numeroMayor < numeroMenor) {
			System.out.println("numero menor " + numeroMenor);
		}
		
	}
}
