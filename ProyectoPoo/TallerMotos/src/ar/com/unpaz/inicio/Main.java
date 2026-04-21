package ar.com.unpaz.inicio;

import java.util.List;
import java.util.List;
import java.util.Scanner;

import ar.com.unpaz.model.Moto;
import ar.com.unpaz.repository.LecturaArchivo;
import ar.com.unpaz.service.GestionService;
import ar.com.unpaz.serviceIMPL.GestionServiceIMPL;

public class Main {
	
	public static void main(String[] args) {
	
		// Usamos un solo nombre para el scanner para evitar confusiones
		Scanner scanner = new Scanner(System.in);
		
		// 1. Leer archivo (Repository)
		LecturaArchivo lectura = new LecturaArchivo();
		List<Moto> motos = lectura.lectura();
		
		// 2. Instanciar service (Interface = New Impl)
		GestionService gestion = new GestionServiceIMPL();
		
		int opcion;
		
		do {
			System.out.println("\n======== Sistema Gestion de Motos ========");
			System.out.println("1. Agregar motos");
			System.out.println("2. Buscar moto");
			System.out.println("3. Listar moto");
			System.out.println("4. Salir");
			System.out.print("Seleccione una opcion: ");
			
			opcion = scanner.nextInt();
			scanner.nextLine(); // Limpieza de buffer necesaria después de nextInt
			
			switch (opcion) {
				case 1:
					System.out.print("Patente: ");
					String patente = scanner.nextLine();
					
					System.out.print("Modelo: ");
					String modelo = scanner.nextLine();
					
					System.out.print("Año: ");
					String anio = scanner.nextLine();
					
					// IMPORTANTE: El constructor de Moto pide 4 parámetros
					// Le pasamos 'false' porque una moto nueva se supone que no está reparada aún
					Moto nueva = new Moto(patente, modelo, anio, false);
					
					gestion.guardarPatente(motos, nueva);
					System.out.println("Moto agregada correctamente");
					break;
					
				case 2:
					System.out.print("Ingrese la patente de la moto que desee buscar: ");
					String buscarPat = scanner.nextLine();
					
					// Llamada correcta al método del service
					gestion.buscarPatente(motos, buscarPat);
					break;
					
				case 3:
					// Listar no requiere pedir datos extras
					gestion.ListarPatenteMoto(motos);
					break;
					
				case 4:
					System.out.println("Saliendo del sistema...");
					break;
					
				default:
					System.out.println("Opcion invalida, por favor seleccione una opcion valida.");
			}
			
		} while (opcion != 4);
		
		scanner.close();
	}
}
