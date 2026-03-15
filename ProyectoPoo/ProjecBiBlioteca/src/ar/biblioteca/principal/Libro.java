package ar.biblioteca.principal;

public class Libro {
    private int numeroLibro;
    private String editorial;
    private Autor titular;

    public Libro() {}

    // Getters
    public int getNumeroLibro() { 
        return numeroLibro; 
    }

    public String getEditorial() { 
        return editorial; 
    }

    public Autor getTitular() { 
        return titular; 
    }

    // Setters
    public void setNumeroLibro(int numeroLibro) { 
        this.numeroLibro = numeroLibro; 
    }

    public void setEditorial(String editorial) { 
        this.editorial = editorial; 
    }

    public void setTitular(Autor titular) { 
        this.titular = titular; 
    }
}
