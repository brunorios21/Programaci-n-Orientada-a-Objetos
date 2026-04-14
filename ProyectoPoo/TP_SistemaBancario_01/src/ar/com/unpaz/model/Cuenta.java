package ar.com.unpaz.model;

/**
 * PUNTO 1 DEL ENUNCIADO: Clase Cuenta
 * Esta es la clase base (Superclase). Usamos 'abstract' porque no 
 * queremos instanciar una cuenta genérica, sino tipos específicos.
 */
public abstract class Cuenta {
    // ATRIBUTOS PRIVADOS: Aplicamos Encapsulamiento [cite: 51, 56]
    private String titular;
    private int numeroCuenta;
    private double saldo;

    // CONSTRUCTOR: Para inicializar los atributos al crear el objeto
    public Cuenta(String titular, int numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // GETTERS Y SETTERS: Métodos públicos para acceder a datos privados 
    public String getTitular() { 
    	return titular; }
    public void setTitular(String titular) {
    	this.titular = titular; }

    public int getNumeroCuenta() {
    	return numeroCuenta; }
    public void setNumeroCuenta(int numeroCuenta) {
    	this.numeroCuenta = numeroCuenta; }

    public double getSaldo() {
    	return saldo; }
    public void setSaldo(double saldo) {
    	this.saldo = saldo; }

    /**
     * MÉTODO DEPOSITAR: Aumenta el saldo
     */
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto; // Se suma al saldo actual
            System.out.println("Depósito exitoso. Nuevo saldo: $" + this.saldo);
        }
    }

    /**
     * MÉTODO EXTRAER: Definido como abstracto para que cada hija
     * decida cómo manejar la extracción (ej: con o sin descubierto).
     */
    public abstract boolean extraer(double monto); 
}