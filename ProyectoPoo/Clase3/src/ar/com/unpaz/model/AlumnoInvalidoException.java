package ar.com.unpaz.model;

/**
 * Excepción personalizada para manejar errores relacionados con Alumno.
 * Extiende RuntimeException para no ser obligatoria (unchecked).
 */
public class AlumnoInvalidoException extends RuntimeException {

    /**
     * Constructor que recibe un mensaje de error.
     * @param mensaje Descripción del error
     */
    public AlumnoInvalidoException(String mensaje) {
        super(mensaje);
    }
}