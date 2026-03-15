# Sistema de Gestion de Biblioteca

Este proyecto consiste en un ejercicio de **Programacion Orientada a Objetos (POO)** en Java que modela la relacion funcional entre un **Autor** y sus **Libros**. El objetivo principal es demostrar la navegabilidad entre objetos y el manejo de colecciones dinámicas.

## Estructura del Proyecto

El codigo fuente se divide en dos paquetes fundamentales para separar la logica de negocio de la ejecucion:

1. **ar.biblioteca.principal**: Contiene las clases de modelo (**Autor** y **Libro**). Aqui se define la estructura de los datos.
2. **ar.biblioteca.main**: Contiene la clase **Main**, que actua como el punto de entrada para ejecutar y testear el sistema.

## Explicacion de la Logica de Programacion

El sistema se basa en tres pilares de la programacion:

### 1. Encapsulamiento
Cada atributo (como `nombre`, `dni` o `editorial`) se define como **private**. La unica forma de interactuar con ellos es a traves de metodos **public** denominados **Getters** (para leer) y **Setters** (para escribir). Esto protege la integridad de los datos.

### 2. Relacion Uno a Muchos (1:N)
Un objeto de la clase **Autor** posee un atributo de tipo `List<Libro>`. Esto permite que un solo autor pueda estar vinculado a multiples instancias de libros simultaneamente.

### 3. Sincronizacion de Referencias (Bidireccionalidad)
Cuando se ejecuta el metodo `agregarLibro(Libro nuevoLibro)`, ocurren dos acciones internas:
* **Hacia adelante**: El libro se añade a la lista interna del autor.
* **Hacia atras**: Se utiliza la palabra reservada **this** para asignarle al libro el autor actual como su "titular". Esto permite que, teniendo solo un objeto Libro, podamos conocer todos los datos de su Autor.

## Guia de Implementacion

1. **Instanciacion**: Se crean los objetos en memoria utilizando el operador `new`.
2. **Carga de Datos**: Se utilizan los metodos **set** para dar identidad a los objetos.
3. **Vinculacion**: Se llama al metodo `agregarLibro` para establecer el vinculo logico.
4. **Navegacion**: Se accede a la informacion de un objeto a traves de otro (ejemplo: `libro.getTitular().getApellido()`).

## Requisitos del Entorno
* **Java Development Kit (JDK)** version 8 o superior.
* IDE de preferencia (**Eclipse**, **IntelliJ** o **VS Code**).