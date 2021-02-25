package com.meli.java.ej_adicionales.ej1;

public class Campera extends Prenda{
    public Campera(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }

    @Override
    public String toString() {
        return "Campera{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
