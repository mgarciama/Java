package ventas;

public class Orden {

	public int idOrden;
	public Producto producto[]; //arreglo
	private static int contadorOrden;
	private int contadorProducto;
	private static final int maxProducto = 10; //constante
	public Orden() {
		//constructor vac?o, servira para almecenar ek valor del contador
		this.idOrden =++ Orden.contadorOrden;
		this.producto = new Producto[Orden.maxProducto];
	}
	
	public void agregarProducto(Producto producto) {
		
	}
}
