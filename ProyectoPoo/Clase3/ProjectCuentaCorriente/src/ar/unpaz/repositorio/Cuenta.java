package ar.unpaz.repositorio;

public class Cuenta {
    // Atributos protegidos para que las clases hijas los vean
    protected String titular;
    protected String numeroCuenta;
    protected double saldo;

    // Constructor vacío (necesario para el super() de la hija)
    public Cuenta() {
    }

    // Constructor con parámetros
    public Cuenta(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}
