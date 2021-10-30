package test;

import java.util.Scanner;

import dominio.Compra;

public class compraPrueba {

	public static void main(String[] args) {
		Compra cp = new Compra("c", "c", 0, 0, "", false);
		cp = nuevaCompra(cp);
		//System.out.println("cambio "+ cp.getAuto());
		System.out.println("nuevo cambio: "+cp);
	
	}

	public static Compra nuevaCompra(Compra cp) {
		var scanner = new Scanner(System.in);
		System.out.println("¿Quieres comprar un automoción?");
		
		String ct =  scanner.nextLine();
		if (cp.isCompra() == ct.equals("compraAudi")|| ct.equals("si")) {
			System.out.println("coche o moto?");
			
			String co = scanner.nextLine();
			//String mo = scanner.nextLine();
			 if (co.equals("coche")|| co.equals("c")) {
				cp.setAuto("Coche");
				cp.setMarca("Audi - A4");
				cp.setValor1(35.0);
				cp.setValor2(00);
				cp.setEuro("€");
				
				
				}	
			 
			 else if (co.equals("moto")|| co.equals("m")) {
					cp.setAuto("Moto");
					cp.setMarca("HONDA - xxxx");
					cp.setValor1(15.0);
				} 
			}else {
				System.out.println("compra fallada");
				return null;
			}
		return cp;
	}
}
