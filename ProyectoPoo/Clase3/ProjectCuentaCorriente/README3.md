# INFORME TÉCNICO - CLASE N° 3: PERSISTENCIA Y JERARQUÍA DE OBJETOS

---

## **Fundamentos del Sistema**

La implementación actual representa un salto cualitativo desde el manejo de datos estáticos hacia una arquitectura de software desacoplada. El núcleo de la Clase N° 3 se centra en la capacidad de transformar registros planos de un sistema de archivos externo en una estructura de objetos vivos dentro de la Máquina Virtual de Java.

Esta técnica constituye la base de la **persistencia de datos**, permitiendo que la lógica de negocio sea independiente de la entrada de información.

---

## **Abstracción y Encapsulamiento de la Entidad Base**

La clase **Cuenta** funciona como la superclase de la jerarquía, estableciendo un contrato de datos mediante el uso de modificadores de acceso **protected**.

Esto garantiza que el estado interno de la entidad (**titular, número de cuenta y saldo**) sea heredable pero permanezca resguardado de manipulaciones externas directas.

El acceso a estos atributos se gestiona exclusivamente a través de métodos de interfaz (**getters y setters**), cumpliendo con el principio de **ocultamiento de información**, fundamental en sistemas bancarios.

---

## **Herencia Especializada y Polimorfismo de Comportamiento**

La clase **Cuenta Corriente** ejemplifica la extensión de funcionalidad mediante la herencia.

Al heredar de **Cuenta**, la clase hija reutiliza la lógica de los constructores mediante la instrucción **super()**, optimizando el uso de memoria y evitando redundancia de código.

El punto crítico se encuentra en la **sobrescritura del método de extracción**. A través de una lógica de validación aritmética, el sistema amplía la capacidad operativa del saldo incorporando la variable de **descubierto**, permitiendo manejar estados de saldo negativo bajo reglas de negocio definidas.

---

## **Capa de Persistencia y Mapeo de Datos (Data Mapping)**

El repositorio de lectura actúa como un puente entre el archivo físico y la memoria del programa.

La implementación utiliza un flujo de datos (**Stream**) gestionado mediante **BufferedReader**, optimizando la eficiencia en la lectura de disco.

El proceso se basa en un ciclo de lectura que finaliza al detectar el centinela de fin de archivo (**null**).

Durante este ciclo se realiza el **parsing de datos**, donde la información en formato texto es convertida a tipos primitivos (**double**) y a objetos complejos.

Esta separación de responsabilidades permite que el sistema trabaje con una **colección de objetos ya procesados y listos para operar**.

---

## **Conclusión Técnica de los Métodos Propuestos**

La integración de estos conceptos permite construir una arquitectura donde la lógica de la aplicación es independiente del volumen de datos.

El uso de **colecciones genéricas (List)** aporta escalabilidad al sistema.

El manejo de errores mediante estructuras **try-catch** garantiza la integridad del programa frente a fallos de entrada/salida o errores de formato, asegurando un flujo de ejecución robusto y confiable.