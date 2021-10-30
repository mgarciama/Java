package domain;

// la palabra reservada extends sirve para llamar a la clase padre
// sino ponemos este código no podemos llamar a los objetos
public class Empleados extends Persona {

	private int idEmpleado;
	private double sueldo;
	
	private static int contadorEmpleado;

	public Empleados() {
		//aquí siempre esta la palabra super(); si no aparece
		this.idEmpleado = ++contadorEmpleado;
	}
	
	
	public Empleados(String nombre, double sueldo) {
		//super(nombre);
		this();// llama al primer constructor que tenemos y luego continua con su flujo
		this.nombre = nombre;
	//	this.idEmpleado = ++contadorEmpleado;
		this.sueldo = sueldo;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}



	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [idEmpleado=");
		builder.append(idEmpleado);
		builder.append(", nombre="); 
		builder.append(this.nombre);//si ponemos en la clase padre private, la palabra reservada this, no saltaría
		builder.append(", sueldo=");
		builder.append(sueldo);
		builder.append("]");
		
		builder.append("\n[metodo Super. de empleados]");
		builder.append(super.toString()); // podemos llamar directamente con esta propieda por el constructor padre para llamar a todos los elementos
		return builder.toString();
	}

	//con este metodo si se puede modificar


	


	
}
