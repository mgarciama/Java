package objetoFinal;
//si ponemos la palabra final en la clase, no podemos modificar, ni crear hij@s, es decir:
	// poner extends a una clase para crear y llamar nuevos objetos
public final class ObjFinal {
	
	private String nombre;
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void imprimir() {
		System.out.println("clase final");
	}

}
