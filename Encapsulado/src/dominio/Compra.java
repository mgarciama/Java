package dominio;

public class Compra {

	
	private String Auto;
	private String marca;
	private double valor1;
	private double valor2;
	private String euro;
	private boolean compra;
	
	public Compra(String auto, String marca, double valor1, double valor2, String euro, boolean compra) {
		this.Auto = auto;
		this.marca = marca;
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.euro = euro;
		this.compra = compra;
	}
	
	public String getAuto() {
		return this.Auto;
	}
	public void setAuto(String auto) {
		this.Auto = auto;
	}
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getValo1() {
		return this.valor1;
	}
	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}
	public double getValo2() {
		return this.valor2;
	}
	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}
	public String getEuro() {
		return this.euro;
	}
	public void setEuro(String euro) {
		this.euro = euro;
	}
	public boolean isCompra() {
		return this.compra;
	}
	public void setCompra(boolean compra) {
		this.compra = compra;
	}
	
	public String toString() {
		return "compra un/a "+this.Auto +
				"marca: "+this.marca+
				"precio: "+ this.valor1 + this.valor2+this.euro;
	}
}
