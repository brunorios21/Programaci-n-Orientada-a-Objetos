package ar.com.unpaz.principal;

import ar.com.unpaz.model.Cuenta;

public class Main {

	public static void main(String[] args) {
		
		Cuenta cuenta1 = new Cuenta (); // Se crea un objeto de la clase Cuenta 
		
		cuenta1.setNumeroCuenta(1001); // Se usa el setter par asignar el numero de cuenta
		
		System.out.println("Numero de cuenta:" + cuenta1.getNumeroCuenta()); // se usa el getter para obtener el valor del atributo.

	}

}
