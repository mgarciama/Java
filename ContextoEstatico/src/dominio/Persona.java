package dominio;

public class Persona {

	private int idPersona;
	private String nombre;
	// si quitamos el static no nos permite contar, porque permite como un valor unico
	private static int contador;
	
	public Persona(String nombre) {
		this.nombre = nombre;
		//incrementamos el contador por cada objeto
		contador ++;
		//Aginamos un nuevo valor de la variable idPersona
		this.idPersona = contador;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Persona.contador = contador;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + "]";
	}
	
	
}
