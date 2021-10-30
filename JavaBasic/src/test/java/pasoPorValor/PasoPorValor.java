package pasoPorValor;

public class PasoPorValor {
//con este tipo de primitivos, no hace modificaciones solo llamadas
	public static void main(String[] args) {
		int x = 10;
		System.out.println("valor x " + x);
		cambioValor(x);
		copiaValor(x);
		//recordando llamando la variable, dejamos el valor en x
		x = cambioValor(x);
		System.out.println("un nuevo valor: "+ x);
		
		
	}

	public static void copiaValor(int v1) {
		System.out.println("metodo de copiaValor = "+ v1);
		v1 = 15;
	}
	
	public static int cambioValor(int v1) {
		System.out.println("metodo cambio valor = "+ v1);
		 v1 = 15;
		return v1;
	}
}
