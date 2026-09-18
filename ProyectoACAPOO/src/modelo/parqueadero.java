package modelo;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import excepciones.VehiculoNoEncontradoException;

public class parqueadero {

    private ArrayList<vehiculo> vehiculos;
    private int capacidad;
    private int valorPorHora;

    private String[] placas;
    private LocalTime[] horasEntrada;
    private LocalTime[] horasSalida;

    private DateTimeFormatter formatoHora;

    public parqueadero(int capacidad, int valorPorHora) {

        this.capacidad = capacidad;
        this.valorPorHora = valorPorHora;

        vehiculos = new ArrayList<>();

        placas = new String[capacidad];
        horasEntrada = new LocalTime[capacidad];
        horasSalida = new LocalTime[capacidad];

        formatoHora = DateTimeFormatter.ofPattern("HH:mm");
    }

    public void registrarVehiculo(vehiculo vehiculo) {

        if (vehiculos.size() >= capacidad) {
            System.out.println("El parqueadero está lleno.");
            return;
        }

        vehiculos.add(vehiculo);

        System.out.println("Vehículo registrado correctamente.");
    }

    public void mostrarVehiculos() {

        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos registrados.");
            return;
        }

        System.out.println("================================");
        System.out.println("      VEHÍCULOS REGISTRADOS");
        System.out.println("================================");

        for (vehiculo vehiculo : vehiculos) {

            vehiculo.mostrarInformacion();

            System.out.println("--------------------------------");
        }
    }

    public vehiculo buscarVehiculo(String placa)
            throws VehiculoNoEncontradoException {

        for (vehiculo vehiculo : vehiculos) {

            if (vehiculo.getPlaca().equalsIgnoreCase(placa)) {
                return vehiculo;
            }
        }

        throw new VehiculoNoEncontradoException(
                "No se encontró un vehículo con la placa: " + placa);
    }

    public void registrarHorario(String placa, LocalTime entrada, LocalTime salida)
            throws VehiculoNoEncontradoException {

        vehiculo vehiculo = buscarVehiculo(placa);

        int posicion = vehiculos.indexOf(vehiculo);

        placas[posicion] = vehiculo.getPlaca();
        horasEntrada[posicion] = entrada;
        horasSalida[posicion] = salida;

        System.out.println("Horario registrado correctamente.");
    }

    public void calcularPago(String placa)
            throws VehiculoNoEncontradoException {

        vehiculo vehiculo = buscarVehiculo(placa);

        int posicion = vehiculos.indexOf(vehiculo);

        if (horasEntrada[posicion] == null ||
            horasSalida[posicion] == null) {

            System.out.println("Este vehículo todavía no tiene");
            System.out.println("registrada la hora de entrada y salida.");
            return;
        }

        Duration tiempo = Duration.between(
                horasEntrada[posicion],
                horasSalida[posicion]);

        long minutosTotales = tiempo.toMinutes();

        if (minutosTotales < 0) {
            System.out.println(
                    "La hora de salida no puede ser anterior a la entrada.");
            return;
        }

        long horas = minutosTotales / 60;
        long minutos = minutosTotales % 60;

        long horasCobradas = (minutosTotales + 59) / 60;

        long valorPagar = horasCobradas * valorPorHora;

        System.out.println("================================");
        System.out.println("       INFORMACIÓN DE PAGO");
        System.out.println("================================");
        System.out.println("Placa: " + vehiculo.getPlaca());
        System.out.println("Entrada: "
                + horasEntrada[posicion].format(formatoHora));
        System.out.println("Salida: "
                + horasSalida[posicion].format(formatoHora));
        System.out.println("Permanencia: "
                + horas + " horas y "
                + minutos + " minutos");
        System.out.println("Horas cobradas: " + horasCobradas);
        System.out.println("Valor por hora: $" + valorPorHora);
        System.out.println("Valor a pagar: $" + valorPagar + " COP");
    }

    public void mostrarEstado() {

        int ocupados = vehiculos.size();

        int libres = capacidad - ocupados;

        double porcentajeLibres =
                (libres * 100.0) / capacidad;

        System.out.println("================================");
        System.out.println("      ESTADO DEL PARQUEADERO");
        System.out.println("================================");
        System.out.println("Capacidad total: " + capacidad);
        System.out.println("Espacios ocupados: " + ocupados);
        System.out.println("Espacios libres: " + libres);
        System.out.println("Porcentaje de espacios libres: "
                + porcentajeLibres + "%");
    }

    public int cantidadVehiculos() {
        return vehiculos.size();
    }

    public int getCapacidad() {
        return capacidad;
    }
}