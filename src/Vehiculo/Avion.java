package Vehiculo;

public class Avion extends Vehiculo_Aereo{
    public Avion(){}
    private int sanitarios, azafata,oxigeno, maleteros;
    
    public Avion(int sanitarios, int azafata, int oxigeno, int maleteros, int elices, int tanque, int ruedas, int piloto, String marca, String linea, String color, String placas, int asientos, int motor, int modelo) {
        super(elices, tanque, ruedas, piloto, marca, linea, color, placas, asientos, motor, modelo);
        this.sanitarios = sanitarios;
        this.azafata = azafata;
        this.oxigeno = oxigeno;
        this.maleteros = maleteros;
    }
    
    public int getSanitarios() {
        return sanitarios;
    }

    public void setSanitarios(int sanitarios) {
        this.sanitarios = sanitarios;
    }

    public int getAzafata() {
        return azafata;
    }

    public void setAzafata(int azafata) {
        this.azafata = azafata;
    }

    public int getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(int oxigeno) {
        this.oxigeno = oxigeno;
    }

    public int getMaleteros() {
        return maleteros;
    }

    public void setMaleteros(int maleteros) {
        this.maleteros = maleteros;
    }
}
