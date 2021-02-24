package com.company.clase2.tm;

public class ContadorMain {

    public static void main(String[] args) {
        Contador contador = new Contador();
        contador.incrementar();
        contador.decrementar();
        contador.incrementar(5);
        contador.decrementar(3);
    }
}
