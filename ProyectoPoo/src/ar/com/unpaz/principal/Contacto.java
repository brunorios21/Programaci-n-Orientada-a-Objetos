package ar.com.unpaz.principal; 

public class Contacto {
    // Atributos que definen la dirección y comunicación del cliente
    private String calle;
    private String localidad;
    private int numero;
    private int codigoPostal;
    private String email;

    // Métodos de acceso (Getters y Setters)
    public String getLocalidad() { 
        return localidad; 
    }
    public void setLocalidad(String localidad) { 
        this.localidad = localidad; 
    }

    public String getCalle() { 
        return calle; 
    }
    public void setCalle(String calle) { 
        this.calle = calle; 
    }

    public int getNumero() { 
        return numero; 
    }
    public void setNumero(int numero) { 
        this.numero = numero; 
    }

    public int getCodigoPostal() { 
        return codigoPostal; 
    }
    public void setCodigoPostal(int codigoPostal) { 
        this.codigoPostal = codigoPostal; 
    }

    public String getEmail() { 
        return email; 
    }
    public void setEmail(String email) { 
        this.email = email; 
    }
}
