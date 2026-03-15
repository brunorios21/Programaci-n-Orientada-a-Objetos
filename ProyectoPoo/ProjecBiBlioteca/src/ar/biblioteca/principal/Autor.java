package ar.biblioteca.principal;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nombre;
    private String apellido;
    private int dni;
    private List<Libro> libros;

    public Autor() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro nuevoLibro) {
        this.libros.add(nuevoLibro);
        nuevoLibro.setTitular(this);
    }

    // Getters
    public String getNombre() { 
        return nombre; 
    }

    public String getApellido() { 
        return apellido; 
    }

    public int getDni() { 
        return dni; 
    }

    public List<Libro> getLibros() { 
        return libros; 
    }

    // Setters
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public void setApellido(String apellido) { 
        this.apellido = apellido; 
    }

    public void setDni(int dni) { 
        this.dni = dni; 
    }
}
