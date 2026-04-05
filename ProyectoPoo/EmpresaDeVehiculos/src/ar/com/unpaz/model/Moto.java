package ar.com.unpaz.model;

public class Moto extends Vehiculo {
	
	public Moto(String patente, String marca, double combustible) {
		super(patente, marca, combustible);
		
	}
	@Override
	public void avanzar(int km) {
		double consumoNecesario = km / 20.0;
		
		if(combustible >= consumoNecesario) {
			combustible -= consumoNecesario;
			System.out.println("La moto avanzó " + km + " km. Combustible restante: " + combustible);
		} else {
			System.out.println("No hay suficiente combustible para avanzar " + km + " km. Combustible restante: " + combustible);
		}
	}

}