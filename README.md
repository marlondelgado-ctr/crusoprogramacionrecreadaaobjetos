1. Descripción

 

Este proyecto consiste en un programa desarrollado en Java para llevar el control básico de un parqueadero.

 

La idea principal es permitir registrar los vehículos que ingresan, consultar la información de cada uno, buscar un vehículo por su placa y registrar las horas de entrada y salida. También permite calcular cuánto tiempo estuvo el vehículo en el parqueadero y cuánto debe pagar.

 

Para realizar el proyecto utilizamos diferentes conceptos de Programación Orientada a Objetos, además de listas, arreglos y manejo de errores.

 

2. Funcionalidades

El programa cuenta con las siguientes opciones:

 

- Registrar un vehículo.

- Mostrar los vehículos registrados.

- Buscar un vehículo por su placa.

- Registrar la hora de entrada y salida.

- Calcular el tiempo que permaneció el vehículo.

- Calcular el valor a pagar.

- Mostrar el estado del parqueadero.

- Consultar los espacios ocupados y disponibles.

- Salir del programa.

 

3.  Clases utilizadas.

 

 

A. vehículo

Esta clase representa cada vehículo que se registra en el parqueadero.

En ella se guarda la información de la placa, marca, modelo y color del vehículo.

 

B. Parqueadero.

Esta clase se encarga de administrar los vehículos que se encuentran registrados y de realizar las diferentes operaciones del parqueadero, como buscar vehículos, registrar horarios, calcular pagos y mostrar los espacios disponibles.

 

C.  VehiculoNoEncontradoException.

Esta clase se utiliza para manejar el caso en el que se busca una placa que no se encuentra registrada en el parqueadero.

 

D. Main.

Es la clase principal del programa. Aquí se encuentra el menú que permite al usuario elegir qué acción desea realizar.

 

4.  Conceptos de POO aplicados

 

Durante el desarrollo del proyecto utilizamos diferentes conceptos de Programación Orientada a Objetos:

 

- Clases y objetos.

- Encapsulamiento.

- Atributos privados.

- Constructores.

- Getters y setters.

- Métodos.

- Relación entre clases.

- Uso de ArrayList.

- Uso de arreglos.

- Recorrido de listas y arreglos.

- Excepciones personalizadas.

- Manejo de errores mediante try-catch.

 

5. Instrucciones para paso a paso

1. Ejecutar el run java.

2.Al ejecutar el run java saldrá un menú, marque la tecla # 1, para registrar los datos de su vehiculó como: (placa, marca, modelo y color), marque tecla #2 si desea ver los vehículos registrados en el sistema.

 3. Marque la tecla # 3 para buscar el vehiculó por la placa.

 4.  Al marcar la tecla 4 saldrán lo siguiente: ingresar placa registrada, ingresar la hora de entrada después ingresar hora de salida, las horas debe ser militar (00:00- 23:59), teniendo el registro de las horas de entrada y salida, el sistema calcula las de horas de permanencia en el parqueadero  y valor a cobrar de las horas.

 5. Al marcar la tecla 5 mostrara el estado del parqueadero, de cuantos cupos tiene ocupados y disponibles.

 6. marca tecla # 6 para salir del sistema.
