package com.company.tt;

public class FiguraGeometricaUtil {

    public static double areaPromedio(FiguraGeometrica figuras[]){
        double area = 0.0;
        for(FiguraGeometrica figura: figuras){
            area += figura.area();
        }
        return area / figuras.length;
    }

}
