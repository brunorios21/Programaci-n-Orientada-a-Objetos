package ar.com.unpaz.inicio;

import ar.com.unpaz.model.CuentaCorriente;
import ar.com.unpaz.servicio.CuentaServiceImpl;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instanciamos el servicio y el Scanner
        CuentaServiceImpl service = new CuentaServiceImpl();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n========== MENÚ SISTEMA BANCARIO ==========");
            System.out.println("1. Agregar cuenta");
            System.out.println("2. Buscar cuenta por número");
            System.out.println("3. Eliminar cuenta por número");
            System.out.println("4. Listar todas las cuentas");
            System.out.println("5. Depositar en una cuenta");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer después de leer un número

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Nueva Cuenta Corriente ---");
                    System.out.print("Nombre del titular: ");
                    String titular = sc.nextLine();
                    System.out.print("Número de cuenta: ");
                    int numero = sc.nextInt();
                    System.out.print("Saldo inicial: ");
                    double saldo = sc.nextDouble();
                    System.out.print("Monto de descubierto permitido: ");
                    double descubierto = sc.nextDouble();

                    CuentaCorriente nueva = new CuentaCorriente(titular, numero, saldo, descubierto);
                    service.agregarCuenta(nueva);
                    break;

                case 2:
                    System.out.print("\nIngrese el número de cuenta a buscar: ");
                    int numBusqueda = sc.nextInt();
                    CuentaCorriente encontrada = service.buscarCuenta(numBusqueda);
                    if (encontrada != null) {
                        System.out.println("Datos encontrados: " + encontrada.toString());
                    } else {
                        System.out.println("Error: La cuenta no existe.");
                    }
                    break;

                case 3:
                    System.out.print("\nIngrese el número de cuenta a eliminar: ");
                    int numEliminar = sc.nextInt();
                    if (service.eliminarCuenta(numEliminar)) {
                        System.out.println("Cuenta eliminada con éxito.");
                    } else {
                        System.out.println("No se pudo eliminar: la cuenta no existe.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Listado de Cuentas ---");
                    List<CuentaCorriente> lista = service.obtenerTodas();
                    if (lista.isEmpty()) {
                        System.out.println("No hay cuentas cargadas en el sistema.");
                    } else {
                        for (CuentaCorriente c : lista) {
                            System.out.println(c.toString());
                        }
                    }
                    break;

                case 5:
                    System.out.print("\nIngrese el número de cuenta para el depósito: ");
                    int numDep = sc.nextInt();
                    CuentaCorriente cDep = service.buscarCuenta(numDep);
                    if (cDep != null) {
                        System.out.print("Monto a depositar: ");
                        double monto = sc.nextDouble();
                        cDep.depositar(monto);
                    } else {
                        System.out.println("Cuenta no encontrada.");
                    }
                    break;

                case 6:
                    System.out.println("Cerrando el sistema... ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 6);

        sc.close();
    }
}