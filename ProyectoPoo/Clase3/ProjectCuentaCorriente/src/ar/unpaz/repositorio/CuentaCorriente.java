package ar.unpaz.repositorio;

public class CuentaCorriente extends Cuenta {
    
    private double descubierto;

    // Constructor vacío
    public CuentaCorriente() {
        super(); 
    }

    // Constructor con parámetros
    public CuentaCorriente(String titular, String numeroCuenta, double saldo, double descubierto) {
        super(titular, numeroCuenta, saldo); // Envía los datos a la clase Cuenta
        this.descubierto = descubierto;
    }

    public double getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(double descubierto) {
        this.descubierto = descubierto;
    }

    // Lógica de extracción (Líneas 27 y 28 ahora funcionan)
    public void extraer(double monto) {
        if (monto <= (getSaldo() + descubierto)) {
            setSaldo(getSaldo() - monto);
        } else {
            System.out.println("Error: Fondos insuficientes.");
        }
    }
}