package ar.com.unpaz.servicio;
import ar.com.unpaz.model.CuentaCorriente;
import java.util.List;

/**
 * PUNTO 3 DEL ENUNCIADO: Interfaz CuentaService
 * Aquí definimos el "contrato" de operaciones CRUD [cite: 91, 103]
 */
public interface CuentaService {
    void agregarCuenta(CuentaCorriente cuenta); // Crear
    CuentaCorriente buscarCuenta(int numeroCuenta); // Leer/Buscar
    void eliminarCuenta(int numeroCuenta); // Borrar
    List<CuentaCorriente> obtenerCuentas(); // Listar
}