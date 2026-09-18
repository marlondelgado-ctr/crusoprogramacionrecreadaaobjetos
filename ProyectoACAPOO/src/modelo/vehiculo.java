package modelo;

public class vehiculo {

    private String placa;
    private String marca;
    private String modelo;
    private String color;

    public vehiculo(String placa, String marca, String modelo, String color) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mostrarInformacion() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
    }
}