package ar.unpaz.model;

import ar.unpaz.repositorio.LecturaArchivo;
import ar.unpaz.repositorio.CuentaCorriente; 
import java.util.List;

public class inicio {
    public static void main(String[] args) {
        // 1. Instanciar el lector del repositorio
        LecturaArchivo lecturaDeArchivo = new LecturaArchivo();
        
        // 2. RECUPERAR LA LISTA (Línea 12 corregida)
        List<CuentaCorriente> listadoDeCuentas = lecturaDeArchivo.leerArchivo();
        
        System.out.println("--- Contenido del archivo ---");
        
        // 3. Recorrer la lista de objetos 
        for (CuentaCorriente s : listadoDeCuentas) {
            // Usamos el getter para mostrar el nombre del titular
            System.out.println("Titular: " + s.getTitular());
        }
    }
}
