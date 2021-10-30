package pasoPorValor;

import clases.Personas;

public class Ejemplo {

	public static void main(String[] args) {
	
		//llamadas con primitivos
		int x1 = 500;
		String c = "coche";
		
		x1 = cambioInt(x1);
		System.out.println("cambiamos el nº "+ x1);
		c = cambioString(c);
		System.out.println("cambiamos el String " + c);
		//llamadas con objetos
		Personas persona1 = new Personas();
		
		//indicamos el objeto al metodo
		cambioObjetc(persona1);
		//resultado del objeto
		System.out.println("objeto: "+ persona1.nombre +"\n" +"apellido "+ persona1.apellido+"\n"+"edad"+ persona1.edad);
		//modificamos los nombres que hemos indicado en el metodo
				persona1.nombre = "Frank";
				persona1.apellido ="Miller";
				persona1.edad = 45;
				//resultado del objeto
				System.out.println("cambios de objeto: "+ persona1.nombre +"\n" +"cambio de apellido "+ persona1.apellido);
	}
	//hacemos un metodo para poder modificar los tipos primitivos anterior
	public static int cambioInt(int i) {
		return i = 100;
	}
	
	public static String cambioString(String s) {
		return s = "moto";
	}
	//hacemos un metodo para poder modificar el objeto anterior
	public static void cambioObjetc(Personas p) {
		p.nombre = "George";
		p.apellido = "Lucas";
		p.edad = 65;
	}
	
}
