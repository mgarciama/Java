package constructores;

public class Ejecutor {

	public static void main(String[] args) {
		// constructor vacio
		EjemploOne ejeVacio = new EjemploOne();
		System.out.println("atributo por default A: " + ejeVacio.a);
		System.out.println("atributo por default B: " + ejeVacio.b);
		
		//constructor con argumentos
		//llammamos al 2º constructor
		EjemploOne ejeSobreCarga = new EjemploOne(5,8);
		System.out.println("atributo con argumentos A: " + ejeSobreCarga.a);
		System.out.println("atributo con argumentos B: " + ejeSobreCarga.b);
		
	}

}
