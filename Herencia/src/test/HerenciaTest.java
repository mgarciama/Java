package test;

import java.util.Date;

import domain.Cliente2;
import domain.Empleados;

public class HerenciaTest {

	public static void main(String[] args) {
		Empleados e1 = new Empleados("Manu", 1500);
		System.out.println("empleado "+ e1);
        
        Cliente2 cliente1 = new Cliente2(new Date(), true, "Karla", 'F', 28, "Saturno 15");
        System.out.println("cliente1 = " + cliente1);
	}

}
