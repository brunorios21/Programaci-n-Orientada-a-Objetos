package ar.com.unpaz.servicio;
//Importamos el modelo porque esta en otro paquete
import ar.com.unpaz.model.CuentaCorriente;
import java.util.ArrayList;
import java.util.List;

/**
 * PUNTO 4 DEL ENUNCIADO: Implementación del Servicio
 * Esta clase administra la colección de objetos 
 */
public class CuentaServiceImpl implements CuentaService {
    // Usamos ArrayList para almacenar múltiples objetos dinámicamente [cite: 71, 74, 81]
    private List<CuentaCorriente> listaCuentas;

    public CuentaServiceImpl() {
        this.listaCuentas = new ArrayList<>();
    }

    @Override
    public void agregarCuenta(CuentaCorriente cuenta) {
        listaCuentas.add(cuenta); // Agregamos el objeto a la lista [cite: 76]
    }

    @Override
    public CuentaCorriente buscarCuenta(int numeroCuenta) {
        // Recorremos la lista para buscar la cuenta por número [cite: 86, 95]
        for (CuentaCorriente c : listaCuentas) {
            if (c.getNumeroCuenta() == numeroCuenta) {
                return c; // Si coincide, devolvemos el objeto
            }
        }
        return null; // Si no lo encuentra, devuelve nulo
    }

    @Override
    public void eliminarCuenta(int numeroCuenta) {
        CuentaCorriente c = buscarCuenta(numeroCuenta);
        if (c != null) {
            listaCuentas.remove(c); // Eliminamos de la lista [cite: 79, 96]
            System.out.println("LOG: Cuenta " + numeroCuenta + " eliminada.");
        } else {
            System.out.println("LOG: Error - La cuenta no existe.");
        }
    }

    @Override
    public List<CuentaCorriente> obtenerCuentas() {
        return listaCuentas; // Devuelve la lista completa [cite: 107]
    }
}
