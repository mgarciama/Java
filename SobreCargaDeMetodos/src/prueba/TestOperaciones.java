package prueba;

import operaciones.Operaciones;

public class TestOperaciones {

	public static void main(String[] args) {
		//los objetos staticos, no hace crear un objeto en esta clase
		var resultado = Operaciones.suma(1,2);
		System.out.println("resultado1 "+ resultado);
		var resultado2 = Operaciones.suma(2.25, 3);
		System.out.println("resultado2 "+ resultado2);
	}

}
