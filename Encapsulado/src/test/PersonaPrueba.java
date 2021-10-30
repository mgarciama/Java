package test;
import dominio.Persona;
public class PersonaPrueba {

	public static void main(String[] args) {
		Persona pe1 = new Persona("Manuel", 1800.0, false);
		//System.out.println("llamada actual \nnombre : "+pe1.getNombre() +"\nsueldo "+pe1.getSueldo() +"\nultima nomina "+pe1.isEliminado());
		pe1.setNombre("Manuel García");
		pe1.setSueldo(2000.0);
		pe1.setEliminado(true);
		System.out.println("***********************");
		//System.out.println("llamada modificada \nnombre : "+pe1.getNombre() +"\nsueldo "+pe1.getSueldo() +"\ncontratado "+pe1.isEliminado());
		System.out.println("llamada de ToString: " +
		pe1.toString());
		// va hacer la misma llamada con el mismo resultado ya que el toString, lo envia automaticamente, solo con nombrar el objeto
		System.out.println("llamada del objeto solo: " +
				pe1);
	}

}
