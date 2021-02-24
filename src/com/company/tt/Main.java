package com.company.tt;

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(5);
        Rectangulo r = new Rectangulo(6, 5);
        Triangulo t = new Triangulo(4, 3);
        FiguraGeometrica figuras[] = new FiguraGeometrica[3];
        figuras[0] = c;
        figuras[1] = r;
        figuras[2] = t;
        System.out.println(FiguraGeometricaUtil.areaPromedio(figuras));
    }
}
