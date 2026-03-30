package ar.com.unpaz.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    // ATRIBUTOS: Son las características que definen al Cliente.
    public String nombre;
    public String apellido;
    public int dni;
    
    // RELACIONES: Aquí es donde vive la "magia". 
    // Un cliente tiene UN objeto de contacto y una LISTA de cuentas.
    public Contacto contacto;
    public List<Cuenta> cuentas;

    // CONSTRUCTOR: Es el método que se ejecuta cuando hacés "new Cliente()".
    public Cliente() {
        // Inicializamos la lista para que no sea 'null'. 
        // Es como comprar el folio antes de empezar a meterle hojas (cuentas).
        this.cuentas = new ArrayList<>();
    }

    // --- LÓGICA DE CUENTAS ---

    // Este método devuelve la lista completa de cuentas que posee el cliente.
    public List<Cuenta> getCuenta() {
        return this.cuentas;
    }

    // Este método es clave: Agrega una cuenta a la lista y, al mismo tiempo,
    // le avisa a esa cuenta quién es su dueño (this).
    public void setCuenta(Cuenta nuevaCuenta) {
        this.cuentas.add(nuevaCuenta);
        // Establecemos una relación bidireccional si la clase Cuenta tiene setTitular.
        nuevaCuenta.setTitular(this);
    }

    // --- GETTERS Y SETTERS ESTÁNDAR ---
    // Sirven para leer (get) y escribir (set) los datos privados de forma segura.

    // Lógica para el Nombre
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; // 'this.nombre' es el atributo, 'nombre' es el parámetro.
    }

    // Lógica para el Apellido
    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Lógica para el DNI
    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    // Lógica para el Contacto
    // Permite asociar toda la información de dirección/email al cliente.
    public Contacto getContacto() {
        return this.contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
}