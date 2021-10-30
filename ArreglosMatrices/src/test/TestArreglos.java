package test;

public class TestArreglos {

	public static void main(String[] args) {
		// un arreglo es un object, ya que tiene una propiedad del objeto "new"
		                    //cantidad del arreglo
		int edades [] = new int[3]; 
		// si no ponemos el elemento length, podemos ver en consola, las caracteristcas de un objeto
		System.out.println("nº total de edades: -> "+ edades.length);
		
		//modificaciones:
		edades[0] = 10;
		edades[1] = 20;
		edades[2] = 5;
		//restamos 20 -5 y el resultado se lo queda el 1º elemento, si quitamos -= y dejamos =, el [1] será igual que [2]
		edades[1] -= edades[2];
		System.out.println("modificaciones: "+ edades[0]);
		
		for (int i = 0; i < edades.length; i++) {
			System.out.println("edades  elemento: "+i+"->  cantidad de edades: "+ edades[i]);
			
		}
	}

}
