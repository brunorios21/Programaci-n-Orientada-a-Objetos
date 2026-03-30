package ar.com.unpaz.model;

/**
 * Clase Persona que representa una entidad básica del sistema.
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private String dni;
    private String direccion;

    /**
     * Constructor con parámetros y validaciones básicas.
     */
    public Persona(String nombre, int edad, String dni, String direccion) {
    	// Validación del nombre; no puede ser null ni vacío (considerando espacios)
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser vacío");
        }
        // Validación de la edad; debe ser mayor a 0; no tiene sentido una persona con edad negativa o cero
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad debe ser mayor a 0");

        }
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.direccion = direccion;
    }

    /**
     * Constructor vacío.
     */
    public Persona() {
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método para mostrar los datos de la persona.
     */
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
        System.out.println("Dirección: " + direccion);
    }
}