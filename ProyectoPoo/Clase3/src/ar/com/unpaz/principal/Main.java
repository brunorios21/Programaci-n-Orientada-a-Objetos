package ar.com.unpaz.principal;

import ar.com.unpaz.model.Alumno;
import ar.com.unpaz.model.AlumnoInvalidoException;
import ar.com.unpaz.model.Curso;

/**
 * Clase principal para ejecutar el programa.
 */
public class Main {

    public static void main(String[] args) {

        // Creamos una instancia de Curso
        Curso curso = new Curso();

        try {

            // Creamos alumnos válidos
            Alumno a1 = new Alumno("Juan", 20, 100);
            Alumno a2 = new Alumno("Maria", 22, 101);

            // Los agregamos al curso
            curso.agregarAlumno(a1);
            curso.agregarAlumno(a2);

            // Caso de error: nombre vacío
            Alumno a3 = new Alumno("", 18, 300);

            // Esta línea no se ejecuta si hay excepción
            curso.agregarAlumno(a3);

        } catch (AlumnoInvalidoException e) {

            // Capturamos el error y lo mostramos
            System.out.println("Error: " + e.getMessage());
        }

        // Mostrar alumnos cargados
        System.out.println("\nAlumnos cargados:");
        curso.mostrarAlumnos();
    }
}