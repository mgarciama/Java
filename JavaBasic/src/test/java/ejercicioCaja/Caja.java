package ejercicioCaja;

public class Caja {

	int ancho;
	int alto;
	int profundo;
	
	
	//constructor con los 3 argumentos
	public Caja(int ancho, int alto, int profundo) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.profundo = profundo;
		
		System.out.println("constructor con los 3 argumentos");
	}
	
	//constructor vacio
	public Caja() {
		System.out.println("constructor vacio");
	}
	public int calcularVolumen() {
		System.out.println("resultado: " + this.ancho * this.alto * this.profundo);
	return this.ancho * this.alto * this.profundo;
	}
	
	
	
}
