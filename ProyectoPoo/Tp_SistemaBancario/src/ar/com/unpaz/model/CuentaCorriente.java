package ar.com.unpaz.model;

//Heredamos de Cuenta usando "extends"
public class CuentaCorriente extends Cuenta {
	private double descubierto;
	// Constructor que recibe clase madre y el nuevo atributo descubierto
	public CuentaCorriente(String titular, int numeroCuenta, double saldo, double descubierto) {
		super(titular, numeroCuenta, saldo);//"super" envia los datos al constructor de la clase madre (Cuenta)
		this.descubierto = descubierto;
	}
	//Getters and setters para el nuevo atributo descubierto
	public double getDescubierto() {
		return descubierto;
	}
	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
    //SOBREESCRITURA del metodo extraer
	//Aplicamos la logica especial: saldo + descubierto >= limitePermitido
	@Override
	public boolean extraer (double monto) {
		double limitePermitido = getSaldo() + descubierto; //Calculamos el limite permitido sumando el saldo actual y el descubierto
		if(monto > 0 && monto <= limitePermitido) {
			//Si entra acá , restamos del saldo (puede quedar negativo)
			this.saldo -= monto;
			System.out.println("Extracción exitosa. Nuevo saldo: " + getSaldo());
			return true; //Retorna true si la extracción fue exitosa
		}else {
			System.out.println("No se puede extraer el monto solicitado. Saldo insuficiente y descubierto excedido.");
			return false; //Retorna false si no hay suficiente saldo ni descubierto
		}
	}
	//Metodo para mostrar los datos facilmente
	@Override
	public String toString() {
		return "Cuenta Corriete ["+ 
				"Titular:" + getTitular() +
				", Numero de Cuenta:" + getNumeroCuenta() +
				", Saldo:" + getSaldo() +
				", Descubierto: $" + descubierto + "]";
	}

}
