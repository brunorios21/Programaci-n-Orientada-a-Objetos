package ar.com.unpaz.servicio;

import ar.com.unpaz.model.CuentaCorriente;
import java.util.ArrayList;
import java.util.List;

public class CuentaServiceImpl implements CuentaService{
	
	//Creamos la lista en memoria para  guardar las cuentas
	private List<CuentaCorriente> listaCuentas = new ArrayList<>();
	
	@Override
	public void agregarCuenta(CuentaCorriente cuenta) {
		listaCuentas.add(cuenta);
		System.out.println("Cuenta agregada: " + cuenta);
	}
	
	@Override
	public CuentaCorriente buscarCuenta(int numero) {
		//Recorremos la lista buscando el numero de cuenta
		for(CuentaCorriente c : listaCuentas) {
			if (c.getNumeroCuenta() == numero) {
				return c; //Si encontramos la cuenta, la devolvemos
			}
		}
		return null; //Si no encontramos la cuenta, devolvemos null
	}
	@Override
	public boolean eliminarCuenta(int numero) {
		//Primero buscamos usando el metodo que creamos antes
		CuentaCorriente encontrada = buscarCuenta(numero);
		if (encontrada != null) {
			listaCuentas.remove(encontrada);
			return true; //Retorna true si se encontró y eliminó la cuenta
			
		}
		return false; //Retorna false si no se encontró la cuenta
	}
	@Override
	public List<CuentaCorriente> obtenerTodas() {
		return listaCuentas; //Retorna la lista completa de cuentas
	}

}
