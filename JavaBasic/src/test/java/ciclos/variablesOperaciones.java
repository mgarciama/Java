package ciclos;

import java.util.Scanner;
import java.util.regex.Pattern;

import javax.sound.midi.Soundbank;




public class variablesOperaciones {

	
	public static void main(String arg[]) {
		//ejercicio1();
		//ejercicio2();
		//ejercicio3();
		//ejercicio4();
		ejercicio5();
		
		
	}
	
	public static void ejercicio1() {
		
	/**
	 * Crear dos variables de cualquiera de los tipos básicos, dar un valor a la primera y a
	 *  continuación asigne la segunda a la primera. Imprimir por pantalla las dos variables. 
	 *  Cambiar el valor de la segunda variable y volver a imprimir las variables por pantalla. 
	 *  ¿Qué es lo que ocurre?
	 * */
		
		var valorOne = "valor 1";
		var valorTwo = "valor 2";
		valorOne = valorTwo;
		System.out.println("primer valor asigando al segundo valor" + valorOne);
		System.out.println("imprimir las dos variables : \n");
		System.out.println("valorOne " + valorOne + " valorTwo " + valorTwo);
		valorTwo = "valor 3";
		valorOne = valorTwo;
		System.out.println("cambiamos el valor 2 ahora es: " + valorOne);
		
		
	}
	public static void ejercicio2() {
		/*A partir de una variable num1 con valor inicial 12 y una variable num2 con valor inicial 4, 
		crear nuevas variables que almacenen el resultado de realizar la suma, resta, multiplicación,
		división y resto de num1 y num2. Mostrar el valor de las nuevas variables por pantalla.
		*/
		int num1 = 12;
		int num2 = 4;
		System.out.println("suma");
		int resultado = num1 + num2;
		System.out.println("resultado suma " + resultado);
		System.out.println("\n");
		System.out.println("resta");
		resultado = num1 - num2;
		System.out.println("resultado resta " + resultado);
		System.out.println("\n");
		System.out.println("division");
		resultado = num1 / num2;
		System.out.println("resultado dividir " + resultado);
		System.out.println("\n");
		System.out.println("multiplicacion");
		resultado = num1 * num2;
		System.out.println("resultado multiplicar "+ resultado);
		
	}
	public static void ejercicio3() {
		/**
		 * Construir un programa que, dado el radio de una esfera, calcule y devuelva por pantalla 
		 * el valor de la superficie y el volumen de la esfera correspondiente. Para obtener el valor de PI,
		 *  utilizar la variable estática Math.PI.
		 *  Volumen esfera = (4/3)PIR3
		 *  Superficie esfera = 4PIR2*/
		
	
		var pi = Math.PI;
		var volumenSfera = (4/3)*pi*3;
		System.out.println("volumen esfera " + volumenSfera);
		var superficieSfera = 4*pi*2;
		System.out.println("superficie esfera " + superficieSfera);
		
	}
	public static void ejercicio4() {
		/*Construir un programa que dado el peso (en kilogramos) y 
		 * la altura de una persona (en metros) calcule y muestre por pantalla su Indice de Masa 
		 * Corporal (IMS) o índice de Quetelet. Este índice pretende determinar el intervalo de 
		 * peso más saludable que puede tener una persona. El valor de este índice se calcula mediante 
		 * la siguiente expresión:
		 * IMS = peso/altura2
		 * Se suele establecer un intervalo de 18 a 25 como saludable en personas adultas.
		 *  Para la realización de ejercicios, en los que el usuario deba introducir datos por teclado, 
		 *  es posible utilizar las siguientes instrucciones para leer los datos por teclado:
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("por favor escriba el peso");
		double peso =Double.parseDouble(sc.nextLine());
		System.out.println("por favor escriba o indique su altura");
		double altura =  Double.parseDouble(sc.nextLine());
		var IMS =  peso/ (Math.pow(altura, 2)); //codigo para calcular la formula
		var resultado =  Math.rint(IMS*100)/100; // redondea a lo mas cercano
		if(IMS > 25 ) {
			System.out.println("sobrepeso");
		} else if (IMS >= 18 || IMS <= 25) {
			System.out.println("peso ideal");
		}else if (IMS <18) {
			System.out.println("demasiado delgado");
		}
		System.out.println("valor natural " + IMS);
		System.out.println("valor ajustado " + resultado);
	}
	public static void ejercicio5() {
		/**Construir un programa que simule el funcionamiento de una calculadora que puede 
		 * realizar las cuatro operaciones aritméticas básicas (suma, resta, producto y división) 
		 * con valores numéricos enteros. El usuario debe especificar la operación con el primer 
		 * carácter del primer parámetro de la línea de comandos: S o s para la suma, R o r para la resta, 
		 * P, p, M o m para el producto y D o d para la división. Los valores de los operandos se deben 
		 * indicar en el segundo y tercer parámetros.*/
		Scanner sc = new Scanner(System.in);
		var operaciones = sc.nextLine();
		var num1 = Double.parseDouble(sc.nextLine());
		var num2 =  Double.parseDouble(sc.nextLine());
		
		
		double resultado;
		if (operaciones.equals("+")|| operaciones.equals("suma")) {
			System.out.println("suma");
			resultado = num1 + num2;
			System.out.println("suma " + resultado);
		} else if (operaciones.equals("-")|| operaciones.equals("resta")) {
			resultado = num1 - num2;
			System.out.println("resta " + resultado);	
		}else if (operaciones.equals("/")|| operaciones.equals("dividr")) {
			resultado = num1 / num2;
			System.out.println("division " + resultado);	
		}else if (operaciones.equals("*")|| operaciones.equals("multiplicar")) {
			resultado = num1 * num2;
			System.out.println("multiplicar " + resultado);	
		}
		else if (sc.equals("")) {
			sc.close();
		} 
		System.out.println("resultado");
		
		
		
	}
}
