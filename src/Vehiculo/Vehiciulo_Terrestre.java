package Vehiculo;

public class Vehiciulo_Terrestre extends Vehiculo{
    
 public Vehiciulo_Terrestre (){}
 
 private int ruedas, tanque, chasis;
 
    public Vehiciulo_Terrestre(int ruedas, int tanque, int chasis, String marca, String linea, String color, String placas, int asientos, int motor, int modelo) {
        super(marca, linea, color, placas, asientos, motor, modelo);
        this.ruedas = ruedas;
        this.tanque = tanque;
        this.chasis = chasis;
    }
    
    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

    public int getChasis() {
        return chasis;
    }

    public void setChasis(int chasis) {
        this.chasis = chasis;
    }   
}
