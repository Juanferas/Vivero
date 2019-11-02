package model;
public class Frutal extends Planta {
    private String nombreFruto;

    public Frutal(String nombre, double costo, String nombreFruto) {
        super(nombre, costo);
        this.nombreFruto = nombreFruto;
    }

    public String getNombreFruto() {
        return this.nombreFruto;
    }

    public void setNombreFruto(String nombreFruto) {
        this.nombreFruto = nombreFruto;
    }

    @Override
    public String toString() {
        return super.toString() +
            "\nnombre fruto='" + getNombreFruto() + "'";
    }
}
