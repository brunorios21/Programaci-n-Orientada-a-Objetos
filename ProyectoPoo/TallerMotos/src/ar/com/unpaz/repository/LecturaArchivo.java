package ar.com.unpaz.repository;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import ar.com.unpaz.model.Moto;

public class LecturaArchivo {
	
	public List<Moto> lectura() {
		// 1. Corregí el nombre de la variable para que coincida con el return
		List<Moto> listaMotos = new ArrayList<>();
		
		File sFile = new File("Motos.txt");
		
		try {
			// 2. Es sFile.exists() con 's' al final
			if (sFile.exists()) {
				FileReader sFileReader = new FileReader(sFile);
				// 3. Ojo los typos: es BufferedReader (una sola 'e' y doble 'f')
				BufferedReader sBuffer = new BufferedReader(sFileReader);
				String linea = "";
				
				while((linea = sBuffer.readLine()) != null) {
					String array[] = linea.split(",");
					
					if(array.length >= 3) {
						// 4. Usá el constructor vacío o el que tengas en el Model
						Moto moto = new Moto();
						
						moto.setPatente(array[0]);
						moto.setModelo(array[1]); // Te faltaba setear el modelo
						moto.setAnio(array[2]);
						// Si hay un 4to dato para el boolean:
						// moto.setEstaReparada(Boolean.parseBoolean(array[3]));
						
						listaMotos.add(moto);
					}
				}
				sBuffer.close();
			}
		} catch (Exception e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		}
		
		// 5. El return tiene que estar FUERA del try-catch pero DENTRO del método
		return listaMotos;
	}
}