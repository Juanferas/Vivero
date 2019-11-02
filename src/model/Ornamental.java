package model;
public class Ornamental extends Planta {
    private double altura;

    public Ornamental(String nombre, double costo, double altura) {
        super(nombre, costo);
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() +
            "\naltura='" + getAltura() + "'";
    }

}