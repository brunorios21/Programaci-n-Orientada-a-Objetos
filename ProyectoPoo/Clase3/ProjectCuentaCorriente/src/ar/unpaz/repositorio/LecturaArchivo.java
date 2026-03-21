package ar.unpaz.repositorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import ar.unpaz.repositorio.CuentaCorriente;

public class LecturaArchivo {

    // El método ahora devuelve una lista de objetos CuentaCorriente
    public List<CuentaCorriente> leerArchivo() {
        // 1. Inicializar la lista de objetos
        List<CuentaCorriente> cuentasCorrientes = new ArrayList<CuentaCorriente>();
        
        // 2. Apuntar al archivo físico
        File sFile = new File("cuenta_corrientes.txt");
        
        try {
            FileReader sFileReader = new FileReader(sFile);
            BufferedReader buffer = new BufferedReader(sFileReader);
            String linea = "";
            
            // 3. Ciclo para leer cada renglón
            while ((linea = buffer.readLine()) != null) {
                // Separar los datos por punto y coma
                String[] array = linea.split(";");
                
                // Crear instancia de CuentaCorriente y cargar sus datos
                CuentaCorriente cc = new CuentaCorriente();
                cc.setTitular(array[0]);
                cc.setNumeroCuenta(array[1]);
                
                // Convertir Strings a Double para el saldo y el descubierto
                cc.setSaldo(Double.parseDouble(array[2]));
                cc.setDescubierto(Double.parseDouble(array[3]));
                
                // Guardar el objeto en la lista
                cuentasCorrientes.add(cc);
            }
            buffer.close(); // Cerrar el flujo de datos
        } catch (Exception e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
        
        return cuentasCorrientes; // Retornar la lista cargada
    }
}