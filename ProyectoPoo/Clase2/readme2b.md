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

## Aplicación Práctica: Sistema Bancario

En el ejemplo del sistema bancario, se identificaron atributos y métodos comunes entre diferentes tipos de cuentas. Inicialmente, había duplicación de código que se resolvió mediante herencia.

### Problema Inicial
- Código duplicado en clases `CuentaCorriente` y `CuentaAhorros`
- Atributos y métodos repetidos
- Dificultad de mantenimiento

### Solución con Herencia
- Creación de clase base `Cuenta` con funcionalidad común
- Especialización mediante subclases
- Reutilización de código existente

### Implementación Completa

```java
import java.util.ArrayList;

public class Banco {
    private ArrayList<Cuenta> cuentas;

    public Banco() {
        this.cuentas = new ArrayList<>();
    }

    public void agregarCuenta(Cuenta cuenta) {
        this.cuentas.add(cuenta);
    }

    public void mostrarInformacionCuentas() {
        for (Cuenta cuenta : this.cuentas) {
            System.out.println("Cuenta: " + cuenta.getNumeroCuenta());
            System.out.println("Titular: " + cuenta.getTitular());
            System.out.println("Saldo: " + cuenta.getSaldo());

            // Polimorfismo: diferentes comportamientos según el tipo
            if (cuenta instanceof CuentaCorriente) {
                CuentaCorriente cc = (CuentaCorriente) cuenta;
                System.out.println("Límite de sobregiro: " + cc.getLimiteSobregiro());
            } else if (cuenta instanceof CuentaAhorros) {
                CuentaAhorros ca = (CuentaAhorros) cuenta;
                System.out.println("Tasa de interés: " + ca.getTasaInteres() + "%");
            }
            System.out.println("---");
        }
    }
}
```

## Conclusión

Esta sesión consolidó los conceptos avanzados de POO, demostrando cómo métodos, listas, encapsulamiento y herencia contribuyen a sistemas más robustos y mantenibles. La aplicación práctica en el sistema bancario ilustra la importancia de identificar patrones y refactorizar código para mejorar la calidad del software.

Los principios aprendidos son fundamentales para el desarrollo profesional de aplicaciones orientadas a objetos.
