package ventas;

public class Producto {

	private int idProducto;
	private String nombre;
	private double precio;
	private int contadorProducto;
	
	private Producto() {
		this.idProducto = ++ contadorProducto;
	}
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecio() {
		
		return this.precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String toString() {
		return "n? : "+this.idProducto +
				"nombre:  "+this.nombre+
				"precio: "+ this.precio;
	}
}
