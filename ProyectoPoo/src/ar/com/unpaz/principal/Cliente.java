package ar.com.unpaz.principal; // Asegúrate de que coincida con tu carpeta

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    // Atributos privados para seguir el principio de encapsulamiento (POO)
    private String nombre;
    private String apellido;
    private int dni; // Faltaba declarar esta variable
    private Contacto contacto;
    private List<Cuenta> cuentas;

    // Constructor: Inicializa la lista para evitar errores de "NullPointerException"
    public Cliente() {
        this.cuentas = new ArrayList<>();
    }

    // Lógica de Cuentas
    public List<Cuenta> getCuentas() {
        return this.cuentas;
    }

    // Al agregar una cuenta, establecemos este cliente como su titular (Relación bidireccional)
    public void agregarCuenta(Cuenta nuevaCuenta) {
        this.cuentas.add(nuevaCuenta);
        if (nuevaCuenta.getTitular() != this) {
            nuevaCuenta.setTitular(this);
        }
    }

    // Getters y Setters estándar
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getDNI() { return dni; }
    public void setDNI(int dni) { this.dni = dni; }

    public Contacto getContacto() { return contacto; }
    public void setContacto(Contacto contacto) { this.contacto = contacto; }
}

