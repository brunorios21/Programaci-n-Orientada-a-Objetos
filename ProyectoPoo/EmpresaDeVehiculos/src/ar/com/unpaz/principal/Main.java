package ar.com.unpaz.principal;
import ar.com.unpaz.model.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[]args) {
		//Creamos una lista de vehículos
		List<Vehiculo> vehiculos = new ArrayList<>();
		
		vehiculos.add(new Auto("A010", "Toyota", 50));
		vehiculos.add(new Camion("H231", "Scania", 100));
		vehiculos.add(new Moto("M456", "Honda", 30));
		
		// Hacemos avanzar cada vehículo 100 km
		int km = 100;
		
		for (Vehiculo v : vehiculos) {
			v.avanzar(km);
			System.out.println("Tipo" + v.getClass().getSimpleName());
			System.out.println("Patente: " + v.getPatente());
			System.out.println("Marca: " + v.getMarca());
			System.out.println("Combustible restante: " + v.getCombustible());
			System.out.println("-----------------------------");
		}

	}
}