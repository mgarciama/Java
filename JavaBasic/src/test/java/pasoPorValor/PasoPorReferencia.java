package pasoPorValor;

import clases.Personas;

public class PasoPorReferencia {

//los objetos trabajan de manera diferente que los primitivos
	// para que un primitivo cambie o modifique debemos llamar de tipo primitivo en el metodo, 
		//lo podemos ver en la clase PasoPorValor.java
		public static void main(String[] args) {
			Personas persona1 = new Personas();
			
			persona1.nombre = "Apolo";
			System.out.println("nuevo nombre " + persona1.nombre);
			//llamamos al metodo para cambiar lo que hemos puesto
			cambioValor(persona1);
			System.out.println("cambio de nombre "+ persona1.nombre);
		}

		public static void cambioValor(Personas persona) {
			persona.nombre = "Aquiles";
		}
		
		
}
