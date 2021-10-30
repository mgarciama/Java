package dominio;

public class Persona {
//no pueden acceder ni modificar directamente -> private
	private String nombre;
	private double sueldo;
	private boolean eliminado;
	//se usa para llamar al objeto y Su función es inicializar el objeto y sirve para asegurarnos que los objetos siempre contengan valores válidos.
	public Persona(String nombre, double sueldo, boolean eliminado) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.eliminado = eliminado;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {
		return this.sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public boolean isEliminado() {
		return this.eliminado;
	}
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	//este metodo convierte a una cadena cada uno de los atributos que tenemos en nuestra clase
	//este metodo lleva a imprimir el estado de cada uno de los valores
	public String toString() {
		return "Persona: [nombre: "+this.nombre + 
				", sueldo: "+this.sueldo+
				", eliminado: "+ this.eliminado + "]";
	}
}
