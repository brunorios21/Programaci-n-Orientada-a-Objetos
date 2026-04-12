# DOCUMENTACION TECNICA: SISTEMA DE GESTION BANCARIA (JAVA POO)

## 1. DESCRIPCION DEL SISTEMA
El sistema consiste en una aplicacion de consola desarrollada bajo el paradigma de Programacion Orientada a Objetos (POO) para la gestion de productos financieros, especificamente Cuentas Corrientes. La arquitectura se divide en capas para separar las entidades de datos, la logica de negocio y la interfaz de usuario.

## 2. ARQUITECTURA DE CLASES Y MODELADO

### CLASE ABSTRACTA: CUENTA
Representa la abstraccion de nivel superior que define el estado y comportamiento general de cualquier producto de deposito en la entidad.
- Definicion: Se declara como abstracta para impedir la instanciacion directa, ya que una "Cuenta" en si misma es un concepto general y no un producto final.
- Atributos: Implementa encapsulamiento mediante modificadores de acceso private y protected para resguardar la integridad del saldo y los datos del titular.
- Metodos: Define la firma del metodo extraer como abstracta, delegando la responsabilidad de la logica de validacion de fondos a las clases derivadas.

### CLASE CONCRETA: CUENTACORRIENTE
Representa la especializacion de la clase Cuenta.
- Herencia: Extiende la funcionalidad de la clase base incorporando el atributo de descubierto.
- Sobreescritura (Override): Implementa una logica especifica en el metodo extraer que permite saldos negativos siempre que el valor absoluto de la deuda no supere el limite de descubierto parametrizado.
- Polimorfismo: Permite ser tratada como una instancia de Cuenta pero ejecutando su comportamiento particular de extraccion.

## 3. CAPA DE SERVICIO E INTERFACES

### INTERFAZ: CUENTASERVICE
Define el contrato de operaciones disponibles para la gestion de cuentas.
- Definicion: Establece las firmas de los metodos (agregar, buscar, eliminar, listar) sin implementar la logica, garantizando el desacoplamiento entre la definicion y la ejecucion.
- Funcion: Actua como un puente que asegura que cualquier implementacion futura respete la misma estructura de metodos.

### IMPLEMENTACION: CUENTASERVICEIMPL
Contiene la logica de control y persistencia volatil de los datos.
- Estructura de Datos: Utiliza un ArrayList para el almacenamiento de objetos en memoria dinamica.
- Logica de Busqueda: Implementa algoritmos de iteracion para la localizacion de objetos mediante identificadores unicos (numero de cuenta).

## 4. CONCEPTOS DE PROGRAMACION APLICADOS

### ENCAPSULAMIENTO
Se logra mediante el uso de metodos accesores (getters) y mutadores (setters), asegurando que los atributos internos de los objetos no sean manipulados de forma externa sin pasar por los filtros de la clase.

### ABSTRACCION
Se identificaron las caracteristicas esenciales de un sistema bancario para modelar entidades del mundo real en componentes de software, omitiendo detalles no relevantes para el alcance del proyecto.

### PERSISTENCIA EN MEMORIA
El sistema utiliza colecciones dinamicas que residen en la memoria de ejecucion (RAM), lo que implica que los datos son volatiles y su ciclo de vida finaliza con la terminacion del proceso de la Maquina Virtual de Java.

## 5. FLUJO DE EJECUCION (CAPA DE INICIO)
La clase Main gestiona el ciclo de vida de la aplicacion mediante un bucle de control y un selector de opciones. Utiliza la clase Scanner para capturar el flujo de entrada de datos, realiza la limpieza del buffer para evitar desbordamientos en la captura de cadenas de texto y delega todas las operaciones de procesamiento a la capa de servicio.
