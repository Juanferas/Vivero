package model;
import java.util.*;
public class Vivero {

    private Planta[][] plantas;

    public Vivero() {
        plantas = new Planta[12][6];
    }

    public void addPlanta(String nombre, double costo, String nombreFruto) {
        boolean endFor = false;
        for (int f = 0; f < 6 && !endFor; f++) {
            for (int c = 0; c < plantas[0].length && !endFor; c++) {
                if (plantas[f][c] == null) {
                    plantas[f][c] = new Frutal(nombre, costo, nombreFruto);
                    endFor = true;
                }
            }
        }
    }

    public void addPlanta(String nombre, double costo, double altura) {
        boolean endFor = false;
        for (int f = 6; f < 12 && !endFor; f++) {
            for (int c = 0; c < plantas[0].length && !endFor; c++) {
                if (plantas[f][c] == null) {
                    plantas[f][c] = new Ornamental(nombre, costo, altura);
                    endFor = true;
                }
            }
        }
    }

    public String plantsNames() {
        String msj = "";
        ArrayList<String> nombresFrutos = new ArrayList<String>();
        for (int f=0; f<plantas.length; f++) {
            for (int c=0; c<plantas[0].length; c++) {
                if (plantas[f][c]!=null && plantas[f][c] instanceof Frutal) {
                    if (!(nombresFrutos.contains(((Frutal)plantas[f][c]).getNombreFruto()))) {
                        nombresFrutos.add(((Frutal)plantas[f][c]).getNombreFruto());
                        msj += "* "+((Frutal)plantas[f][c]).getNombreFruto()+"\n";
                    }
                }
            }
        }
        return msj;
    }

    public Planta searchPlant(String nombre) {
        Planta foundPlant = null;
        boolean endFor = false;
        for (int f=0; f<plantas.length && !endFor; f++) {
            for (int c=0; c<plantas[0].length && !endFor; c++) {
                if (plantas[f][c]!=null && plantas[f][c].getNombre().equals(nombre)) {
                    foundPlant = plantas[f][c];
                    endFor = true;
                }
            }
        }
        return foundPlant;
    }

    public boolean repeatedName(String nombre) {
        boolean repeated = false;
        for (int f=0; f<plantas.length && !repeated; f++) {
            for (int c=0; c<plantas[0].length && !repeated; c++) {
                if(plantas[f][c]!=null &&  plantas[f][c].getNombre().equals(nombre)) { 
                    repeated = true;
                }
            }
        }
        return repeated;
    }
}