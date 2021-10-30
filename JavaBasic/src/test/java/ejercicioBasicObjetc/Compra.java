package ejercicioBasicObjetc;

import java.util.Scanner;

public class Compra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Objetos ca = new Objetos();
		ca = compraAuto(ca);
		System.out.println("Automoción "+ca.auto+"\nmodelo "+ca.modelo+"\nmatricula "+ca.matricula+"\nprecio "+ca.valor1+ca.valor2);
	}

	public static Objetos compraAuto(Objetos ob) {
		var scanner = new Scanner(System.in);
		System.out.println("eliga tu auto");
		ob.auto = scanner.nextLine();
		
		
		if (ob.auto.equals("coche")|| ob.auto.equals("c")) {
			ob.auto = "coche";
			ob.modelo = "Audi - A4";
			ob.matricula = "ILV04";
			ob.valor1 = 35;
			ob.valor2 = 00;
		} else if (ob.auto.equals("moto")|| ob.auto.equals("m")) {
			ob.auto = "moto";
			ob.modelo = "HONDA - CBR650R";
			ob.matricula = "ILV04";
			ob.valor1 = 15;
			ob.valor2 = 00;
		}else {
			System.out.println("compra fallada");
			return null;
		}
		
		return ob;
	}
}
