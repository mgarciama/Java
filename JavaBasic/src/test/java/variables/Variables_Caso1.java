package variables;

public class Variables_Caso1 {

	public static void main(String arg[]) {
		
		
		//variables();
		//System.out.println();
		concatenar();
	
	}
	public static void variables() {
		/**		
		//tipo String (cadena texto) + identificador = valor
				String saludar = "saludo";
				
				System.out.println(saludar);
				//var es una variable que puede usar de caracter string o int para java11 ó superior
				var despedirse = "hasta luego";
				System.out.println(despedirse);
				var number =1;
				System.out.println(number);*/
	}
	public static void concatenar() {
		//concatenación
		var usuario = "mgarcia";
		var saludar = "hola"; 
		System.out.println(saludar +" "+ usuario);
		var i = 3;
		var e = 2;
		System.out.println(i + e); // muestra un resultado de la suma 3+2 = 5
		//pero si concatenamos un strign antes, pasa esto:
		System.out.println(saludar + i+e); // no suma, sino lo une-> hola32
		// y si va delante el tipo int, hace la suma
		System.out.println(i+e + usuario); //5mgarcia
		//******siempre realiza primero la parte izquierdas, el orden es fundamental para manejar en los elementos
		//la expresiones se evaluan de izquierda a derecha
	}
	
}
