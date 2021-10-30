package palabraFinal.com.mx;

import objetoFinal.ObjFinal;

public class TestFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 final ObjFinal persona1 = new ObjFinal();
		// no permite llamarlo así: System.out.println("persona "+ persona1);
		//para llamarlo sería así:
		persona1.setNombre("Manu");
		System.out.println("final Objeto: "+ persona1.getNombre());
	}

}
