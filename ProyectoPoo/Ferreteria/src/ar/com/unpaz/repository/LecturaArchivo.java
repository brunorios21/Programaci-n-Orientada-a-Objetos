package ar.com.unpaz.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import ar.com.unpaz.model.Producto;

public class LecturaArchivo {

	public List<Producto> lectura() {
		List<Producto> productos = new ArrayList<>();
		File sFile = new File("productos.txt");
		FileReader sFileReader;

		try {
			if (sFile.exists()) {
				sFileReader = new FileReader(sFile);
				BufferedReader sBuffer = new BufferedReader(sFileReader);
				String linea = "";

				while ((linea = sBuffer.readLine()) != null) {
					String array[] = linea.split(";");

					if (array.length >= 4) {
						Producto producto = new Producto();
						producto.setId(array[0]);
						producto.setDescripcion(array[1]);

						// OJO: Precio es Double, Cantidad es Integer
						producto.setPrecio(Double.parseDouble(array[2]));
						producto.setCantidad(Integer.parseInt(array[3])); // Cambié a Integer

						productos.add(producto);
					}
				} // Cierra el while
				sBuffer.close();
			} // Cierra el if exists
		} catch (Exception e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		}

		return productos; // El return va ACÁ, antes de cerrar el método
	} // Cierra el método lectura
} // Cierra la clase LecturaArchivo