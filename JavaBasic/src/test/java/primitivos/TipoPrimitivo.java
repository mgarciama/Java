package primitivos;

public class TipoPrimitivo {

	public static void main(String arg[]) {
		primitivoEntero();
		
		
	}
	public static void primitivoEntero() {
		/***
		 * Los tipos primitivos enteros son los tipos:
		 * byte, short, int, long
		 * */
		// BYTE, se usa de 8bits de un mínimo de -128 y de un maximo de 127, 
		byte byVar = 127; 
		System.out.println(byVar);
		System.out.println("bits en el tipo byte "+ Byte.SIZE);
		System.out.println("el numero de bits " + Byte.BYTES);
		System.out.println("valor minimo de tipo byte " + Byte.MIN_VALUE);
		System.out.println("el valor maximo de tipo byte " + Byte.MAX_VALUE);
		System.out.println("\n ///////////////////////////////////");
		//short, se usa 16 bits y tiene un minimo de -32768 y un maximo de 32767
		short shortVar = 1000;
		System.out.println("valor de short actual + " + shortVar+"bits");
		System.out.println("bits en el tipo short " + Short.SIZE);
		System.out.println("numero de bits de short " + Short.BYTES);
		System.out.println("valor minimo de tipo short " + Short.MIN_VALUE);
		System.out.println("valor maximo de tipo short " + Short.MAX_VALUE);
		System.out.println("\n ///////////////////////////////////");
		//int, usa 32 bits y el valor minimo es -2147483648 y un maximo 2147483647
		int intVar = 6000;
		System.out.println("valor actual de int " + intVar);
		System.out.println("bits en el tipo int"+ Integer.SIZE);
		System.out.println("el numero de bits " + Integer.BYTES +"bits");
		System.out.println("valor minimo de tipo int " + Integer.MIN_VALUE);
		System.out.println("valor maximo de tipo int " + Integer.MAX_VALUE);
		System.out.println("\n ///////////////////////////////////");
		//long, usa 64 bits y un valor minimo de -9223372036854775808 y un maximo 9223372036854775807
		long longVar = 9223372036854775807L;
		/* para poner un numero largo de tipo long, debemos poner L ó l al final
		 * la letra L significa de tipo literal y solo representa de tipo long
		 * !imnportante, no recomendable de poner l minucula por confundir con un 1
		 * */
		System.out.println("valor actual de long " + longVar);
		System.out.println("bits en el tipo long "+ Long.SIZE);
		System.out.println("el numero de bits " + Long.BYTES +"bits");
		System.out.println("valor minimo de tipo long " + Long.MIN_VALUE);
		System.out.println("valor maximo de tipo long " + Long.MAX_VALUE);
		System.out.println("\n ///////////////////////////////////");
		var numero = 9223372036854775807L; // la variable var, permite en primitivos entero de tipo long
		System.out.println(numero);
		
	}
	
}
