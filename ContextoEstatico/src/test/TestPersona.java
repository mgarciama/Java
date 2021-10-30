package test;

import dominio.Persona;

public class TestPersona {

	private int contador;
	
	public static void main(String[] args) {
		/**No podemos llamar la variable contador, ya que el metodo es un estatico, debemos hacer la siguiente manera*/
		Persona persona1 = new Persona("Manuel");
		//System.out.println("persona1: " + persona1);
		Persona persona2 = new Persona("Yoana");
		//System.out.println("persona2: " + persona2);
		imprimir(persona1);
		imprimir(persona2);
		
	}

	public static void imprimir(Persona personas) {
		System.out.println("personas: " + personas);
	}
	/***
	 * para llamar a contador;
	 * esto sería un meotodo dinamico
	 */
	public int getContador() {
		imprimir(new Persona("Karla"));
		return this.contador;
	}
}
