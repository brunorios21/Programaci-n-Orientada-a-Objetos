# Proyecto de Gestión Bancaria (POO) - UNPAZ

Este repositorio contiene el desarrollo de un sistema de gestión de clientes y cuentas bancarias realizado en **Java** con el IDE **Eclipse**, aplicando los pilares fundamentales de la **Programación Orientada a Objetos (POO)**.

## Información Académica
* **Institución:** Universidad Nacional de José C. Paz (UNPAZ)
* **Profesor:** Javier Molina
* **Año:** 2026

---

## Entorno de Desarrollo y Tecnologías

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Eclipse IDE](https://img.shields.io/badge/Eclipse%20IDE-2C2255?style=for-the-badge&logo=eclipseide&logoColor=white)](https://www.eclipse.org/ide/)
[![POO](https://img.shields.io/badge/Paradigma-POO-red?style=for-the-badge)](https://docs.oracle.com/javase/tutorial/java/concepts/index.html)

---

## Conceptos de POO Aplicados

En este desarrollo se implementan los siguientes fundamentos técnicos:

* **Encapsulamiento:** Los atributos de las clases (`Cliente`, `Cuenta`, `Contacto`) se definen como `private`. El acceso y modificación de los datos se realiza exclusivamente a través de métodos públicos `get` y `set`, garantizando la integridad del estado de los objetos.
* **Asociación y Composición:** * Un **Cliente** tiene un **Contacto** (Relación 1 a 1).
    * Un **Cliente** posee una lista de **Cuentas** (Relación 1 a muchos).
* **Relación Bidireccional:** La lógica implementada permite que un objeto `Cliente` conozca sus cuentas asociadas y que cada objeto `Cuenta` mantenga una referencia directa a su titular.
* **Modularización:** El código está organizado en paquetes (`ar.com.unpaz.main` y `ar.com.unpaz.principal`) para separar la lógica de negocio de la clase orquestadora.

---

## Estructura del Proyecto

El sistema se divide en las siguientes entidades:

1. **Cliente:** Clase principal que almacena datos personales y gestiona una colección de cuentas mediante un `ArrayList`.
2. **Cuenta:** Representa la entidad bancaria con número de cuenta, saldo y una referencia al titular.
3. **Contacto:** Clase de soporte que almacena información de localización y comunicación (email, dirección).
4. **Main:** Clase donde se instancian los objetos y se ejecutan las pruebas de integración del sistema.

---

## Ejemplo de Implementación

Lógica de vinculación bidireccional entre objetos:

```java
// Ejemplo de vinculación de cuenta a un cliente
Cliente cliente = new Cliente();
Cuenta cuenta = new Cuenta();

// El cliente guarda la cuenta en su lista y la cuenta establece su titular
cliente.agregarCuenta(cuenta);
