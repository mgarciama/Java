package test;
//import mx.com.NombreDominio.nombreProyecto.Utileria;
import static mx.com.NombreDominio.nombreProyecto.Utileria.imprimir;
public class Test {

	public static void main(String[] args) {
		//a ser un static y no ser un objeto, se puede llamar as�
		//Utileria.imprimir("saludos");
		
		// solo para los static podemos llamar este metodo y poner el import
		imprimir("saludos");
		imprimir("Adios");
		//tambi�n podemos llamarlo as�:  mx.com.NombreDominio.nombreProyecto.Utileria.imprimir("adios");
	}

}
