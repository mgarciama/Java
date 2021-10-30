package tarea;

public class Saludar {

	public static void main(String arg[]) {
		
		saludo("ohh");
		
	}

	public static void saludo(String hola) {
		
		if(hola.equals("hola")) {
			System.out.println("te ha saludado");
		}
		else if(hola.equals("adios")) {
			System.out.println("se ha despedido");
		}
		else {
			System.out.println("no se entera");
		}
	}
}
