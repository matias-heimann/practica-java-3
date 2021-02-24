package com.meli.java.clase2.tm;

public class MainFecha {

    public static void main(String[] args) {
        Fecha fecha = new Fecha(31, 1, 1997);
        fecha.nextDay();
        System.out.println(fecha);
    }
}
