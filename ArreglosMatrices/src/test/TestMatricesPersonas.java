package test;

import domain.Persona;

public class TestMatricesPersonas {

	public static void main(String[] args) {
		
//	        edades[][]->  filas[] y columnas[]	
		/**
		 * _____0___1_____  -> columnas
		 * |______|_____| 0  \          
		 * |______|_____| 1 -- > filas           
		 * |______|_____| 2  /         
		 *  
		 * **/
		int edades [][] = new int [3][2];
		
		edades[0][0] = 5;
		edades[0][1] = 6;
		edades[1][0] = 8;
		edades[1][1] = 9;
		edades[2][0] = 10;
		edades[2][1] = 11;
		
		System.out.println("edades: "+ edades[1][1]);
		//ciclo for anidados, usado más bien para las matrices
		for (int fila = 0; fila < edades.length; fila++) {
			for (int col = 0; col < edades[fila].length; col++) {
				System.out.println("fila: "+ fila + " columna: "+ col + " edades "+ edades[fila][col] );
				
			}
		}
		System.out.println("//////////////////////////////////////////");
		String frutas[][] = {{"naranja", "limón"}, {"melón","fresa"}};
		for (int i = 0; i < frutas.length; i++) {
			
			for (int j = 0; j < frutas[i].length; j++) {
				
				System.out.println("agregar filas "+i+" agregar columnas "+ j+" todas " + frutas[i][j]);
			}
		}
		
		//objetos
		Persona personas[][] = new Persona[2][3];
		personas[0][0] = new Persona("Manué");
		personas[0][1] = new Persona("yoana");
		personas[0][2] = new Persona("Karla");
		personas[1][0] = new Persona("Juan");
		personas[1][1] = new Persona("Guille");
		personas[1][2] = new Persona("Nerea");
		
		//llamada de una matriz con metodo:
		imprimir(personas);
		
		
	}
	 
	public static void imprimir(Object matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("filas: "+ i + " columnas: "+ j + " Nombres: "+ matriz[i][j]);
			}
		}
	}
}
