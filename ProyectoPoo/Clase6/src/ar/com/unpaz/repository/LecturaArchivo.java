package ar.com.unpaz.repository;

import java.io.BufferedReader;
import java.io.File; // Faltaba esta importación
import java.io.FileReader;
import java.io.IOException; // Es mejor capturar excepciones específicas
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.model.Libro;

public class LecturaArchivo {
    
    public List<Libro> lectura() {
        List<Libro> lista = new ArrayList<>();
        
        // Corregido: Declaración correcta de File
        File sFile = new File("libros.txt");
        
        // Uso de try-with-resources para asegurar que el archivo se cierre solo
        try (FileReader sFileReader = new FileReader(sFile);
             BufferedReader sBuffer = new BufferedReader(sFileReader)) {
            
            String linea;
            while ((linea = sBuffer.readLine()) != null) {
                // Separar los datos por punto y coma
                String[] array = linea.split(";");
                
                // Validar que la línea tenga todos los campos necesarios para evitar IndexOutOfBoundsException
                if (array.length >= 5) {
                    Libro libro = new Libro();
                    libro.setCodigo(array[0]);
                    libro.setTitulo(array[1]);
                    libro.setAutor(array[2]);
                    libro.setAnio(array[3]);
                    libro.setPrestado(Boolean.parseBoolean(array[4]));
                    
                    lista.add(libro);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
        
        return lista;
    }
}