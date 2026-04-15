package ar.com.unpaz.inicio;

import ar.com.unpaz.repository.LecturaArchivo;

public class Main {
	
	public static void main(String[] args) {
		LecturaArchivo lectura = new LecturaArchivo();
		
		List<Libro> libro = lectura.lectura();
		
		for (Libro : libro : libros) {
			System.out.println(libro);
		}
	}

}
