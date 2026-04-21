package ar.com.unpaz.serviceIMPL;

import java.util.List;
import ar.com.unpaz.model.Moto;
import ar.com.unpaz.service.GestionService;

public class GestionServiceIMPL implements GestionService {

	@Override
	public void ListarPatenteMoto(List<Moto> motos) {
			//Listamos todas las motos recorriendo la lista
			for (Moto moto : motos) {
				System.out.println(moto.getPatente());
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarPatente(List<Moto> motos, String patenteBuscada) {
		Boolean encontro = false;
		for (Moto m : motos) {
			if(m.getPatente() != null && m.getPatente().equalsIgnoreCase(patenteBuscada)){
				System.out.println("Moto encontrada" + m);
				encontro = true;
				break;
			}
		}
		System.out.println("No se encontro el vehiculo");
	}

	@Override
	public void guardarPatente(List<Moto> motos,Moto nuevaMoto) {
			//Simplemente agregamos el objeto que armamos en el Main
			motos.add(nuevaMoto);
			System.out.println("La patente ya existe");
				
	}
}

	
