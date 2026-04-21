package ar.com.unpaz.inicio;

import java.util.List;
import java.util.Scanner;
import ar.com.unpaz.model.Mascota;
import ar.com.unpaz.repository.LecturaArchivo;
import ar.com.unpaz.service.GestionMascota;
import ar.com.unpaz.serviceImpl.GestionMascotaImpl;


public class Main {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		//Leer archivo
		LecturaArchivo lectura = new LecturaArchivo();
		List<Mascota> mascotas = lectura.lectura();
		
	
		//Instanciar service
		GestionMascota gestion = new GestionMascotaImpl();
		
		int opcion;
		
		do {
			System.out.println("\n===== SISTEMA VETERINARIA =====");
			System.out.println("1. Agregar mascota");
			System.out.println("2. Buscar mascota");
			System.out.println("3. Listar mascotas");
			System.out.println("4. Salir");
			System.out.print("Seleccione una opción: ");
			
			opcion = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcion) {
			
				case 1:
					System.out.print("Nombre: ");
					String nombre = scanner.nextLine();
					
					System.out.print("Especie: ");
					String especie = scanner.nextLine();
					
					System.out.print("Edad: ");
					int edad = scanner.nextInt();
					scanner.nextLine();
					
					Mascota nueva = new Mascota(nombre, especie, edad);
					gestion.guardarNombre(mascotas, nueva);
					
					System.out.println("Mascota agregada correctamente");
					break;
					
				case 2:
					System.out.print("Ingrese el nombre de la mascota a buscar: ");
					String nombreBuscar = scanner.nextLine();
					gestion.buscarNombre(mascotas, nombreBuscar);
					break;
					
				case 3:
					
					gestion.ListarNombreDelAnimal(mascotas);
					
					break;
					
				case 4:
					System.out.println("Saliendo del sistema...");
					break;
					
				default:
					System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
			} // Cierra el switch
        } while (opcion != 4); 
        
        scanner.close(); 
    } // Cierra el método main
} // Cierra la clase Main (Asegurate de que esta llave esté presente y fuera de comentarios)			
	



