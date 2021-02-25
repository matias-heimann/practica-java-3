package com.meli.java.ej_adicionales.ej2;

public class Dakar {
    public static void main(String[] args) {
        Carrera carrera = new Carrera(100, 100000, "Dakar", 4);
        carrera.darDeAltaAuto(100, 1.4, 5, "AUTO1");
        carrera.darDeAltaAuto(80, 2.5, 7.5, "AUTO2");
        carrera.darDeAltMoto(60, 2.9, 16, "MOTO2");
        carrera.darDeAltMoto(50, 3.4, 15, "MOTO1");
        carrera.socorrerMoto("MOTO2");
        carrera.socorrerAuto("AUTO1");
        System.out.println(carrera.ganadorCarrera());
    }
}
