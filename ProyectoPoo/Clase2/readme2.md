# Modelo de Persona — Clase 2 (Programación Orientada a Objetos)

## Descripción General

El presente proyecto implementa una abstracción básica del concepto de Persona utilizando el paradigma de Programación Orientada a Objetos en Java. El objetivo principal es introducir los fundamentos del modelado de entidades, aplicando encapsulamiento, uso de constructores y métodos de acceso.

La solución representa una primera aproximación al diseño de clases, enfocándose en la correcta definición de atributos y comportamientos asociados a una entidad del mundo real.

## Estructura del Proyecto

El proyecto se organiza bajo el paquete `ar.com.unpaz.model`, donde se define la clase principal del dominio. Esta organización permite mantener una estructura ordenada desde etapas tempranas del desarrollo, facilitando la escalabilidad hacia sistemas más complejos.

## Definición de la Clase Persona

La clase Persona modela una entidad con atributos esenciales como nombre, edad, documento y dirección. Estos atributos se declaran como privados, respetando el principio de encapsulamiento, lo que impide el acceso directo desde otras clases y obliga a utilizar métodos de acceso controlado.

Se implementa un constructor parametrizado que permite inicializar los atributos al momento de crear el objeto. Este mecanismo garantiza que cada instancia de Persona sea creada con un estado definido. Además, se incluye un constructor vacío que brinda flexibilidad para escenarios donde la inicialización se realiza de forma posterior mediante métodos setters.

## Encapsulamiento y Acceso a Datos

El acceso a los atributos se realiza a través de métodos getters y setters. Este enfoque permite controlar la lectura y modificación de los datos, y sienta las bases para futuras validaciones o lógica adicional sin alterar la interfaz pública de la clase.

El encapsulamiento es un pilar fundamental en el diseño orientado a objetos, ya que protege el estado interno del objeto y promueve un bajo acoplamiento entre componentes.

## Comportamiento de la Clase

La clase incluye un método denominado `mostrarDatos`, cuya responsabilidad es exponer el estado del objeto a través de la salida estándar. Este método permite verificar el contenido de la instancia durante la ejecución del programa, siendo útil en etapas iniciales de desarrollo y pruebas.

Si bien este tipo de salida es adecuado para fines educativos, en sistemas más avanzados se recomienda desacoplar la lógica de presentación del modelo de datos.

## Flujo de Ejecución

La interacción con la clase Persona se realiza desde una clase principal ubicada en otro paquete, encargada de instanciar objetos y ejecutar métodos. Este punto de entrada permite validar el comportamiento del modelo, demostrando la creación de instancias y la utilización de sus métodos públicos.

## Consideraciones Técnicas

El diseño propuesto responde a los principios básicos de la programación orientada a objetos. Se observa una correcta aplicación del encapsulamiento, junto con una estructura clara y comprensible.

La utilización de constructores múltiples aporta flexibilidad en la creación de objetos, mientras que los métodos de acceso permiten mantener el control sobre los atributos internos.

## Evolución del Modelo

Este modelo constituye la base para futuras extensiones, donde se podrán incorporar conceptos más avanzados como herencia, polimorfismo y manejo de colecciones. La clase Persona puede ser reutilizada como superclase en jerarquías más complejas, permitiendo construir modelos más ricos sin redundancia de código.

## Conclusión

El proyecto cumple con el objetivo de introducir los conceptos fundamentales de la programación orientada a objetos mediante la implementación de una entidad simple pero representativa. La estructura y las decisiones de diseño adoptadas sientan una base sólida para avanzar hacia niveles más complejos en el desarrollo de sistemas.