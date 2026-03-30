package ar.com.unpaz.model;

public class Cuenta {
    // ATRIBUTOS PRIVADOS (Encapsulamiento)
    // Al ser 'private', nadie desde afuera (ni siquiera el Main) puede 
    // modificar el saldo o el número de cuenta directamente. 
    // Solo pueden hacerlo a través de los métodos públicos.
    private int numeroCuenta;
    private double saldo;
    
    // ASOCIACIÓN: La cuenta sabe quién es su dueño.
    private Cliente titular;

    // --- LÓGICA DEL TITULAR ---
    /**
     * Permite conectar esta cuenta con un objeto Cliente.
     * Así, si tenemos la cuenta, podemos saber el nombre del dueño
     * haciendo: cuenta.getTitular().getNombre();
     */
    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    // --- LÓGICA DEL NÚMERO DE CUENTA ---
    // Nota: Tenías un pequeño typo en el nombre del método "getNumberCuenta", 
    // lo ideal es mantener el idioma (getNumeroCuenta).
    public int getNumberCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }


    // --- LÓGICA DEL SALDO ---
    /**
     * El saldo se define como 'double' porque el dinero suele tener 
     * decimales (centavos).
     */
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        // Aquí podrías agregar lógica extra, por ejemplo:
        // if (saldo < 0) { System.out.println("No se permite saldo negativo"); }
        this.saldo = saldo;
    }
}