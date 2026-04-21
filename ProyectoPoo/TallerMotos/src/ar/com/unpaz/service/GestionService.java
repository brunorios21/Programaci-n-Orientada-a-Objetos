package ar.com.unpaz.service;

import java.util.List;
import ar.com.unpaz.model.Moto;

public interface GestionService {
	void ListarPatenteMoto(List<Moto> motos);
	void buscarPatente(List<Moto>motos, String codigo);
	void guardarPatente(List<Moto>motos, Moto moto);

}
