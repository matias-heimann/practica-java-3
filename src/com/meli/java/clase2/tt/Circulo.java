package com.meli.java.clase2.tt;

public class Circulo extends FiguraGeometrica{

    private double radio;

    public Circulo(double radio){
        super("Circulo");
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "name='" + name + '\'' +
                ", radio=" + radio +
                '}';
    }
}
