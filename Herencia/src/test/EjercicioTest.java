package test;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import ejercicio.Cliente;

public class EjercicioTest {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Manuel",'m',30,"C/Andalucia",fecha(), false);
		
		
		System.out.println("cliente: "+ cliente);

	}
	public static String fecha() {
		String formato = "dd/MM/yyyy";

		
		DateFormat date = new SimpleDateFormat(formato);

		
		Date today = Calendar.getInstance().getTime();        
		
		String todayAsString = date.format(today);

		System.out.println("día de hoy: " + todayAsString);
		

		
		return todayAsString;
		
	}
	
}
