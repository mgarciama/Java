package ciclos;

public class CicloWhile {

	public static void main(String[] args) {
		//si la setencia es verdadera se ejecuta la setencia y si es falso se termina la ejecuci�n 
		//decimos una variable 
		var contador = 0;
		//while funciona como una condicional para preguntar pero ejecutar como ciclo
		while(contador < 4) { // si es menor que 4, ejecuta y lanza 4 ejecuciones
			System.out.println("contador " + contador); //mostrar� 3 veces, siempre contando desde 0
			contador ++;
		}
		
	}
	

	

}
