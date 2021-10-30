package primitivos;

import java.util.Scanner;

public class PrimitivosJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Decimales();
		//numeroFlotante();
		//tipoChar();
		//primitivoBoolean();
		conversionPrimitivo();
	}

	public static void Decimales() {
		int numeroDecimal = 10;
		System.out.println("numero Decimal = " + numeroDecimal);
		
		//los numeros octal deben empezar por 0 [cero]
		int numeroOctal = 012;
		System.out.println("Numero Octal "+ numeroOctal);
		// los hexadecimales empieza por 0x [cero x]
		var numeroHexadecimal = 0xA;
		System.out.println("numero Hexadecimal " + numeroHexadecimal);
		//los numeros binarios empiza 0b [cero b]
		int numeroBinario = 0b1010;
		System.out.println("numero binario " + numeroBinario);
	}
	
	public static void numeroFlotante() {
		//los numero flotante, si ponemos 1000, nos saldrán 1000.0
		//Si queremos poner decimales por ejemplo 1000.10, debemos poner una F
		float floatVar = 1000;
		var floatDecimal = 1000.10F;
		System.out.println("float " + floatVar);
		System.out.println("float con decimal " + floatDecimal);
		/**
		 * si ponemos var conb el resultado terminando en F, reconoce que es de tipo flotante
		 * pero si no especificamos, muestra como de tipo double
		 * */
		//aunque tenga 32bits, el valor numerico será mayor por el tipo flotante
		System.out.println("bits tipo flotante " + Float.SIZE);
		System.out.println("bytes tipo float " + Float.BYTES);
		System.out.println("el valor minimo " + Float.MIN_VALUE);
		System.out.println("el valor maximo " + Float.MAX_VALUE);
		////
		//si ponemos una d al final reconoce que es de tipo literal
		System.out.println("\n ///////////////////////");
		double doubleVar = 100.10;
		var d = 100d;
		System.out.println("double con d " + d);
		System.out.println("tipo double " + doubleVar);
		System.out.println("bits tipo Double " + Double.SIZE);
		System.out.println("bytes tipo Double " + Double.BYTES);
		System.out.println("el valor Double " + Double.MIN_VALUE);
		System.out.println("el valor Double " + Double.MAX_VALUE);
	}
	public static void tipoChar() {
		/*el valor minimo y maximo corresponden a la tabla UniCode
		 * el valor minimo es el valor de Nul y el valor maximo el signo interrogacion*/
		System.out.println("bits tipo Char " + Character.SIZE);
		System.out.println("bytes tipo Char " + Character.BYTES);
		System.out.println("el valor Char " + Character.MIN_VALUE);
		System.out.println("el valor Char " + Character.MAX_VALUE);
		
		//el tipo char soporto un caracter por ello utilizamos comillas simples
		//si fuera comillas dobles representa a una cadena
		// podemos encontar el listado de unicode https://en.wikipedia.org/wiki/List_of_Unicode_characters
		// para mostrar que muestre codigo de unicode, escribimos "\ u"+ numero de codigo
		var charVar = '\u0021'; // si es co var debe mostrar \ u
		System.out.println(charVar);
		char varCharDecimal = 33;
		System.out.println("var decimal " + varCharDecimal);
		char charSimbolo = '!';
		System.out.println("char list simbolo " + charSimbolo);
	}
	public static void primitivoBoolean() {
		//boolean
		System.out.println("true tipo boolean: " + Boolean.TRUE);
		System.out.println("false tipo boolean: " + Boolean.FALSE);
		System.out.println("\n");
		
		boolean boleanVar = true;
		if(boleanVar) {
			System.out.println("el valor es verdadero");
		} else {
			System.out.println("el valor es falso");
		}
		System.out.println("\n");
		var edad = 10;
		var edadAdulto = edad >=18;
		System.out.println("esAdulto " + edadAdulto);
		
	}
	public static void conversionPrimitivo() {
		// esto vale para todo de tipos varibles numerico y solo pemite dentro del parseInt o ParseDouble numerico
		int edad = Integer.parseInt("20");
		System.out.println("edad " + edad);
		
		double valroPi = Double.parseDouble("3.146");
		System.out.println("valor PI " + valroPi);
		
		char c = "hola".charAt(0); // coge la h porque 0 es un 1.
		System.out.println("char hola " + c);
		
		var scanner = new Scanner(System.in);
		edad = Integer.parseInt( scanner.nextLine());
		System.out.println("edad " + edad);
		
		char caracter = scanner.nextLine().charAt(0); // escribe el primera letra o caracter que escribamos
		System.out.println("caracter " + caracter);
		
		String edadTexto = String.valueOf(25);//convertie de fomra numerica/boolean a string
		System.out.println("edad texto " + edadTexto);
		
		short s = 128;
		byte b = (byte)s; //así sera posible hacer la conversion
		System.out.println("tipo b " + b);
	}
}
