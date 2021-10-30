package variables;

import java.util.Scanner;

public class Variables_Caso2 {

	public static void main(String arg[]) {
		
	//caracteresEspeciales();
	//EjScanner();
		
	}
	public static void reglasVariables() {
		//anotaciones de camello
		var saludoDesdeJava = "hola desde java";
		System.out.println(saludoDesdeJava);
		/**definiciones de variables, si no queremos poner el valor como var, 
		 * podemos poner estas variables sin resultado, de tipo number, datos primitidos:
		 */
		int _hola;
		float $alido;
		char adios;
	}
	public static void caracteresEspeciales() {
		
		String nombre = "Manuel";
		String apellido = "García";
		System.out.println(nombre + " "+ apellido);
		System.out.println("////////////////////////");
		//nueva línea: \n
		System.out.println("nueva linea: \n " + nombre);
		System.out.println("////////////////////////");
		//tabulador \t
		System.out.println("Tabulador: \t" + apellido);
		System.out.println("////////////////////////");
		//retroceso \b
		System.out.println("retroceso: \b" + apellido);
		//retorno de carro \r
		System.out.println("////////////////////////");
		System.out.println("retorno de carro: \r" + nombre);
		//comillas simples \'
		System.out.println("////////////////////////");
		System.out.println("comillas simples: \'"+ nombre+"\'");
		//comillas doble \"
		System.out.println("////////////////////////");
		System.out.println("comillas doble: \""+ nombre+"\"");
		//nueva lína pero no hace salto de linea
		System.out.print("nueva linea");
		System.out.println("liena2");
	}
	public static void EjScanner() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el nombre de el usuario");
		var usuario = sc.nextLine();
		System.out.println("usuario: " + usuario);
	}
	public static void prueba() {
		var nombre = "Juan";
		System.out.println(nombre);
		nombre = "Carlos";
		System.out.println(nombre);
	}
	
}
