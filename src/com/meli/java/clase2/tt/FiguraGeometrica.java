package com.meli.java.clase2.tt;

public abstract class FiguraGeometrica {

    String name;

    public FiguraGeometrica(String name){
        this.name = name;
    }

    public abstract double area();

    @Override
    public String toString() {
        return "FiguraGeometrica{" +
                "name='" + name + '\'' +
                '}';
    }
}
