package ar.com.unpaz.principal;

public class Cuenta {
    private int numeroCuenta;
    private double saldo;
    private Cliente titular; // Asociación: Una cuenta pertenece a un Cliente

    // Lógica del Titular
    public Cliente getTitular() {
        return this.titular;
    }

    // Permite asignar quién es el dueño de esta cuenta
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    // Lógica del Número de Cuenta
    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    // Lógica del Saldo (Podrías agregar métodos como depositar o retirar aquí)
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
