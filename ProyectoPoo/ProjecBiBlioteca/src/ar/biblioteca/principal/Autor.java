package ar.biblioteca.principal;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nombre;
    private String apellido;
    private int dni;
    private List<Libro> libros; // Relación 1 a muchos

    public Autor() {
        this.libros = new ArrayList<>();
    }

    // Método especial para vincular
    public void agregarLibro(Libro nuevoLibro) {
        this.libros.add(nuevoLibro);
        nuevoLibro.setTitular(this); // El libro ahora sabe quién es su autor
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getDni() { return dni; }
    public void setDni(int dni) { this.dni = dni; }

    public List<Libro> getLibros() { return libros; }
}