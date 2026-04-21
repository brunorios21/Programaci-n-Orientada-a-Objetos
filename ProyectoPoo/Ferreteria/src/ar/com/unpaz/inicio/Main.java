package ar.com.unpaz.inicio;

import java.util.List;
import java.util.Scanner;

import ar.com.unpaz.model.Producto;
import ar.com.unpaz.repository.LecturaArchivo;
import ar.com.unpaz.service.GestionStock;
import ar.com.unpaz.serviceIMPL.GestionServiceIMPL;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 1. Cargar la lista desde el archivo
		LecturaArchivo repo = new LecturaArchivo();
		List<Producto> productos = repo.lectura();
		
		// 2. Instanciar el servicio
		GestionStock gestion = new GestionServiceIMPL();
		
		int opcion;
		
		do {
			System.out.println("\n===== FERRETERÍA UNPAZ - GESTIÓN DE STOCK =====");
			System.out.println("1. Listar productos");
			System.out.println("2. Buscar producto por ID");
			System.out.println("3. Actualizar precio");
			System.out.println("4. Vender producto");
			System.out.println("5. Salir");
			System.out.print("Seleccione una opción: ");
			
			opcion = scanner.nextInt();
			scanner.nextLine(); // Limpieza de buffer
			
			switch (opcion) {
				case 1:
					System.out.println("--- LISTADO COMPLETO ---");
					gestion.listarProductos(productos);
					break;
					
				case 2:
					System.out.print("Ingrese el ID a buscar: ");
					String idBuscar = scanner.nextLine();
					gestion.buscarPorId(productos, idBuscar);
					break;
					
				case 3:
					System.out.print("Ingrese el ID del producto: ");
					String idPrecio = scanner.nextLine();
					System.out.print("Ingrese el nuevo precio: ");
					double nuevoPrecio = scanner.nextDouble();
					scanner.nextLine(); // Limpieza de buffer
					
					gestion.actualizarPrecio(productos, idPrecio, nuevoPrecio);
					break;
					
				case 4:
					System.out.print("Ingrese el ID del producto a vender: ");
					String idVenta = scanner.nextLine();
					System.out.print("Ingrese la cantidad: ");
					int cantidad = scanner.nextInt();
					scanner.nextLine(); // Limpieza de buffer
					
					gestion.venderProducto(productos, idVenta, cantidad);
					break;
					
				case 5:
					System.out.println("Saliendo y guardando sesión...");
					break;
					
				default:
					System.out.println("Opción no válida.");
			}
			
		} while (opcion != 5);
		
		scanner.close();
	}
}