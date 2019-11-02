package model;  
public abstract class Planta {
    private String nombre;
    private double costo;

    public Planta(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return this.costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "----Plant Info----\n" +
            "nombre='" + getNombre() + "'\n" +
            "costo='" + getCosto() + "'";
    }
}
