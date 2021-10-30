package ejercicios;

public class ClienteOne {

	public static void main(String[] args) {
		Concesionario cs = new Concesionario();
		cs = compraOne(cs);
		System.out.println("compra: \n *****\n"+"coche "+cs.coche+"\n"+"marca "+cs.marca+"\n"+"matricula "+cs.matricula+"\n"+"precio "+cs.valor);
		cs = cambioValor(cs);
		System.out.println("\n Cambio: \n *****\n"+"coche "+cs.moto+"\n"+"marca "+cs.marca+"\n"+"matricula "+cs.matricula+"\n"+"precio "+cs.valor);
	}

	public static Concesionario compraOne(Concesionario c) {
		
		if (c ==null) {
			System.out.println("valor invalido");
			return null;
		}
		System.out.println("valor valido \n **********************");
		c.coche = "audi";
		c.marca = "A4";
		c.matricula = "I+55";
		c.valor = 35000;
		
		return c;
	}
	public static Concesionario cambioValor(Concesionario cv) {
		
		if (cv ==null) {
			System.out.println("valor invalido");
			return null;
		}
		cv.moto = "HONDA";
		cv.marca = "CBR650R";
		cv.valor = 1500;
		return cv;
	}
}
