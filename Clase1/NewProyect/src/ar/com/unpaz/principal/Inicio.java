import ar.com.unpaz.model.Cliente;
import ar.com.unpaz.model.Cuenta;

public class Inicio {
    public static void main(String[] args) {
    	Cuenta c = new Cuenta();
    	c.setNroCuenta(3243254);
    	
    	Contacto contacto = new Contacto();
    	Contacto.setDireccion("Alen");
        System.out.println("--- Sistema Bancario UNPAZ ---");
        
        Cliente cliente = new Cliente();
        cliente.setNombre("Pepa");
        cliente.setApellido("Pig");
        
        // Corrected the concatenation and method call
        cliente.setCuenta(c);
        cliente.setContacto(contacto);
        
        System.out.println("El nombre de la persona: " + cliente.getNombre() + " " + cliente.getApellido());
        
    }
}