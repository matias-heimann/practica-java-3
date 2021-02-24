package com.company.tt;

public abstract class FiguraGeometrica {

    private String name;

    public FiguraGeometrica(String name){
        this.name = name;
    }

    public abstract double area();
}
