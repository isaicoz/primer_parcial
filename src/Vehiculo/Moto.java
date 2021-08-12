package Vehiculo;

public class Moto extends Vehiciulo_Terrestre{
    public Moto(){}
    
    private int candelas, kilometraje;
    private String tipollanta;
    
    public Moto(int candelas, int kilometraje, String tipollanta, int ruedas, int tanque, int chasis, String marca, String linea, String color, String placas, int asientos, int motor, int modelo) {
        super(ruedas, tanque, chasis, marca, linea, color, placas, asientos, motor, modelo);
        this.candelas = candelas;
        this.kilometraje = kilometraje;
        this.tipollanta = tipollanta;
    }
    
    public int getCandelas() {
        return candelas;
    }

    public void setCandelas(int candelas) {
        this.candelas = candelas;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getTipollanta() {
        return tipollanta;
    }

    public void setTipollanta(String tipollanta) {
        this.tipollanta = tipollanta;
    }
}
