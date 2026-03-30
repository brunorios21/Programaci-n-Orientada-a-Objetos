package ar.com.unpaz.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Curso que representa un conjunto de alumnos.
 * Permite agregar alumnos y mostrarlos.
 */
public class Curso {

    // Lista que almacena los alumnos
    private List<Alumno> alumnos;

    /**
     * Constructor que inicializa la lista.
     */
    public Curso() {
        alumnos = new ArrayList<>();
    }

    /**
     * Agrega un alumno al curso con validaciones.
     * @param alumno Alumno a agregar
     */
    public void agregarAlumno(Alumno alumno) {

        // Validar que no sea null
        if (alumno == null) {
            throw new AlumnoInvalidoException(
                "No se puede agregar un alumno nulo."
            );
        }

        // Validar que no exista el mismo legajo
        if (existeLegajo(alumno.getLegajo())) {
            throw new AlumnoInvalidoException(
                "Ya existe un alumno con el legajo: " + alumno.getLegajo()
            );
        }

        // Agregar alumno a la lista
        alumnos.add(alumno);
    }

    /**
     * Verifica si ya existe un alumno con ese legajo.
     * @param legajo Número de legajo
     * @return true si existe, false si no
     */
    private boolean existeLegajo(int legajo) {

        for (Alumno a : alumnos) {
            if (a.getLegajo() == legajo) {
                return true;
            }
        }

        return false;
    }

    /**
     * Muestra todos los alumnos del curso.
     */
    public void mostrarAlumnos() {

        for (Alumno a : alumnos) {
            a.mostrarDatos();
        }
    }
}