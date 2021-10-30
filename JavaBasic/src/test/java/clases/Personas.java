package clases;

public class Personas {
	//para acceder una clase publica podemos llamar desde cualquier fichero
	//si es privada, solo permite llamar dentro de esa misma clase
	
	//atributos de la clases
	public String nombre;
	public String apellido;
	public Number edad;
	
	//metodos
	public void desplegarInformacion() {

		/** metodos: 
		 *  un metodo es una parte de código que vamos a utilizar.
		 *  Podemos llamar tantas veces como queramos o necesitamos, además puede recibir valores.
		 *  Estos valores se conoce como argumentos, puede regresar valores que se le conoce como valor de retorno
		 * */
		//al ser un atributo de nuestra clase, podemos utilizar ese atributo desde cualquier metodo definido 
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellido);
	}
}
