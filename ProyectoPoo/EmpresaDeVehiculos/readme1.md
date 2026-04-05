# Ejercicio: Polimorfismo y Clases Abstractas

## Enunciado
Una empresa de transporte necesita desarrollar un sistema para gestionar distintos tipos de vehiculos. Actualmente, la empresa cuenta con los siguientes vehiculos:
* Autos
* Camiones
* Motos

### Especificaciones Generales
Todos los vehiculos comparten ciertas caracteristicas:
* Patente
* Marca
* Cantidad de combustible (en litros)

Ademas, todos los vehiculos pueden realizar la accion de **avanzar** una cierta cantidad de kilometros, pero no todos consumen combustible de la misma forma:
* **Auto**: consume 1 litro cada 10 km
* **Camion**: consume 1 litro cada 4 km
* **Moto**: consume 1 litro cada 20 km

## Objetivos del Proyecto
Se desea modelar esta situacion aplicando los pilares de la Programacion Orientada a Objetos:
1. **Herencia**
2. **Clases abstractas**
3. **Polimorfismo**

## Tareas a Realizar

### 1. Clase Abstracta Vehiculo
Crear una clase abstracta `Vehiculo` que contenga:
* Atributos comunes (patente, marca, combustible).
* Constructor para inicializar los atributos.
* Metodos getters.
* Un metodo abstracto: `public abstract void avanzar(int km);`

### 2. Clases Hijas
Crear las siguientes clases que hereden de `Vehiculo`:
* `Auto`
* `Camion`
* `Moto`

### 3. Implementacion de Metodos
Implementar en cada clase el metodo `avanzar(int km)` siguiendo estas reglas:
* Debe descontar el combustible segun el consumo correspondiente a su tipo.
* Si no alcanza el combustible para realizar el trayecto completo, el vehiculo no debe avanzar y debe informar la situacion por pantalla.

### 4. Clase Principal (Main)
En una clase `Main`, realizar lo siguiente:
* Crear al menos un objeto de cada tipo de vehiculo.
* Guardarlos en una coleccion (Array o List) de tipo `Vehiculo`.
* Recorrer la coleccion y hacer que todos los vehiculos avancen la misma cantidad de kilometros.
* Mostrar por pantalla para cada vehiculo:
    * Tipo de vehiculo.
    * Patente.
    * Combustible restante.

## Requisitos Importantes
* **No se puede instanciar la clase Vehiculo**: Al ser abstracta, solo sirve como molde para sus hijos.
* **Uso de Polimorfismo**: Se debe utilizar el tipo de la clase padre para recorrer los objetos y ejecutar el comportamiento especifico de cada uno.
* **Encapsulamiento**: Respetar el acceso a los atributos segun corresponda.
