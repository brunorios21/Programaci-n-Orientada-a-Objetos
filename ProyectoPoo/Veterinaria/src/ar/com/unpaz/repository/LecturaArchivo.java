package ar.com.unpaz.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.model.Mascota;

public class LecturaArchivo {
	
	public List<Mascota> lectura(){
		// IMPORTANTE: Siempre inicializamos la lista con new para evitar el NullPointerException
		List<Mascota> mascotas = new ArrayList<>();
		
		File sFile = new File("mascotas.txt");
   	  	FileReader sFileReader;
   	  try {
   		  if (sFile.exists()) { // Verificamos que el archivo esté para que no explote
   			  sFileReader = new FileReader(sFile);
   			  BufferedReader sBuffer = new BufferedReader(sFileReader);
   			  String linea = "";
   			  
   			  while((linea = sBuffer.readLine()) != null) {
   				  // Usamos el separador ";" que es el que me mostraste de tu archivo
   				  String array[] = linea.split(";");
   				  
   				  // Creamos el objeto usando el constructor (Nombre, Especie, Edad)
   				  // Usamos los índices del array: array[1] es nombre, array[2] especie, array[3] edad
   				  Mascota mascota = new Mascota(linea, linea, null, linea);
   				  
   				  mascota.setNombre(array[1]);
   				  mascota.setTipo(array[2]);
   				  // Si la edad en tu modelo es Integer, usamos parseInt
   				  mascota.setEdad(Boolean.parseBoolean(array[3])); 
   				  
   				  mascotas.add(mascota);
   			  }
   			  sBuffer.close(); // Cerramos el lector de archivos
   		  }
   	  } catch (Exception e) {
   		  // Si hay error, mostramos qué pasó pero devolvemos la lista (aunque sea vacía)
   		  System.out.println("Error al leer el archivo: " + e.getMessage());
   	  }
   	  
   	  return mascotas;
	}

	// Borramos el lectura1 o lo dejamos vacío para que no confunda al Main
}  	  
