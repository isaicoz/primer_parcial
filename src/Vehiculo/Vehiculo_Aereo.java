package Vehiculo;

public class Vehiculo_Aereo extends Vehiculo {
    public Vehiculo_Aereo(){}
    private int elices, tanque,ruedas, piloto;
    
    public Vehiculo_Aereo(int elices, int tanque, int ruedas, int piloto, String marca, String linea, String color, String placas, int asientos, int motor, int modelo) {
        super(marca, linea, color, placas, asientos, motor, modelo);
        this.elices = elices;
        this.tanque = tanque;
        this.ruedas = ruedas;
        this.piloto = piloto;
    }
    
    public int getElices() {
        return elices;
    }

    public void setElices(int elices) {
        this.elices = elices;
    }

    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getPiloto() {
        return piloto;
    }

    public void setPiloto(int piloto) {
        this.piloto = piloto;
    }
}
