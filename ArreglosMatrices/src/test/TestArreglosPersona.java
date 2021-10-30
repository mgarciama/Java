package test;

import domain.Persona;

public class TestArreglosPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Persona persona[] = new Persona[2];
		persona[0] = new Persona("Manu");
		persona [1] = new Persona ("Yoana");
		//si no creamos el metodo toString, no genera el valor
		System.out.println("persona -> " + persona[0]);
		
		// sacamos un for para ver la cantidad que tenemos guardadas
		for (int i = 0; i < persona.length; i++) {
			System.out.println("contador: "+i+ " persona: "+ persona[i] );
		}
			
		String frutas [] = {"manzana, platano, naranja, melón"};
		for (int i = 0; i < frutas.length; i++) {
			System.out.println("frutas: "+frutas[i]);
			
			
		}
	}

}
