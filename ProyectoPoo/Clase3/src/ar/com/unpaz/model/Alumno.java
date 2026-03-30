package ar.com.unpaz.model;

/**
 * Clase Alumno que representa a un estudiante.
 * Contiene atributos básicos y validaciones en el constructor.
 */
public class Alumno {

    // Atributos privados (encapsulamiento)
    private String nombre;
    private int edad;
    private int legajo;

    /**
     * Constructor que valida los datos antes de crear el objeto.
     * @param nombre Nombre del alumno (no puede ser vacío)
     * @param edad Edad del alumno (debe ser mayor a 0)
     * @param legajo Número de identificación (debe ser positivo)
     */
    public Alumno(String nombre, int edad, int legajo) {

        // Validación del nombre
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new AlumnoInvalidoException("El nombre no puede ser vacío");
        }

        // Validación de la edad
        if (edad <= 0) {
            throw new AlumnoInvalidoException("La edad debe ser mayor a cero");
        }

        // Validación del legajo
        if (legajo <= 0) {
            throw new AlumnoInvalidoException("El legajo debe ser positivo");
        }

        // Asignación de valores si pasan las validaciones
        this.nombre = nombre.trim();
        this.edad = edad;
        this.legajo = legajo;
    }

    // Getters (acceso controlado a los atributos)

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getLegajo() {
        return legajo;
    }

    /**
     * Método que muestra los datos del alumno en consola.
     */
    public void mostrarDatos() {
        System.out.println(
            "Alumno: " + nombre +
            " | Edad: " + edad +
            " | Legajo: " + legajo
        );
    }
}