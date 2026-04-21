package ar.com.unpaz.service;
 import java.util.List;
 import ar.com.unpaz.model.Producto;
public interface GestionStock {
	
	void listarProductos(List<Producto>lista);
	void buscarPorId(List<Producto>lista, String id);
	void actualizarPrecio(List<Producto>lista, String id, double nuevoPrecio);
	void venderProducto(List<Producto>lista, String id, int cantidadVenta);
		
	}