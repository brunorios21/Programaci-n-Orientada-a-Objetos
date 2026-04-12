package ar.com.unpaz.model;

public class Cuenta {
	// Atributos de la clase Cuenta
	private String titular;
	private int numeroCuenta; //Va int porque es un numero de cuenta, no se van hacer operaciones matematicas con el numero de cuenta, por lo que no es necesario que sea un tipo de dato mas grande como long
	protected double saldo; //El saldo es protegido para que las clases hijas puedan acceder a él directamente
		public Cuenta(String titular, int numeroCuenta, double saldo) {
			this.titular = titular;
			this.numeroCuenta = numeroCuenta;
			this.saldo = saldo;
	}
	// Getters y Setters para acceder a los atributos de forma segura
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//Metodo epositar(double monto); este método recibe un monto a depositar
	public void depositar(double monto) {
		if (monto > 0) {
			saldo += monto; //Aumenta el saldo con el monto depositado
		} else {
				System.out.println("El monto a depositar debe ser positivo.");
		}
	}
	//Creamos el metdodo extraer(double monto); este método recibe un monto a extraer
	public boolean extraer(double monto) {
		if (monto <= saldo) {
			saldo -= monto;//Disminuye el saldo con el monto extraido
			return true; //Retorna true si la extracción fue exitosa
		} else {
			System.out.println("Saldo insuficiente para extraer el monto solicitado.");
			return false; //Retorna false si no hay suficiente saldo
		
		}
	}
}

