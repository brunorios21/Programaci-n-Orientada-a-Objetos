package ar.com.unpaz.model;

public class Auto extends Vehiculo {
	
	public Auto(String patente, String marca, double combustible) {
		super(patente, marca, combustible);
		
	}
	@Override
	public void avanzar(int km) {
		double consumoNecesario = km / 10.0;
		
		if(combustible >= consumoNecesario) {
			combustible -= consumoNecesario;
			System.out.println("El auto avanzó " + km + " km. Combustible restante: " + combustible);
		} else {
			System.out.println("No hay suficiente combustible para avanzar " + km + " km. Combustible restante: " + combustible);
		}
	}
	

}
