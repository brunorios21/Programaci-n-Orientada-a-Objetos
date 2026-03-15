package ar.biblioteca.principal;

public class Libro {
    private int numeroLibro;
    private String editorial;
    private Autor titular; // Relación 1 a 1: El libro tiene un autor

    // Constructor vacío
    public Libro() {}

    // Getters y Setters
    public int getNumeroLibro() {
        return numeroLibro;
    }

    public void setNumeroLibro(int numeroLibro) {
        this.numeroLibro = numeroLibro;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Autor getTitular() {
        return titular;
    }

    public void setTitular(Autor titular) {
        this.titular = titular;
    }
}