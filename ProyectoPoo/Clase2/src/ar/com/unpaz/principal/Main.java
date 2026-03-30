package ar.com.unpaz.principal;
import ar.com.unpaz.model.Persona;
// Importamos la clase Persona para poder usarla en el main
public class Main {
    public static void main(String[] args) {
    	// Creamos un objeto de la clase Persona usando el constructor con parámetros
        Persona p = new Persona(" Brunoo", 24, "1123240691", "Calle jose maria paz 123");
        // Mostramos los datos de la persona usando el método mostrarDatos
        p.mostrarDatos();

    }
}