package Vehiculo;

public class Automovil extends Vehiciulo_Terrestre {
    public Automovil(){}
    
    private int puertas, retrovisores;
    private String caja, combustible;
    
     public Automovil(int puertas, int retrovisores, String caja, String combustible, int ruedas, int tanque, int chasis, String marca, String linea, String color, String placas, int asientos, int motor, int modelo) {
        super(ruedas, tanque, chasis, marca, linea, color, placas, asientos, motor, modelo);
        this.puertas = puertas;
        this.retrovisores = retrovisores;
        this.caja = caja;
        this.combustible = combustible;
    }
     
    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getRetrovisores() {
        return retrovisores;
    }

    public void setRetrovisores(int retrovisores) {
        this.retrovisores = retrovisores;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    } 
}
