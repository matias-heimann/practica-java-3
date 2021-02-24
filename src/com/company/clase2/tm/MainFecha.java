package com.company.clase2.tm;

public class MainFecha {

    public static void main(String[] args) {
        Fecha fecha = new Fecha(31, 1, 1997);
        fecha.nextDay();
        System.out.println(fecha);
    }
}
