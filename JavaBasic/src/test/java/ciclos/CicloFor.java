package ciclos;

public class CicloFor {

	public static void main(String[] args) {
		// se divide en 3 factores: 
		/** la 1�: ser�a la llave de nuestro contador  __;
		 *  la 2�: la condici�n  ;__
		 *  la 3�: es para incrementar la variable "contador" que hemos definido
		 * */
		
		 for( var contador = 0 ; contador < 3   ; contador++) {
			// si es verdadera, se ejecuta la ejecuci�n 
			 System.out.println("contador " + contador);
		 }
		 //otra forma
		 int contador2;
		 for ( contador2 = 0; contador2 < 3; contador2++) {
			System.out.println("contador con la variable fuera: " + contador2);
		}
	}
}
