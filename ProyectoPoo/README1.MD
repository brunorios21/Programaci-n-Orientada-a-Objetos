# Proyecto de Gestión Bancaria (POO) - UNPAZ

Este proyecto es un sistema básico de gestión de clientes y cuentas bancarias desarrollado en **Java**, aplicando los pilares fundamentales de la **Programación Orientada a Objetos (POO)**.

##  Conceptos de POO Aplicados

En este desarrollo implementamos:

* **Encapsulamiento:** Los atributos de las clases (`Cliente`, `Cuenta`, `Contacto`) son `private`. El acceso a los datos se realiza exclusivamente a través de métodos públicos `get` y `set`.
* **Asociación y Composición:** * Un **Cliente** tiene un **Contacto** (Relación 1 a 1).
    * Un **Cliente** posee una lista de **Cuentas** (Relación 1 a muchos).
* **Relación Bidireccional:** La lógica permite que un cliente conozca sus cuentas y que cada cuenta sepa quién es su titular.
* **Modularización:** El código está organizado en paquetes (`ar.com.unpaz.main` y `ar.com.unpaz.principal`) para separar la lógica de negocio de la ejecución.

##  Estructura del Proyecto

El sistema se divide en las siguientes entidades:

1.  **Cliente:** Clase principal que almacena datos personales y gestiona una colección de cuentas mediante un `ArrayList`.
2.  **Cuenta:** Representa la entidad bancaria con número de cuenta, saldo y una referencia al titular.
3.  **Contacto:** Almacena información de localización y comunicación (email, dirección).
4.  **Main:** Clase orquestadora donde se crean los objetos y se ejecutan las pruebas de integración.

##  Ejemplo de Uso

```java
// Ejemplo de cómo vinculamos una cuenta a un cliente
Cliente cliente = new Cliente();
Cuenta cuenta = new Cuenta();

cliente.agregarCuenta(cuenta); // El cliente guarda la cuenta y la cuenta guarda al titular