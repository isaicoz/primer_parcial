package Vehiculo;
abstract class Vehiculo {
    private String marca,linea,color, placas;
    private int asientos, motor, modelo;

    public Vehiculo(){}
    
    public Vehiculo(String marca, String linea, String color, String placas, int asientos, int motor, int modelo) {
        this.marca = marca;
        this.linea = linea;
        this.color = color;
        this.placas = placas;
        this.asientos = asientos;
        this.motor = motor;
        this.modelo = modelo;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
}
