package PkgEjercicio;

import java.util.ArrayList;
import java.util.List;

public class ClsEjercicio6 {
    private String nombre;
    private double sueldo_base;
    private double descuentos;
    private double sueldo_liquido;
    private int carnet;

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    public double getSueldo_liquido() {
        return sueldo_liquido;
    }


    public void ejercicio(){
        ClsEjercicio6 ej=new ClsEjercicio6();
        List<ClsEjercicio6> lista = new ArrayList<>();
        ej.setNombre("Juan");
        ej.setSueldo_base(3500);
        ej.setDescuentos(500);

        ej.calcularSueldoLiquido();
        lista.add(ej);

        for (ClsEjercicio6 empleado : lista) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Sueldo base: " + empleado.getSueldo_base());
            System.out.println("Descuentos: " + empleado.getDescuentos());
            System.out.println("Sueldo líquido: " + empleado.getSueldo_liquido());
        }
    }

    private void calcularSueldoLiquido() {
        sueldo_liquido = sueldo_base - descuentos;
    }
}

