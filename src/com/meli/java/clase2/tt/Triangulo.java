package com.meli.java.clase2.tt;

public class Triangulo extends FiguraGeometrica{

    private double altura;
    private double base;

    public Triangulo(double altura, double base) {
        super("Triangulo");
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double area() {
        return this.altura * this.base / 2.0;
    }
}
