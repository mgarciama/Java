package ejercicio;

public class Cliente extends Persons{

	private int idCliente;
	private String date;
	private boolean vip;
	
	private static int contadorCliente;
	public Cliente(String nombre, char genero, int edad, String direccion,String date, boolean vip) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.direccion = direccion;
		this.idCliente = ++this.contadorCliente;
		this.date = date;
		this.vip = vip;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public boolean isVip() {
		return vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
	public static int getContadorCliente() {
		return contadorCliente;
	}
	public static void setContadorCliente(int contadorCliente) {
		Cliente.contadorCliente = contadorCliente;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [idCliente=");
		builder.append(idCliente);
		builder.append(", date=");
		builder.append(date);
		builder.append(", vip=");
		builder.append(vip);
		builder.append("]");
		builder.append("\n[metodo Super. de clientes]");
		builder.append(super.toString()); // podemos llamar directamente con esta propieda por el constructor padre para llamar a todos los elementos
		return builder.toString();
	}
}
