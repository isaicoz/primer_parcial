package Vehiculo;


public class Helicoptero extends Vehiculo_Aereo {
    public Helicoptero(){}
    private int cascos,comunicador;
    
    public Helicoptero(int cascos, int comunicador, int elices, int tanque, int ruedas, int piloto, String marca, String linea, String color, String placas, int asientos, int motor, int modelo) {
        super(elices, tanque, ruedas, piloto, marca, linea, color, placas, asientos, motor, modelo);
        this.cascos = cascos;
        this.comunicador = comunicador;
    }
    
    public int getCascos() {
        return cascos;
    }

    public void setCascos(int cascos) {
        this.cascos = cascos;
    }

    public int getComunicador() {
        return comunicador;
    }

    public void setComunicador(int comunicador) {
        this.comunicador = comunicador;
    }
}
