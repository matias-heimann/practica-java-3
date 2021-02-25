package com.meli.java.ej_adicionales.ej1;

public class Buzo extends Prenda{
    public Buzo(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }

    @Override
    public String toString() {
        return "Buzo{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
