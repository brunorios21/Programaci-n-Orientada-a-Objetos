package ar.com.unpaz.model;

public class Libro {
	
	private String codigo;
	private String titulo;
	private String autor;
	private String anio;
	private boolean Prestado;

	//Constructor vacio
	public Libro() {

}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public boolean isEstaPrestado() {
		return Prestado;
	}
	public void setEstaPrestado(boolean estaPrestado) {
		this.Prestado = estaPrestado;
	}

	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", anio=" + anio + ", Prestado="
				+ Prestado + "]";
	}
	
}
