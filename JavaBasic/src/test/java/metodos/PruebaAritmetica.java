package metodos;

public class PruebaAritmetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aritmetica suma = new Aritmetica();
		suma.a = 45;
		suma.b = 01;
		suma.sumar();
		
		//llamamos a una variable para que lo almacene, así podremos recibir datos
		int resultado = suma .sumarConRetorno();
		System.out.println("resultado: " + resultado);
		//otro tipo con la llamada de retorno.
		int resultad =  suma.sumaRetorno();
		System.out.println("resultado: " + resultad);
		
		//metodo con argumentos
		suma.sumarConArgumento(10,2);
		//metodo con argumentos llamando a otro metodo
		suma.sumarConArgumentosMetodo(2, 5);
	}

}
