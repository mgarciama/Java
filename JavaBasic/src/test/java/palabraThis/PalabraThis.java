package palabraThis;

public class PalabraThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona pe = new Persona("manu","gg");
		System.out.println("Nos indica el paquete y la posición de la memoria "+ pe);
		System.out.println(pe.nombre +" "+ pe.apellido);
	}
	
	
}
//SOLO SE USARA EN ESTE PAQUETE CON LA PALABRA THIS
	class Persona {
	String nombre;
	String apellido;
	Persona(String nombre, String apellido) {
		//super(); llamada al contructor de la clase padre = objetc, para reservar memoria
		this.nombre = nombre;
		this.apellido = apellido;
	}
		
	}