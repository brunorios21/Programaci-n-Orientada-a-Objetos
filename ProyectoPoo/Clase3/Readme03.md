## Preguntas sobre Interfaces y Clases Abstractas (tarea asignada por el profesor Javier Molina)
realizada 3/04/2026
 
## 1)¿Qué es una interfaz en programación orientada a objetos?
Es una especie de “plantilla” que define métodos que una clase debe implementar, pero sin decir cómo hacerlo. Solo establece qué se puede hacer, no cómo.
## 2)¿Qué es una clase abstracta?
Es una especie de “plantilla” que define métodos que una clase debe implementar, pero sin decir cómo hacerlo. Solo establece qué se puede hacer, no cómo.
## 3)¿Cuál es la principal diferencia entre una interfaz y una clase abstracta?
La interfaz solo define métodos (el qué), mientras que la clase abstracta puede tener implementación (el cómo) además de definir comportamiento común.
## 4)¿Se puede instanciar una clase abstracta? Justifique.
No, porque está pensada para ser una base. No tiene sentido crear un objeto incompleto que depende de otras clases para funcionar.
## 5)¿Una interfaz puede tener atributos? Explique.
Sí, pero en realidad son constantes (generalmente public static final). No pueden ser variables comunes que cambien de valor.
## 6)¿Una clase puede implementar más de una interfaz? ¿Y heredar de más de una clase abstracta?
Puede implementar varias interfaces sin problema. Pero no puede heredar de más de una clase (abstracta o no), porque Java no permite herencia múltiple de clases.
## 7)¿Qué significa que una interfaz sea un “contrato”?
Significa que cualquier clase que la implemente está obligada a definir todos los métodos que la interfaz declara. Es un compromiso.
## 8)¿Qué tipo de métodos puede tener una clase abstracta?
Puede tener métodos abstractos (sin código) y métodos concretos (con código ya implementado).
## 9)Explique en qué situación utilizaría una interfaz en lugar de una clase abstracta.
Cuando distintas clases no relacionadas entre sí necesitan compartir un mismo comportamiento. Por ejemplo, “imprimir”, “guardar”, “conectarse”, etc.

## Dé un ejemplo de un sistema donde sea conveniente usar una clase abstracta.
Un sistema de empleados: Empleado como clase abstracta, y después EmpleadoTiempoCompleto o EmpleadoPorHora. Todos comparten datos y comportamientos comunes.
## 10)¿Por qué las interfaces favorecen el desacoplamiento del sistema?
Porque permiten programar contra una idea (la interfaz) y no contra una implementación concreta. Eso hace que puedas cambiar la implementación sin afectar el resto del sistema.
## Analice el siguiente caso:
Un sistema tiene clases: Perro, Gato, Auto.
Todas pueden “emitir sonido”.
Usaría una interfaz. Porque son objetos totalmente distintos entre sí, no tiene sentido que hereden de una misma clase, pero sí que compartan la capacidad de “emitir sonido”.
## 11)¿Usaría interfaz o clase abstracta? Justifique.
Usaría una interfaz porque las clases Perro, Gato y Auto no tienen relación entre sí. O sea, no tiene sentido que hereden de una misma clase porque son cosas totalmente distintas.
Lo único que comparten es que pueden “emitir sonido”, entonces lo más lógico es definir una interfaz con ese método y que cada clase lo implemente a su manera.
Si usara una clase abstracta estaría forzando una herencia que no corresponde, en cambio con la interfaz solo comparto el comportamiento sin obligarlas a estar relacionadas.
## 12)¿Qué ventajas tiene usar interfaces en comparación con clases abstractas?
Permiten mayor flexibilidad, herencia múltiple de comportamiento y ayudan a que el sistema sea más modular y desacoplado.
## 13)¿Qué desventajas puede tener una clase abstracta frente a una interfaz?
Es más rígida, porque solo se puede heredar de una. Además, genera más acoplamiento entre las clases.
