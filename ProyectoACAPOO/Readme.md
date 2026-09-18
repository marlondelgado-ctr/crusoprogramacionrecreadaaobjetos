# Sistema de Parqueadero

## Nombre del estudiante

Marlon David Delgado Niño

## Descripción

Este proyecto consiste en un programa desarrollado en Java para llevar el control básico de un parqueadero.

La idea principal es permitir registrar los vehículos que ingresan, consultar la información de cada uno, buscar un vehículo por su placa y registrar las horas de entrada y salida. También permite calcular cuánto tiempo estuvo el vehículo en el parqueadero y cuánto debe pagar.

Para realizar el proyecto utilizamos diferentes conceptos de Programación Orientada a Objetos, además de listas, arreglos y manejo de errores.

## Funcionalidades

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

## Clases utilizadas

### Vehiculo

Esta clase representa cada vehículo que se registra en el parqueadero.

En ella se guarda la información de la placa, marca, modelo, año y color del vehículo.

### Parqueadero

Esta clase se encarga de administrar los vehículos que se encuentran registrados y de realizar las diferentes operaciones del parqueadero, como buscar vehículos, registrar horarios, calcular pagos y mostrar los espacios disponibles.

### VehiculoNoEncontradoException

Esta clase se utiliza para manejar el caso en el que se busca una placa que no se encuentra registrada en el parqueadero.

### Main

Es la clase principal del programa. Aquí se encuentra el menú que permite al usuario elegir qué acción desea realizar.

## Conceptos de POO aplicados

Durante el desarrollo del proyecto utilizamos diferentes conceptos de Programación Orientada a Objetos:

- Clases y objetos.
- Encapsulamiento.
- Atributos privados.
- Constructores.
- Getters y setters.
- Métodos.
- Relación entre clases.
- Uso de `ArrayList`.
- Uso de arreglos.
- Recorrido de listas y arreglos.
- Excepciones personalizadas.
- Manejo de errores mediante `try-catch`.

## Instrucciones para ejecutar

Para ejecutar el programa se deben seguir los siguientes pasos:

1. Abrir Visual Studio Code.

2. Abrir la carpeta del proyecto llamada `ProyectoACAPOO`.

3. Dentro del proyecto, ingresar a la carpeta `src`.

4. Abrir el archivo `Main.java`.

5. Verificar que el código esté guardado.

6. Ejecutar el programa utilizando el botón **Run** o **Ejecutar** que aparece en Visual Studio Code.

7. Al ejecutarse, aparecerá en la consola el menú principal:

```text
================================
     SISTEMA DE PARQUEADERO
================================
1. Registrar vehículo
2. Mostrar vehículos
3. Buscar vehículo
4. Registrar horario
5. Mostrar estado
6. Salir
================================
Seleccione una opción: