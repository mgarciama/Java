package prueba;

import dominio.Persona;

public class Prueba {

	private int DNI;
	private String Nombre;
	private int number;
	private static int contador;
	private String Letra;
	//importante, la colocación del constructor debe ser del mismo orden como lo quieres llamar 
	public Prueba(int dni, String letra,String nombre ) {
		this.DNI = dni;
		this.Nombre = nombre;
		this.Letra = letra;
		this.number = ++contador;
		
	}
	public int getDNI() {
		return this.DNI;
	}
	public void setDNI(int dni) {
		this.DNI = dni;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Prueba.contador = contador;
	}
	public String getLetra() {
		return Letra;
	}
	public void setLetra(String letra) {
		this.Letra = letra;
	}
	
	@Override
	public String toString() {
		return "Persona [DNI=" + DNI +Letra+ ", nombre=" + Nombre + "cantidad registradas: "+number + " ]";
	}
}
