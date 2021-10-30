package setenciasDeControl;

import java.util.Scanner;

public class SetenciasControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicioSwitch();
	}
	
	public static void condicionIf() {
		//se usa para decir una cosa u otra
		//la setencia de If/else, si es verdadero o falso
				/**
					 * if(condicion) {
					 * 	Verdadero
					 * }else {
					 * 	FalsoS	
				 * }
				 * */
	}
	
	public static void condicionSwitch() {
		//se usa como si fuese un interruptor
		//el Switch se usa más para cuando tengamos menús de opciones,
		//porque cada opción del menu tiene una función distinta
			//su expresión puede ser valores
	/**	
		switch(expresion) {
		case valor1:
			//setencias
			break;
		case valor2:
			//setencias
			break;
		case valor3:
			//setencias
			break;
		default:
			//setencias
		}
*/
		var numero = 1;
		var numeroTexto = "valor desconocido";
		
		switch(numero) {
		case 1:
			numeroTexto = "numero uno";
			break; //termina esta comnparación
		case 2: 
			numeroTexto = "numero dos";
		break;
		case 3: 
			numeroTexto= "numero tres";
		break;
		default: //para numreo u otras identificaciones no coincidan con las comprobaciones que tenemos
			numeroTexto = "caso no encontrado";
		
		}
		System.out.println("numero de texto es: " + numeroTexto);
	}
	public static void ejercicioSwitch() {
		var mes = new Scanner(System.in);
		int number;
		System.out.println("seleccione un mes de forma numerica:");
		var estacion = "estación no encontrada";
		number = Integer.parseInt(mes.nextLine());
		switch (number) {
		case 1: case 2: case 12: 
			estacion = "invierno";
			break;
		case 3: case 4: case 5:
			estacion = "primavera";
			break;
		case 6: case 7: case 8: 
			estacion = "verano";
			break;
		case 9: case 10: case 11:
			estacion = "otoño";
			break;
		default: 
			estacion = "no encotrado";
		}
		System.out.println("Estación: " +estacion);
	}
}
