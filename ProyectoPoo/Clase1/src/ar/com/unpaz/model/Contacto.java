package ar.com.unpaz.model;

/**
 * La clase Contacto actúa como una "entidad". 
 * Su objetivo es agrupar datos relacionados (dirección y comunicación) 
 * para que no estén sueltos en la clase Cliente.
 */
public class Contacto {
    // ATRIBUTOS (Estado del objeto)
    // Usamos tipos de datos adecuados: String para texto e int para números enteros.
    public String calle;
    public String localidad;
    public int numero;
    public int codigoPostal;
    public String email;

    // --- MÉTODOS DE ACCESO (Getters y Setters) ---
    
    /**
     * Lógica de Localidad
     * get: "Dame la localidad actual de este contacto".
     * set: "Cambia la localidad por esta nueva que te paso".
     */
    public String getLocalidad() {
        return this.localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * Lógica de Calle
     * El uso de 'this.calle' diferencia el atributo de la clase 
     * del parámetro 'calle' que entra en el método.
     */
    public String getCalle() {
        return this.calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Lógica de Numero
     * Al ser un 'int', Java no permite guardar letras aquí, 
     * lo cual asegura que el número de casa sea siempre numérico.
     */
    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Lógica de CodigoPostal
     */
    public int getCodigoPostal() {
        return this.codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * Lógica de Email
     * En una lógica más avanzada, dentro del 'set' se podría validar 
     * si el texto contiene un "@" antes de guardarlo.
     */
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}