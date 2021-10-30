package pasoPorValor;

import clases.Personas;

public class VolverReturnNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personas persona1 = new Personas();
		PasoPorReferencia ps =  new PasoPorReferencia();
		ps.cambioValor(persona1);
		//Personas persona1 = null;
		//llamamos al objeto anterior
		System.out.println("nombre: "+persona1.nombre);
		persona1 = metodoObjeto(persona1);
		
		//cambiamos el valor del objeto
		System.out.println("CAMBIOS \nNombre: "+  persona1.nombre);
	}
	//cuando quieres devolver un valor, debemos poner el Objeto o un valor primitivo(como en el PasoPorReferencia)
	public static Personas metodoObjeto(Personas pe) {
		
		//no se asigna ningún valor
		if (pe == null) {
			System.out.println("valor invalido = null");
			return null;//
		}else {
			System.out.println("valor valido = return");
		pe.nombre = "Manue";
		pe.apellido = "corteee";
		pe.edad = 99;
		
		//hacemos return para que devuelva los valores
		return pe;
		}
	}
}
