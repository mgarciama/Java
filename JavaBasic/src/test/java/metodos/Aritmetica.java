package metodos;

public class Aritmetica {
//siempre indicamos los atributos y luego los metodos
	
// atributos	
	int a , b; 
	//this., se hace diferecia en el atributo de nuestra clase
	
	//metodo, la palabra void, no regresa ninguna informacion 
	//void en ingles es  vacio
	public void sumar() {
		
	int resultado =	a + b;
	System.out.println("resultado: " + resultado);
		
	}
	
	//metodo de tipo regreso
	public int sumarConRetorno () {
	/*	
		int resultado = a + b;
		return resultado; // puede ser una variable o una expresion 
		*/
		System.out.println("metodo de regresión");
		return a+b ;
	}
	public int sumaRetorno() {
		System.out.println("metodo de regresión con la variable dentro");
		int resultado = a + b;
		System.out.println("resultado " + resultado);
		return resultado; // puede ser una variable o una expresion 
	}
	
	public int sumarConArgumento(int valor1, int valor2) {
		//esto permite modificar los atributos de nuestra clase
		a = valor1;
		b = valor2;
		System.out.println("resultado " + (a+b));

		return a + b;
	}
	public int sumarConArgumentosMetodo(int valor1, int valor2) {
		this.a = valor1;
		this.b = valor2;
	
		
		//tambien podemos reutilzar el meotodo sumaRetorno()
		// para no poner el retorno a + b
		return this.sumaRetorno();
	}
	
}
