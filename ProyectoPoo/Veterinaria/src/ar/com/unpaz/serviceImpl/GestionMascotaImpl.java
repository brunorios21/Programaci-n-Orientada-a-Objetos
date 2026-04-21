package ar.com.unpaz.serviceImpl;

import java.util.List;
import ar.com.unpaz.model.Mascota;
import ar.com.unpaz.service.GestionMascota;
import ar.com.unpaz.repository.LecturaArchivo;

public class GestionMascotaImpl implements GestionMascota {
	
	@Override
	public void ListarNombreDelAnimal(List<Mascota> mascotas) {
		for (Mascota mascota : mascotas) {
			System.out.println(mascota.getNombre());
		}
		// TODO Auto-generated method stub
		
	}
	@Override
	public void buscarNombre(List<Mascota> lista, String nombreBuscado) {
	    for (Mascota m : lista) {
	        // Agregamos: m.getNombre() != null
	        if (m.getNombre() != null && m.getNombre().equalsIgnoreCase(nombreBuscado)) {
	            System.out.println(m);
	            return;
	        }
	    }
	    System.out.println("No se encontró la mascota.");
	
	}
	@Override
	public void guardarNombre(List<Mascota> mascotas, Mascota mascota) {
	    for (Mascota ms : mascotas) {
	        if (ms.getNombre().equalsIgnoreCase(mascota.getNombre())) {
	            System.out.println("La mascota ya existe");
	            return;
	        }
	    }
	    // Si llegó acá es porque no existe, entonces la agregamos
	    mascotas.add(mascota);
	    System.out.println("Mascota guardada en la lista");
	    
	    // Tip: Acá podrías llamar a una función de la clase Repositorio 
	    // para que también se guarde en el archivo .txt
	
		

		// TODO Auto-generated method stub
		
	}	
	
	
	

}
