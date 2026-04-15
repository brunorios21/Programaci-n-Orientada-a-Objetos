package ar.com.unpaz.serviceIMPL;

import ar.com.unpaz.service.GestionLibroService;

public class GestionLibroIMPL implements GestionLibroService {

	@Override
	public void listarLibros() {
		LecturaArchivo lectura = new LecturaArchivo();
		List <Libro> libro = lectura.lectura();
		for(Libro libro2 : libro) {
			System.out.println(libro2);
		
		}

	@Override
	public void buscarLibro(String codigo) {
		LecturaArchivo lectura = new LecturaArchivo();
		List <Libro> libro = lectura.lectura();
		for(Libro lb : libro) {
			if (lb.getCodigo() == codigo) {
				System.out.println(lb);
			}
		
		}
		
		System.out.println("No lo encontramos!!!!");
	
	}

}
