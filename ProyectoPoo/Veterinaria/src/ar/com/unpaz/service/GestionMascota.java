package ar.com.unpaz.service;

import java.util.List;
import ar.com.unpaz.model.Mascota;

public interface GestionMascota {
    void ListarNombreDelAnimal(List<Mascota> mascotas);
    void buscarNombre(List<Mascota> mascotas, String codigo);
    void guardarNombre(List<Mascota> mascotas, Mascota mascota);
}