import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import excepciones.VehiculoNoEncontradoException;
import modelo.parqueadero;
import modelo.vehiculo;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        parqueadero parqueadero = new parqueadero(10, 2000);

        int opcion = 0;

        while (opcion != 6) {

            System.out.println("\n================================");
            System.out.println("     SISTEMA DE PARQUEADERO");
            System.out.println("================================");
            System.out.println("1. Registrar vehículo");
            System.out.println("2. Mostrar vehículos");
            System.out.println("3. Buscar vehículo");
            System.out.println("4. Registrar horario");
            System.out.println("5. Mostrar estado");
            System.out.println("6. Salir");
            System.out.println("================================");
            System.out.print("Seleccione una opción: ");

            try {

                opcion = Integer.parseInt(teclado.nextLine());

                switch (opcion) {

                    case 1:

                        System.out.println("\n--- REGISTRAR VEHÍCULO ---");

                        System.out.print("Placa: ");
                        String placa = teclado.nextLine().toUpperCase();

                        System.out.print("Marca: ");
                        String marca = teclado.nextLine();

                        System.out.print("Modelo: ");
                        String modelo = teclado.nextLine();

                        System.out.print("Color: ");
                        String color = teclado.nextLine();

                        vehiculo vehiculo = new vehiculo(
                                placa,
                                marca,
                                modelo,
                                color
                        );

                        parqueadero.registrarVehiculo(vehiculo);

                        break;

                    case 2:

                        parqueadero.mostrarVehiculos();

                        break;

                    case 3:

                        System.out.println("\n--- BUSCAR VEHÍCULO ---");

                        System.out.print("Ingrese la placa: ");
                        String placaBuscar = teclado.nextLine();

                        try {

                            vehiculo encontrado =
                                    parqueadero.buscarVehiculo(placaBuscar);

                            System.out.println("\nVehículo encontrado:");
                            System.out.println("--------------------------------");
                            encontrado.mostrarInformacion();
                            System.out.println("--------------------------------");

                        } catch (VehiculoNoEncontradoException e) {

                            System.out.println(e.getMessage());
                        }

                        break;

                    case 4:

                        System.out.println("\n--- REGISTRAR HORARIO ---");

                        System.out.print("Ingrese la placa: ");
                        String placaHorario = teclado.nextLine().toUpperCase();

                        try {

                            DateTimeFormatter formatoHora =
                                    DateTimeFormatter.ofPattern("HH:mm");

                            System.out.print("Hora de entrada (HH:mm): ");
                            LocalTime entrada = LocalTime.parse(
                                    teclado.nextLine(),
                                    formatoHora
                            );

                            System.out.print("Hora de salida (HH:mm): ");
                            LocalTime salida = LocalTime.parse(
                                    teclado.nextLine(),
                                    formatoHora
                            );

                            parqueadero.registrarHorario(
                                    placaHorario,
                                    entrada,
                                    salida
                            );

                            parqueadero.calcularPago(placaHorario);

                        } catch (VehiculoNoEncontradoException e) {

                            System.out.println(e.getMessage());

                        } catch (DateTimeParseException e) {

                            System.out.println(
                                    "Formato de hora incorrecto. Use HH:mm."
                            );
                        }

                        break;

                    case 5:

                        parqueadero.mostrarEstado();

                        break;

                    case 6:

                        System.out.println("\nServicio Finalizado.");
                        break;

                    default:

                        System.out.println(
                                "Opción no válida. Seleccione entre 1 y 6."
                        );
                }

            } catch (NumberFormatException e) {

                System.out.println(
                        "Entrada inválida. Debe ingresar un número."
                );
            }
        }

        teclado.close();
    }
}