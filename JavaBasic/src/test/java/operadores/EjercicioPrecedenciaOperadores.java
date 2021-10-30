package operadores;

public class EjercicioPrecedenciaOperadores {

	
	public static void main (String[]args) {
		prueba1();
	}
	
	public static void prueba1() {
		// los debug, F6 pasa paso a paso a poder modeficarlo 
		// los debug, F8, pasa punto de ruptura a punto de ruptura
		var x = 5;
		var y = 10;
			// suma x6 + y10(resta despues, cuando se utilice)
		var z = ++x + y--;
		System.out.println("x=5\ny= 10\nz= ++x + y-- ");
		System.out.println("x = 6, se suma uno\ny = 10 porque se resta después");
		System.out.println("z : " + z);
		System.out.println("valor posterior de y" + y);
		System.out.println("se incrementa desde al prinicpio, x" + x);
		var resultado = 4+5 *6/3;
		System.out.println("resultado de 4+5*6/3: "+ resultado);
	}
}
