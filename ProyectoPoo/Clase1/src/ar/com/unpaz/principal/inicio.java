package ar.com.unpaz.principal;

import ar.com.unpaz.model.*;

public class Main {
    public static void main(String[] args) {
        
        // --- SECCIÓN 1: IDENTIDAD DEL CLIENTE ---
        // Instanciamos el objeto basándonos en la clase Cliente [cite: 1]
        Cliente cliente1 = new Cliente();
        
        // Cargamos los datos básicos. Usamos 'setDni' (minúscula) para coincidir con el modelo.
        cliente1.setNombre("Bruno");
        cliente1.setApellido("Rios");
        cliente1.setDni(43986432); 
        
        System.out.println("=== INFORMACIÓN DEL CLIENTE ===");
        System.out.println("Nombre: " + cliente1.getNombre());
        System.out.println("Apellido: " + cliente1.getApellido());
        System.out.println("DNI: " + cliente1.getDni());
        
        System.out.println("--------------------------------");

        // --- SECCIÓN 2: CONTACTO Y COMPOSICIÓN ---
        // Creamos un objeto Contacto para dárselo al cliente.
        Contacto contacto1 = new Contacto();
        contacto1.setCalle("Jose Maria Paz");
        contacto1.setNumero(1234); 
        contacto1.setLocalidad("Jose C. Paz");
        contacto1.setCodigoPostal(1663);
        contacto1.setEmail("brunorioscorp4@gmail.com");
        
        // Lógica de Asociación: "Enchufamos" el contacto dentro del cliente.
        cliente1.setContacto(contacto1);
        
        System.out.println("Dirección: " + cliente1.getContacto().getCalle() + " " + cliente1.getContacto().getNumero());
        System.out.println("Email: " + cliente1.getContacto().getEmail());
        
        System.out.println("--------------------------------");

        // --- SECCIÓN 3: MANEJO DE CUENTAS (LISTAS) ---
        // Creamos la primera cuenta bancaria.
        Cuenta cuenta1 = new Cuenta();
        cuenta1.setNumeroCuenta(100133);
        cuenta1.setSaldo(1000000); // Java no usa puntos para miles en variables double.
        
        // Agregamos la cuenta a la lista interna del cliente.
        cliente1.setCuenta(cuenta1);
        
        // Creamos una segunda cuenta para demostrar que el cliente puede tener varias.
        Cuenta cuenta2 = new Cuenta();
        cuenta2.setNumeroCuenta(100134);
        cuenta2.setSaldo(5500.50);
        cliente1.setCuenta(cuenta2);

        // --- SECCIÓN 4: RECORRIDO DE DATOS ---
        System.out.println("=== RESUMEN DE CUENTAS BANCARIAS ===");
        
        // Lógica de Bucle: Recorremos la lista de cuentas del cliente.
        // Usamos getNumberCuenta() porque así fue definido en tu clase Cuenta.
        for (Cuenta c : cliente1.getCuenta()) {
            System.out.println("CBU Nro: " + c.getNumberCuenta() + " | Saldo Disponible: $" + c.getSaldo());
        }
    }
}