package ciclos;


public class CicloDoWhile {

	public static void main(String[] args) {
		//la unica diferencia es el orden donde se ejecuta las lineas que se van a repetir
		//siempre se repitira por lo menos una ejecuci�n, si es false pasara con una condici�n 
		 //al contrario que While que si es false, no llega a ejecutar
		
		var contador = 0;
		
		
		do {
			System.out.println("contador " + contador);
			contador ++;// sino incrementamos la variable, se ejecutar� infinito
			
		} while(contador < 3);//se pone punto y coma porque es una linea aparte
		// si la ejecuci�n dice que es mayor: contador >3, el contador dira que es 0

	}

}
