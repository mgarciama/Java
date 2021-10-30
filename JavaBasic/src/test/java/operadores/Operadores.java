package operadores;

public class Operadores {

	public static void main (String arg[]) {
		//operadorAritmetico();
		//operacionAsignacion();
		operadorUnarios();
		//operadorIguaRelacionales();
		//operadoresCondicionales();
	//	operadorTernario();
		//operadorPrecedencia();
	}
	
	
	public static void operadorAritmetico() {
		/**se puede crear una varible y volver a utilizar en la misma linea 
		 * pero var, no deja varias variables*/
		int a = 3, b = 2; 
		//siempre debemos crear otra variable para realizar una operacion ó poner parantesis
		int result = a+b;
		System.out.println("resultado suma " + result);
		System.out.println("suma si variable resultado " + (a + b));
		result = a-b;
		System.out.println("resta " + result);
		
		result = a*b;
		System.out.println("multiplicar " + result);
		result = a/b;
		System.out.println("division " + result);
		
		//para tipo flotante, es decir para las comas no debe ser int, a demás debemos decir de tipo dobule
		double resulta2 = 3D / b;
		System.out.println("division tipo double "+ resulta2);
		//operador de modulos
		result = a % b;
		System.out.println("resultado del modulo "+result);
		result = a % 2;
		System.out.println("resultado impar " + result);
		result = b % 2;
		System.out.println("resultado par " + result);
		
		if(result == 0) 
			System.out.println("es numero par");
		else System.out.println("es numoer impar");		
		
	}
	
	public static void operacionAsignacion() {
		//las asginaciones se guarda las variables
		int a =3, b = 2; 
		int c = a;// esto sería la asignacion, pasamos los datos de a -> c
		System.out.println("valor de c " + c);
		c = a+b; // tambien puede hacer resultados
		System.out.println("valor de c: " +c);
		
		a +=1;// está asignacion lo que hace es sumar 1, -> a = a +1
		//System.out.println("valor de a " + a);
		a += 3;
		System.out.println("valor de a sumando " + a);
		b -= 1; //b = b-1
		System.out.println("valor de b restando "+ b);
		c *= 2;
		System.out.println("valor de c multiplando " + c);
		c /= 2;
		System.out.println("valor de c dividiendo " + c);
		c %= 5;
		System.out.println("valor de c modulo " + c);
		
		
	}
	public static void operadorUnarios() {
		
		int a = 3;
		int b = -a;//con el signo negativo asigna el valor a la variable, es decir, inserta el singo - al numero
		System.out.println("b =-a : " + b);
		boolean c = true;
		boolean d = !c; //! es distinto de solo para boolean
		System.out.println("d = !c " + d);
		//incremento
		//preincremento
		int e = 3;
		int f = ++e;// se incrementa el valor en uno -> f += 1, es decir suma un numero más
		System.out.println("f = ++e : " +f);
		//postincremento
		int g = 5;
		int h = g++; // esto lo que hace se incrementa despues 
		System.out.println("h = g++: " + h);
		System.out.println("valor de g : " + g); // aqúi podemos ver que se ha incrementado posterior, el numero sumado
		//decremento
		//predecremento
		int i = 2;
		int j = --i;
		System.out.println("j = --2 : " + j);
		//postdecremento
		int k = 3;
		int l = k--;
		System.out.println("l = k-- " + l);
		System.out.println("k " + k);
		
		
		
	}
	public static void operadorIguaRelacionales() {
		
		//no se puede utilizar con Obje
		int a =3, b =2;
		//este operador solo debe usarse para los tipos primitivos
		// == compara si son iguales de
		boolean c = (a==b); //podemos añadir paratensis o no, pero es recomendable
		System.out.println("son iguales a y b: "+ c);
		// != compara si son distintos de
		c = (a !=b);
		System.out.println("Son distintos de a y b:  "+ c);
		//usuando obj
		// para usar de tipo string debemos usar equals para comparar si son iguales
		String cadena = "hola";
		String cadena2 = "adios";
	
		System.out.println("la cadena es igual que la cadena2: "+ cadena.equals(cadena2));
		// la variable a es menor que b
		boolean d = a < b;
		System.out.println("a es menor que b: " + d);
		//la variable a es mayor que la varible b
		d = a > b;
		System.out.println("a es mayor que b: " + d);
		// la variable a es mayor o igual que la variable b
		d = a >= b;
		System.out.println("es mayor o igual que b: " + d);
		//la variable a es menor que la variable b
		d = a <=b;
		System.out.println("es menor o igual que b: " + d);
		
		//un numero es impar o par
		if (b % 2 == 1) {
			System.out.println("numero par");
		}
		else {
			System.out.println("es numero impar");
		}
		
		int edadMenor = 8;
		int edadAdulto = 18;
		if(edadMenor >= edadAdulto) {
			System.out.println("es un adulto");
		}
		else {
			System.out.println("es menor de edad");
		}
	}
	public static void operadoresCondicionales() {
		//Recibe dos operadores de tipo boolean
		// && operador AND, esto requiere una de las dos son distitnas te devolvera false, es como decir si juan tiene 10 y pepe tiene 10 
		int a = 10;
		int valorMinimo = 0, valorMaximo = 10;
		boolean resultado = a >= valorMinimo && a <= valorMaximo;
		System.out.println(resultado);
		
		// || operador OR, es como decir rojo o negro
		boolean vacaciones = false;
		boolean diaDescanso = true;
		if(vacaciones || diaDescanso) {
			System.out.println("puede ir al juego de su hijo");
		} else {
			System.out.println("está ocupado");
		}
	}
	
	public static void operadorTernario() {
		//es un operador condicional
		/**es una simplificacion de if else */
		//var resultado = (expresion) ? true : false;
		//boolean
		var resultado = (3 > 2) ? true : false;
		System.out.println("resultado: " + resultado);
		//cadena string
		 // puede alternad siempre que sea tipo var
		var resultado2 = (1 > 2) ? "verdadeero" : false;
		System.out.println("resultado cadena: " + resultado2 );
		 resultado2 = (1 > 2) ? "verdadeero" : "falso";
		System.out.println("resultado cadena: " + resultado2 );
		var numero = 7;
		var par = (numero % 2 == 0) ? "numero par" : "numero impar";
		System.out.println(par);
	}
	public static void operadorPrecedencia() {
		var x = 5;
		var y = 10;
		var z = ++x + y--; //(++x) + (y--);
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);;
	}
}
