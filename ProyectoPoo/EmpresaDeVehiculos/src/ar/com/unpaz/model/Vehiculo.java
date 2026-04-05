package ar.com.unpaz.model;

public abstract class Vehiculo {
	
	protected String patente;
	protected String marca;
	protected double combustible;
	//Creamos un consturctor vacio para la clase vehiculos,	
	public Vehiculo(String patente, String marca, double combustible) {
		this.patente = patente;
		this.marca = marca;
		this.combustible = combustible;
	}
	//Getters
	public String getPatente() {
		return patente;
	}
	public String getMarca() {
		return marca;
	}
	public double getCombustible() {
		return combustible;
	}
	//Método abstracto para mostrar los datos del vehículo, cada clase hija lo implementará a su manera
	public abstract void avanzar(int km);
}
