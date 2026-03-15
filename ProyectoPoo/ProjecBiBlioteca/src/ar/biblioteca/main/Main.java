package ar.biblioteca.main;

import ar.biblioteca.principal.*;

public class Main {
    public static void main(String[] args) {
        
        // --- PASO 1: CREAR EL AUTOR ---
        Autor autor1 = new Autor();
        autor1.setNombre("Pablo");
        autor1.setApellido("Picasso");

        // --- PASO 2: CREAR EL LIBRO ---
        // Aquí usamos la clase Libro, no la clase Autor
        Libro libro1 = new Libro();
        libro1.setNumeroLibro(1665);
        // libro1.setEditorial("Narcona"); // Si agregaste este atributo a Libro
        
        // --- PASO 3: VINCULACIÓN (El momento clave) ---
        // Usamos el método que creamos en la clase Autor para conectarlos
        autor1.agregarLibro(libro1);

        // --- PASO 4: COMPROBACIÓN ---
        System.out.println("Datos del Autor:");
        System.out.println("Nombre: " + autor1.getNombre() + " " + autor1.getApellido());
        
        System.out.println("\nNavegando desde el libro hacia el autor:");
        // Gracias a que los vinculamos, el libro ahora conoce a su titular
        System.out.println("El autor del libro " + libro1.getNumeroLibro() + " es: " + libro1.getTitular().getApellido());
        
    } // Aquí cierra el método main
} // Aquí cierra la clase Main
	
