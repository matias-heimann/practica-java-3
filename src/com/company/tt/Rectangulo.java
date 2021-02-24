package com.company.tt;

public class Rectangulo extends FiguraGeometrica{

    private double altura;
    private double base;

    public Rectangulo(double altura, double base) {
        super("Rectangulo");
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double area() {
        return this.altura * this.base;
    }
}
