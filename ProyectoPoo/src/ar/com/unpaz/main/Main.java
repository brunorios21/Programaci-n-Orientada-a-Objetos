package ar.com.unpaz.main;

import ar.com.unpaz.principal.*; // Importamos nuestras clases

public class Main {
    public static void main(String[] args) {
        
        // --- PASO 1: INSTANCIACIÓN ---
        // Creamos la "cáscara" del cliente en memoria
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Bruno");
        cliente1.setApellido("Rios");
        cliente1.setDNI(43986432);
        
        // --- PASO 2: OBJETO DE APOYO ---
        // Creamos el contacto. El cliente no puede nacer con dirección, se la asignamos luego.
        Contacto contacto1 = new Contacto();
        contacto1.setCalle("Jose maria paz");
        contacto1.setNumero(2985);
        contacto1.setEmail("brunorioscorp4@gmail.com");
        
        // Vinculamos el contacto al cliente (Relación 1 a 1)
        cliente1.setContacto(contacto1);

        // --- PASO 3: MANEJO DE COLECCIONES ---
        // Creamos dos cuentas distintas
        Cuenta c1 = new Cuenta();
        c1.setNumeroCuenta(20002);
        c1.setSaldo(1500.50);

        Cuenta c2 = new Cuenta();
        c2.setNumeroCuenta(20003);
        c2.setSaldo(50000.00);
        
        // Usamos el método que creamos para vincularlas de ambos lados
        cliente1.agregarCuenta(c1);
        cliente1.agregarCuenta(c2);

        // --- PASO 4: PRUEBA DE NAVEGABILIDAD ---
        // Esto demuestra que la relación funciona:
        // Desde la 'cuenta1' puedo llegar al 'email' que está dentro del 'contacto' del 'titular'
        System.out.println("Navegando datos:");
        System.out.println("El titular de la cuenta " + c1.getNumeroCuenta() + " es: " + c1.getTitular().getNombre());
        System.out.println("Su email es: " + c1.getTitular().getContacto().getEmail());
    }
}