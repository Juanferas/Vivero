package ui;
import model.*;
import java.util.Scanner;
public class Main {

    private Vivero viveroJuan;
    Scanner lectorstr, lectorint;

    public Main() {
        viveroJuan = new Vivero();
        lectorstr = new Scanner(System.in);
        lectorint = new Scanner(System.in);
    }

    public static void main (String[] args) {
        Main obj = new Main();
        int ciclo=0;
        while(ciclo==0) {
            System.out.println("\n--------MENU--------\n1.Agregar planta.\n2.Mostrar nombres de los frutos existentes.\n3.Buscar una planta por nombre.");
            int op = obj.lectorint.nextInt();
            switch (op) {
                case 1:
                    obj.agregarPlanta();
                    break;
                case 2:
                    obj.showFruitNames();
                    break;
                case 3:
                    obj.buscarPlanta();
            }
        }
    }

    public void agregarPlanta() {
        System.out.println("\nTipo de planta:\n1.Frutal.\n2.Ornamental.");
        int tipo = lectorint.nextInt();
        System.out.println("Nombre de la planta:");
        String nombre = lectorstr.nextLine();
        while(viveroJuan.repeatedName(nombre)==true) {
            System.out.println("<<Ya hay una planta registrada con ese nombre, por favor ingrese otro nombre.>>");
            System.out.println("Nombre de la planta:");
            nombre = lectorstr.nextLine();
        }
        System.out.println("Costo de la planta:");
        double costo = lectorint.nextInt();
        if (tipo == 1) {
            System.out.println("Nombre del fruto:");
            String nombreFruto = lectorstr.nextLine();
            viveroJuan.addPlanta(nombre, costo, nombreFruto);
        }
        if (tipo == 2) {
            System.out.println("Altura maxima:");
            double altura = lectorint.nextInt();
            viveroJuan.addPlanta(nombre, costo, altura);
        }
    }

    public void showFruitNames() {
        if (viveroJuan.plantsNames().equals("")) {
            System.out.println("\nNo hay frutos registrados.");
        }
        else {
            System.out.println("\nFrutos registrados:\n"+ viveroJuan.plantsNames());
        }
    }

    public void buscarPlanta() {
        System.out.println("\nNombre planta:");
        String nombre = lectorstr.nextLine();
        if (viveroJuan.searchPlant(nombre)==null) {
            System.out.println("\nNo hay ninguna planta con ese nombre.");
        }
        else {
            System.out.println("\n"+viveroJuan.searchPlant(nombre).toString());
        }
    }
}