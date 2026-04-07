## Definición de clase abstracta

Una clase abstracta es una clase que se usa como base para otras clases, pero no puede instanciarse directamente.
Sirve para representar una idea general de un conjunto de objetos, compartiendo atributos, constructores y métodos comunes.
Además, puede tener métodos abstractos, que son métodos declarados pero sin implementación, obligando a las subclases a definir su propio comportamiento.
Se utiliza cuando varias clases tienen características en común, pero ciertas acciones deben resolverse de manera diferente en cada subclase.
La clase abstracta permite modelar mejor la realidad, ya que expresa que existe un concepto general, pero que ese concepto por sí solo no siempre representa un objeto concreto.
Por ejemplo, “Empleado”, “Figura” o “Cuenta” pueden ser clases abstractas si no tiene sentido crear una instancia genérica de ellas.
En cambio, sí tendría sentido crear objetos de sus subclases concretas, como “EmpleadoAdministrativo”, “Círculo” o “CajaDeAhorro”.
Las clases abstractas son una herramienta muy útil para organizar jerarquías de herencia y favorecer el polimorfismo.
También ayudan a diseñar programas más claros, reutilizables y fáciles de mantener.
En Java se definen con la palabra reservada **abstract**.

## Método abstracto

Un método abstracto es un método que se declara en una clase abstracta pero no tiene implementación.
Su función es establecer una obligación para las subclases, indicando que todas ellas deberán proporcionar su propia versión de ese método.
Esto permite definir un comportamiento común a nivel conceptual, aunque la forma concreta de realizarlo cambie según el tipo de objeto.
Los métodos abstractos son fundamentales para expresar polimorfismo, ya que cada subclase responde de manera distinta al mismo mensaje.
Una clase que contiene uno o más métodos abstractos debe ser necesariamente abstracta.
Cuando una subclase hereda de una clase abstracta, está obligada a implementar todos sus métodos abstractos, a menos que también sea abstracta.
Este mecanismo mejora el diseño porque obliga a respetar una estructura común en toda la jerarquía.
Por ejemplo, si una clase abstracta Figura tiene el método abstracto calcularArea(), entonces Circulo y Rectangulo deberán implementarlo.
De esta manera, todas las figuras podrán calcular su área, aunque cada una lo haga con una fórmula distinta.
Los métodos abstractos permiten combinar generalidad y especialización dentro del diseño orientado a objetos.

## Diferencia entre clase concreta y abstracta

**Clase concreta**

- se puede crear con new
- tiene comportamiento completo

**Clase abstracta**

- no se puede crear con new
- sirve como base
- puede tener métodos ya hechos y métodos obligatorios

## Interfaz

Después de abstracta, entrás en interfaz.

Una interfaz es una estructura que define un conjunto de métodos que una clase debe implementar.
Representa un contrato: toda clase que implemente esa interfaz se compromete a desarrollar los métodos indicados.
A diferencia de una clase abstracta, una interfaz no se usa para compartir estado principal de los objetos, sino para establecer comportamientos comunes entre clases que incluso pueden no estar relacionadas entre sí por herencia.
Esto la convierte en una herramienta muy poderosa para diseñar sistemas flexibles y desacoplados.
Por ejemplo, distintas clases como Auto, Bicicleta y Monopatín podrían implementar una interfaz llamada Movible, aunque sean objetos muy diferentes.
La interfaz permite trabajar con todos ellos de forma polimórfica, enfocándose en lo que pueden hacer y no en qué son.
En Java, una clase puede implementar varias interfaces, lo cual brinda una gran ventaja de diseño.
Esto permite combinar comportamientos sin necesidad de heredar de múltiples clases.
Las interfaces son muy utilizadas en programación orientada a objetos porque favorecen la reutilización, la extensibilidad y la claridad del diseño.
Se definen con la palabra reservada **interface** y se implementan con **implements**.

## Diferencia entre clase abstracta e interfaz

**Clase abstracta**

- representa “lo que el objeto es”
- sirve para compartir atributos y métodos
- se hereda con extends
- una clase solo puede heredar de una clase

**Interfaz**

- representa “lo que el objeto puede hacer”
- define comportamientos
- se implementa con implements
- una clase puede implementar varias interfaces

Una forma simple de decírselos:

- clase abstracta: relación de tipo **es un**
- interfaz: relación de tipo **puede hacer**