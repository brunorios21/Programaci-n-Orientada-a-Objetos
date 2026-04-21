package ar.com.unpaz.serviceIMPL;
import java.util.List;

import ar.com.unpaz.model.Producto;
import ar.com.unpaz.service.GestionStock;
public class GestionServiceIMPL implements GestionStock{

	@Override
	public void listarProductos(List<Producto> lista) {
		for(Producto producto : lista) {
			System.out.println(producto.getId());
		}
		
	}

	@Override
	public void buscarPorId(List<Producto> lista, String id) {
		for(Producto m : lista) {
			if(m.getId() !=null && m.getId().equalsIgnoreCase(id)) {
				
			
			System.out.println(m);
			return;
			}
		}
		System.out.println("No se encontro el producto");
	}

	@Override
	public void actualizarPrecio(List<Producto> lista, String id, double nuevoPrecio) {
		for(Producto ms : lista) {
			if(ms.getId()  != null && ms.getId().equalsIgnoreCase(id)){
				ms.setPrecio(nuevoPrecio);
				System.out.println("PrecioActualizado");
				return;
			}
		}
		
	}

	@Override
	public void venderProducto(List<Producto> lista, String idBuscado, int cantidadVenta) {
	    boolean encontrado = false;
	    
	    for (Producto p : lista) {
	        // 1. Buscamos el producto por ID
	        if (p.getId() != null && p.getId().equalsIgnoreCase(idBuscado)) {
	            encontrado = true;
	            
	            // 2. Validamos si hay stock suficiente
	            if (p.getCantidad() >= cantidadVenta) {
	                // 3. Restamos el stock
	                int stockActualizado = p.getCantidad() - cantidadVenta;
	                p.setCantidad(stockActualizado);
	                
	                System.out.println("Venta realizada con éxito.");
	                System.out.println("Nuevo stock de " + p.getDescripcion() + ": " + p.getCantidad());
	            } else {
	                // Si no hay suficiente
	                System.out.println("Error: Stock insuficiente. Solo quedan " + p.getCantidad() + " unidades.");
	            }
	            break; // Cortamos el bucle porque ya lo encontramos
	        }
	    }
	    
	    if (!encontrado) {
	        System.out.println("El producto con ID " + idBuscado + " no existe.");
	    }
	}
	
}
