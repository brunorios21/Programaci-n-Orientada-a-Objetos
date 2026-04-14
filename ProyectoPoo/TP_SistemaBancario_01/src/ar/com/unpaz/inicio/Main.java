package ar.com.unpaz.inicio;
//Importamos las clases de los otros paquetes para poder usarlas
import ar.com.unpaz.model.CuentaCorriente;
import ar.com.unpaz.servicio.CuentaService;
import ar.com.unpaz.servicio.CuentaServiceImpl;
import java.util.Scanner; //Import necesario para leer por teclado 

public class Main {
    public static void main(String[] args) {
        // Instanciamos el servicio (La lógica) y el Scanner (Entrada de datos)
        CuentaService service = new CuentaServiceImpl();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        // Loop del menú [cite: 131]
        do {
            System.out.println("\n===== MENÚ SISTEMA BANCARIO =====");
            System.out.println("1. Agregar cuenta");
            System.out.println("2. Buscar cuenta por número");
            System.out.println("3. Eliminar cuenta");
            System.out.println("4. Listar todas las cuentas");
            System.out.println("5. Depositar en una cuenta");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: // AGREGAR CUENTA
                    System.out.print("Nombre del titular: ");
                    String t = sc.next();
                    System.out.print("Número de cuenta: ");
                    int n = sc.nextInt();
                    System.out.print("Saldo inicial: ");
                    double s = sc.nextDouble();
                    System.out.print("Límite de descubierto: ");
                    double d = sc.nextDouble();
                    
                    service.agregarCuenta(new CuentaCorriente(t, n, s, d));
                    System.out.println("¡Cuenta creada con éxito!");
                    break;

                case 2: // BUSCAR CUENTA
                    System.out.print("Ingrese número de cuenta a buscar: ");
                    int nroBusca = sc.nextInt();
                    CuentaCorriente buscada = service.buscarCuenta(nroBusca);
                    if (buscada != null) {
                        System.out.println("Resultado: " + buscada.toString());
                    } else {
                        System.out.println("La cuenta no existe.");
                    }
                    break;

                case 3: // ELIMINAR CUENTA
                    System.out.print("Ingrese número de cuenta a eliminar: ");
                    int nroElimina = sc.nextInt();
                    service.eliminarCuenta(nroElimina);
                    break;

                case 4: // LISTAR CUENTAS
                    System.out.println("--- Lista de Cuentas ---");
                    if (service.obtenerCuentas().isEmpty()) {
                        System.out.println("No hay cuentas cargadas.");
                    } else {
                        // Recorremos la lista obtenida del service [cite: 86]
                        for (CuentaCorriente cc : service.obtenerCuentas()) {
                            System.out.println(cc);
                        }
                    }
                    break;

                case 5: // DEPOSITAR
                    System.out.print("Número de cuenta para depósito: ");
                    int nroDep = sc.nextInt();
                    CuentaCorriente cDep = service.buscarCuenta(nroDep);
                    if (cDep != null) {
                        System.out.print("Monto a depositar: $");
                        double montoDep = sc.nextDouble();
                        cDep.depositar(montoDep); // Llamamos al método de comportamiento [cite: 66]
                    } else {
                        System.out.println("Error: Cuenta no encontrada.");
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 6); // Mientras no elija 6, el programa sigue [cite: 129]
        
        sc.close(); // Cerramos el scanner al terminar
    }
}