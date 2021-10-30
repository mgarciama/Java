package domain;

public class Persona {

	//protected: las clases hijas pueden acceder directamente y modificarlo.
	//privade: las clases hijas va a poder acceder de manera indirecta, utilizando metodos get y set
	protected String nombre;
	protected char genero;
	protected int edad;
	protected String direccion;
	/**creamos un constructor vacio, para crear objetos de tipo persona sin necesidad
	 * de inicializar los atributos de la clase*/
	public Persona() {
		
	}
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	public Persona(String nombre, char genero, int edad, String direccion) {
		//super();// con super, podemos llamar desde hijo a padre
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	//este metodo no se puede modificar
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + "]";
	}
	
}
