# Sistema de Gestión de Alumnos — Clase 3 (POO)

## Descripción General

El presente proyecto implementa un modelo básico de gestión de alumnos aplicando conceptos fundamentales de Programación Orientada a Objetos en Java. La solución propone una estructura desacoplada donde se diferencian claramente las responsabilidades entre las entidades del dominio, la lógica de negocio y el punto de entrada de la aplicación.

El objetivo principal es demostrar la construcción de objetos con validación interna, el uso de colecciones dinámicas para la persistencia en memoria y la gestión de errores mediante excepciones personalizadas.

---

## Arquitectura del Sistema

La organización del proyecto responde a una separación por paquetes que favorece la mantenibilidad y escalabilidad del código.

- `ar.com.unpaz.model`: contiene las clases del dominio y la lógica asociada.
- `ar.com.unpaz.principal`: contiene la clase ejecutora del sistema.

Esta división permite desacoplar la lógica de negocio del flujo de ejecución, facilitando futuras extensiones como interfaces gráficas, APIs o persistencia en base de datos.

---

## Modelo de Dominio

### Alumno

La clase `Alumno` representa la entidad central del sistema. Define atributos básicos como nombre, edad y legajo, encapsulados mediante modificadores de acceso privados. La creación de instancias está controlada a través de un constructor que valida las reglas de negocio:

- El nombre no puede ser nulo ni vacío.
- La edad debe ser mayor a cero.
- El legajo debe ser un número positivo.

Este enfoque garantiza la integridad del objeto desde su origen, evitando estados inválidos en memoria.

Además, se proveen métodos de acceso (getters) y una operación de presentación (`mostrarDatos`) orientada a la salida por consola.

---

### Curso

La clase `Curso` actúa como agregador de objetos `Alumno`. Internamente utiliza una estructura dinámica (`ArrayList`) para almacenar los alumnos registrados.

Se implementa una lógica de control que evita:

- La inserción de referencias nulas.
- La duplicación de alumnos en función del legajo.

Para esto, se define un método auxiliar que verifica la existencia previa de un legajo dentro de la colección. Esta validación refuerza la unicidad de los registros, simulando una restricción típica de sistemas reales.

El método `mostrarAlumnos` permite recorrer la colección y delegar la visualización a cada instancia de `Alumno`.

---

### AlumnoInvalidoException

Se define una excepción personalizada que extiende de `RuntimeException`. Su propósito es encapsular errores de validación asociados al dominio, permitiendo centralizar el manejo de inconsistencias.

Al tratarse de una excepción no verificada, no obliga a su declaración explícita, pero puede ser capturada en niveles superiores para controlar el flujo de ejecución.

---

## Flujo de Ejecución

La clase `Main`, ubicada en el paquete `principal`, actúa como punto de entrada del sistema. Su responsabilidad es orquestar la interacción entre las clases del modelo.

El flujo implementado consiste en:

- Instanciar un curso.
- Crear alumnos válidos e incorporarlos al sistema.
- Intentar crear un alumno inválido para provocar una excepción.
- Capturar y mostrar el error sin interrumpir completamente la ejecución.
- Listar los alumnos correctamente cargados.

Este esquema permite evidenciar el comportamiento del sistema frente a datos válidos e inválidos, así como el uso efectivo del manejo de excepciones.

---

## Consideraciones Técnicas

El diseño responde a principios básicos de encapsulamiento y cohesión. Cada clase concentra una responsabilidad específica, evitando dependencias innecesarias.

La validación en el constructor de `Alumno` es una decisión clave, ya que asegura que ningún objeto inválido pueda ser utilizado dentro del sistema. A su vez, el uso de una colección dinámica permite flexibilidad en la gestión de datos sin necesidad de estructuras rígidas.

La separación en paquetes prepara el proyecto para una evolución hacia arquitecturas más complejas, donde podrían incorporarse capas adicionales como servicios o repositorios.

---

## Posibles Extensiones

El sistema puede evolucionar incorporando persistencia en archivos o bases de datos, reemplazando la lista en memoria. También es posible agregar interfaces de usuario o servicios web para interactuar con el modelo.

Otra mejora relevante sería la incorporación de interfaces o abstracciones que permitan desacoplar aún más la lógica del almacenamiento de datos.

---

## Conclusión

El proyecto constituye una implementación sólida de los conceptos iniciales de POO, integrando validaciones, manejo de errores y organización modular. Su estructura permite comprender cómo construir sistemas simples pero correctamente diseñados, sentando las bases para desarrollos más complejos en etapas posteriores.
