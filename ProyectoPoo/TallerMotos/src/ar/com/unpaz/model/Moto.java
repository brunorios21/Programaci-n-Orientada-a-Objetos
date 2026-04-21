package ar.com.unpaz.model;

public class Moto {
	
	private String patente;
	private String modelo;
	private String anio;
	private Boolean estaReparada;

	
	public Moto(String patente, String modelo, String anio, Boolean estaReparada) {
		this.patente = patente;
		this.modelo = modelo;
		this.anio = anio;
		this.estaReparada = estaReparada;
		
		
	}
	// Constructor vacío: permite hacer "new Moto()"
	public Moto() {
	}
	



	public String getPatente() {
		return patente;
	}


	public void setPatente(String patente) {
		this.patente = patente;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getAnio() {
		return anio;
	}


	public void setAnio(String anio) {
		this.anio = anio;
	}


	public Boolean getEstaReparada() {
		return estaReparada;
	}


	public void setEstaReparada(Boolean estaReparada) {
		this.estaReparada = estaReparada;
	}


	@Override
	public String toString() {
		return "Moto [patente=" + patente + ", modelo=" + modelo + ", anio=" + anio + ", estaReparada=" + estaReparada
				+ "]";
	}
	
}
	
	
