package ar.com.unpaz.model;

/**
 * PUNTO 2 DEL ENUNCIADO: Clase CuentaCorriente
 * 'extends' indica que hereda de Cuenta 
 */
public class CuentaCorriente extends Cuenta {
    // Atributo específico solicitado por el enunciado
    private double descubierto;

    public CuentaCorriente(String titular, int numeroCuenta, double saldo, double descubierto) {
        // 'super' llama al constructor de la clase padre (Cuenta) [cite: 30]
        super(titular, numeroCuenta, saldo);
        this.descubierto = descubierto;
    }

    public double getDescubierto() {
    	return descubierto; }
    public void setDescubierto(double descubierto) {
    	this.descubierto = descubierto; }

    /**
     * Lógica de extracción considerando el descubierto permitido.
     */
    @Override
    public boolean extraer(double monto) {
        // Verifica si el saldo + el margen de descubierto alcanzan para el monto
        if (getSaldo() + descubierto >= monto) {
            setSaldo(getSaldo() - monto);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cuenta Corriente Nro: " + getNumeroCuenta() + " | Titular: " + getTitular() + 
               " | Saldo: $" + getSaldo() + " | Descubierto: $" + descubierto;
    }
}