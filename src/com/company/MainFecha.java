package com.company;

public class MainFecha {

    public static void main(String[] args) {
        Fecha fecha = new Fecha(29, 2, 2000);
        fecha.nextDay();
        System.out.println(fecha);
    }
}
