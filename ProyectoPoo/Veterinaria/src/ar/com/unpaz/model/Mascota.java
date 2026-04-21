package ar.com.unpaz.model;

public class Mascota {
	private String nombre;
	private String raza;
	private Boolean edad;
	private String tipo;
	public Mascota(String nombre, String raza, Boolean edad, String tipo) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}
	public Mascota(String nombre2, String especie, int edad2) {
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public Boolean getEdad() {
		return edad;
	}
	public void setEdad(Boolean edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + "]";
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
		// TODO Auto-generated method stub
		
	}
	
	

}
