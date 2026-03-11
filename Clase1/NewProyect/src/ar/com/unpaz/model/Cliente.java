package ar.com.unpaz.model;
import java.util.List;
public class Cliente {
    private String nombre;
    private String apellido;
    public Cuenta cuenta;
    public Contacto contacto;
    private list <cuenta>
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;}
    
    public void setCuenta(Cuenta cuenta) {
    	this.cuenta = cuenta;
	}
    public Cuenta getCuenta() {
    	return this.cuenta;
    }
    public void setContacto(Contacto contacto) {
    	this.contacto = contacto;
    }
}