package ciclos;

public class CicloFor {

	public static void main(String[] args) {
		// se divide en 3 factores: 
		/** la 1º: sería la llave de nuestro contador  __;
		 *  la 2º: la condición  ;__
		 *  la 3º: es para incrementar la variable "contador" que hemos definido
		 * */
		
		 for( var contador = 0 ; contador < 3   ; contador++) {
			// si es verdadera, se ejecuta la ejecución 
			 System.out.println("contador " + contador);
		 }
		 //otra forma
		 int contador2;
		 for ( contador2 = 0; contador2 < 3; contador2++) {
			System.out.println("contador con la variable fuera: " + contador2);
		}
	}
}
