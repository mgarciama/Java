package clases;

public class PruebaPersona {

	public static void main(String[] args) {
		//creamos la variable para el objeto
		Personas persona1;
		//creamos el objeto
		persona1 = new Personas();
		//damos los valores a los objetos
		persona1.nombre = "Manuel";
		persona1.apellido = "García";
		
		// a tener varios valores disitntos, se almecena en difierete posición de la memoria
		System.out.println("persona1"+ persona1); 
		
		Personas persona2 = new Personas();
		
		// a tener varios valores disitntos, se almecena en difierete posición de la memoria
		System.out.println("persona2"+ persona2);
		
		persona2.nombre = "Yoana";
		persona2.apellido = "Ponsoda";
		persona1.desplegarInformacion();
		persona2.desplegarInformacion();
	}

}
