package constructores;

public class EjemploOne {

	int a, b;
	
	//contructores, no regresa ningun tipo de dato, además debe ser el mismo nombre de nuestra clase
	//srive para reservar espacios de memoria

	public  EjemploOne() {
		System.out.println("ejecuntando contructor");
		
	}
	
	/**el constructor vacio solamente se va a gregar siempre y cuando no haya otro constructor con argumenos.*/
	
	//sobre carga de constructores 
	// permite crear varios constructores poniendo llamando a nuestro atributos
	public EjemploOne(int valor1, int valor2) {
		this.a = valor1;
		this.b = valor2;
		System.out.println("\nejecuntando sobrecarga de constructores");
	}
	
}
