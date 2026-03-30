
# Programación Orientada a Objetos: Métodos, Listas, Encapsulamiento y Herencia

## Tabla de Contenidos
- [Introducción](#introducción)
- [Métodos](#métodos)
- [Listas (ArrayList)](#listas-arraylist)
- [Encapsulamiento](#encapsulamiento)
- [Herencia](#herencia)
- [Aplicación Práctica: Sistema Bancario](#aplicación-práctica-sistema-bancario)
- [Conclusión](#conclusión)

## Introducción

En esta sesión avanzada de Programación Orientada a Objetos (POO), se profundizaron los conceptos fundamentales para construir sistemas más organizados y reutilizables. Se exploraron métodos, listas, encapsulamiento y herencia como herramientas clave para el desarrollo de software robusto.

## Métodos

Los métodos definen el comportamiento de un objeto, permitiendo que realicen acciones específicas. Pueden recibir parámetros y modificar el estado interno del objeto.

### Características Principales
- **Definición de comportamiento**: Los métodos encapsulan las acciones que un objeto puede realizar
- **Parámetros**: Pueden recibir valores para procesar
- **Modificación de estado**: Alteran los atributos del objeto según sea necesario

### Diferencia con Atributos
- **Atributos**: Representan los datos o estado del objeto
- **Métodos**: Representan las acciones o comportamientos

### Ejemplo Práctico

```java
public class CuentaBancaria {
    private double saldo;

    // Método que define comportamiento
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        }
    }

    // Método con parámetros y modificación de estado
    public void retirar(double monto) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
        }
    }
}
```

## Listas (ArrayList)

Las listas permiten almacenar múltiples objetos de manera dinámica, facilitando el manejo de colecciones de datos.

### Características Principales
- **Almacenamiento dinámico**: El tamaño puede cambiar durante la ejecución
- **Tipo genérico**: Pueden contener objetos de cualquier tipo
- **Métodos principales**:
  - `add()`: Agrega elementos a la lista
  - `get()`: Accede a elementos por índice
  - `size()`: Retorna la cantidad de elementos

### Operaciones Comunes

```java
import java.util.ArrayList;

public class GestorCuentas {
    private ArrayList<CuentaBancaria> cuentas;

    public GestorCuentas() {
        this.cuentas = new ArrayList<>();
    }

    // Agregar cuenta
    public void agregarCuenta(CuentaBancaria cuenta) {
        this.cuentas.add(cuenta);
    }

    // Acceder a cuenta
    public CuentaBancaria obtenerCuenta(int indice) {
        if (indice >= 0 && indice < this.cuentas.size()) {
            return this.cuentas.get(indice);
        }
        return null;
    }

    // Obtener cantidad de cuentas
    public int cantidadCuentas() {
        return this.cuentas.size();
    }

    // Recorrer lista y ejecutar métodos
    public void mostrarSaldos() {
        for (CuentaBancaria cuenta : this.cuentas) {
            System.out.println("Saldo: " + cuenta.getSaldo());
        }
    }
}
```

## Encapsulamiento

El encapsulamiento protege los datos de un objeto, controlando el acceso a sus atributos mediante métodos específicos.

### Principios Fundamentales
- **Atributos privados**: Uso de modificadores de acceso `private`
- **Métodos de acceso**: Getters y setters para manipular atributos
- **Protección de datos**: Evita modificaciones incorrectas o no autorizadas

### Beneficios
- **Integridad de datos**: Controla cómo se modifican los atributos
- **Mantenimiento**: Facilita cambios internos sin afectar el exterior
- **Seguridad**: Oculta detalles de implementación

### Ejemplo de Encapsulamiento

```java
public class CuentaBancaria {
    // Atributos privados
    private String numeroCuenta;
    private double saldo;
    private String titular;

    // Constructor
    public CuentaBancaria(String numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Getters
    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    // Setters con validación
    public void setTitular(String titular) {
        if (titular != null && !titular.trim().isEmpty()) {
            this.titular = titular;
        }
    }

    // Métodos de negocio
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
            return true;
        }
        return false;
    }
}
```

## Herencia

La herencia permite que una clase herede atributos y métodos de otra, promoviendo la reutilización de código.

### Conceptos Clave
- **Clase padre/superclase**: Clase de la que se hereda
- **Clase hija/subclase**: Clase que hereda
- **Palabra clave**: `extends`
- **Herencia simple**: Una clase solo puede heredar de una superclase

### Beneficios
- **Reutilización de código**: Evita duplicación
- **Jerarquía de clases**: Organiza el sistema de manera lógica
- **Polimorfismo**: Permite tratar objetos de subclases como de la superclase

### Ejemplo de Herencia

#### Clase Padre (Cuenta)

```java
// Clase padre
public class Cuenta {
    protected String numeroCuenta;
    protected double saldo;
    protected String titular;

    public Cuenta(String numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Getters y setters comunes
    public String getNumeroCuenta() { return numeroCuenta; }
    public double getSaldo() { return saldo; }
    public String getTitular() { return titular; }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
            return true;
        }
        return false;
    }
}
```

#### Clase Hija - Cuenta Corriente

```java
// Clase hija - Cuenta Corriente
public class CuentaCorriente extends Cuenta {
    private double limiteSobregiro;

    public CuentaCorriente(String numeroCuenta, String titular, double limiteSobregiro) {
        super(numeroCuenta, titular);
        this.limiteSobregiro = limiteSobregiro;
    }

    // Método sobrescrito (override)
    @Override
    public boolean retirar(double monto) {
        if (monto > 0 && monto <= (this.saldo + this.limiteSobregiro)) {
            this.saldo -= monto;
            return true;
        }
        return false;
    }

    // Método específico de la subclase
    public double getLimiteSobregiro() {
        return this.limiteSobregiro;
    }
}
```

#### Clase Hija - Cuenta de Ahorros

```java
// Clase hija - Cuenta de Ahorros
public class CuentaAhorros extends Cuenta {
    private double tasaInteres;

    public CuentaAhorros(String numeroCuenta, String titular, double tasaInteres) {
        super(numeroCuenta, titular);
        this.tasaInteres = tasaInteres;
    }

    // Método específico de la subclase
    public void aplicarInteres() {
        double interes = this.saldo * (this.tasaInteres / 100);
        this.saldo += interes;
    }

    public double getTasaInteres() {
        return this.tasaInteres;
    }
}
```

## Ejercicio Práctico: Lectura de Archivo y Gestión de Cuentas

Este ejercicio demuestra la aplicación práctica de los conceptos de POO mediante la lectura de un archivo de texto que contiene información de cuentas corrientes, la creación de objetos y el manejo de colecciones.

### Estructura del Proyecto
- **Package `ar.unpaz.model`**: Contiene la clase principal de ejecución
- **Package `ar.unpaz.repositorio`**: Contiene las clases de dominio y acceso a datos

### Archivo de Datos
El archivo `cuenta_corrientes.txt` debe tener el formato:
```
Titular;NúmeroCuenta;Saldo;Descubierto
Juan Pérez;CC001;1500.50;500.00
María García;CC002;2500.75;1000.00
```

### Implementación

#### Clase Base: Cuenta

```java
package ar.unpaz.repositorio;

public class Cuenta {
    // Atributos protegidos para que las clases hijas los vean
    protected String titular;
    protected String numeroCuenta;
    protected double saldo;

    // Constructor vacío (necesario para el super() de la hija)
    public Cuenta() {
    }

    // Constructor con parámetros
    public Cuenta(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // Getters y setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}
```

#### Clase Derivada: CuentaCorriente

```java
package ar.unpaz.repositorio;

public class CuentaCorriente extends Cuenta {
    
    private double descubierto;

    // Constructor vacío
    public CuentaCorriente() {
        super(); 
    }

    // Constructor con parámetros
    public CuentaCorriente(String titular, String numeroCuenta, double saldo, double descubierto) {
        super(titular, numeroCuenta, saldo); // Envía los datos a la clase Cuenta
        this.descubierto = descubierto;
    }

    public double getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(double descubierto) {
        this.descubierto = descubierto;
    }

    public void extraer(double monto) {
        if (monto <= (getSaldo() + descubierto)) {
            setSaldo(getSaldo() - monto);
        } else {
            System.out.println("Error: Fondos insuficientes.");
        }
    }
}
```

#### Clase de Acceso a Datos: LecturaArchivo

```java
package ar.unpaz.repositorio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import ar.unpaz.repositorio.CuentaCorriente;

public class LecturaArchivo {

    // El método ahora devuelve una lista de objetos CuentaCorriente
    public List<CuentaCorriente> leerArchivo() {
        // 1. Inicializar la lista de objetos
        List<CuentaCorriente> cuentasCorrientes = new ArrayList<CuentaCorriente>();
        
        // 2. Apuntar al archivo físico
        File sFile = new File("cuenta_corrientes.txt");
        
        try {
            FileReader sFileReader = new FileReader(sFile);
            BufferedReader buffer = new BufferedReader(sFileReader);
            String linea = "";
            
            // 3. Ciclo para leer cada renglón
            while ((linea = buffer.readLine()) != null) {
                // Separar los datos por punto y coma
                String[] array = linea.split(";");
                
                // Crear instancia de CuentaCorriente y cargar sus datos
                CuentaCorriente cc = new CuentaCorriente();
                cc.setTitular(array[0]);
                cc.setNumeroCuenta(array[1]);
                
                // Convertir Strings a Double para el saldo y el descubierto
                cc.setSaldo(Double.parseDouble(array[2]));
                cc.setDescubierto(Double.parseDouble(array[3]));
                
                // Guardar el objeto en la lista
                cuentasCorrientes.add(cc);
            }
            buffer.close(); // Cerrar el flujo de datos
        } catch (Exception e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
        
        return cuentasCorrientes; // Retornar la lista cargada
    }
}
```

#### Clase Principal: Inicio

```java
package ar.unpaz.model;

import ar.unpaz.repositorio.LecturaArchivo;
import ar.unpaz.repositorio.CuentaCorriente; 
import java.util.List;

public class inicio {
    public static void main(String[] args) {
        // 1. Instanciar el lector del repositorio
        LecturaArchivo lecturaDeArchivo = new LecturaArchivo();
        
        // 2. RECUPERAR LA LISTA 
        List<CuentaCorriente> listadoDeCuentas = lecturaDeArchivo.leerArchivo();
        
        System.out.println("--- Contenido del archivo ---");
        
        // 3. Recorrer la lista de objetos 
        for (CuentaCorriente s : listadoDeCuentas) {
            // Usamos el getter para mostrar el nombre del titular
            System.out.println("Titular: " + s.getTitular());
        }
    }
}
```

### Conceptos Aplicados en el Ejercicio

- **Herencia**: `CuentaCorriente` hereda de `Cuenta`
- **Encapsulamiento**: Uso de getters y setters para acceder a atributos
- **Listas**: `ArrayList<CuentaCorriente>` para almacenar objetos
- **Lectura de Archivos**: Procesamiento de datos desde archivo de texto
- **Instanciación Dinámica**: Creación de objetos desde datos leídos
- **Manejo de Excepciones**: Try-catch para errores de lectura

### Salida Esperada
```
--- Contenido del archivo ---
Titular: Juan Pérez
Titular: María García
```

## Conclusión

Esta sesión consolidó los conceptos avanzados de POO, demostrando cómo métodos, listas, encapsulamiento y herencia contribuyen a sistemas más robustos y mantenibles. La aplicación práctica en el sistema bancario ilustra la importancia de identificar patrones y refactorizar código para mejorar la calidad del software.

Los principios aprendidos son fundamentales para el desarrollo profesional de aplicaciones orientadas a objetos.
