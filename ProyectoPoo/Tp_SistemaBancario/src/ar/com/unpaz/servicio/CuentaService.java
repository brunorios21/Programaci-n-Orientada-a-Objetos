package ar.com.unpaz.servicio;

import ar.com.unpaz.model.CuentaCorriente;
import java.util.List;

public interface CuentaService {
	//1. Agregar una cuenta
	void agregarCuenta(CuentaCorriente cuenta);
	//2. Buscar una cuenta por numero (debuelve el objeto encontrado
    CuentaCorriente buscarCuenta(int numero);
    //3. Eliminar cuenta por numero (devuelve true si la encontró y borró)
    boolean eliminarCuenta(int numero);
    //4.  obtener la lista completa de cuentas
    List<CuentaCorriente> obtenerTodas();
}