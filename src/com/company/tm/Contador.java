package com.company.tm;

public class Contador {

    private int valor;

    public Contador() {
        this.valor = 0;
    }

    public Contador(int valor) {
        this.valor = valor;
    }

    public Contador(Contador contador) {
        this.valor = contador.valor;
    }

    public int getValor() {
        return valor;
    }

    public void incrementar() {
        this.valor += 1;
        System.out.println("El nuevo valor del contador es: " + this.valor);
    }

    public void incrementar(int valor) {
        this.valor += valor;
        System.out.println("El nuevo valor del contador es: " + this.valor);
    }

    public void decrementar() {
        this.valor -= 1;
        System.out.println("El nuevo valor del contador es: " + this.valor);
    }

    public void decrementar(int valor) {
        this.valor -= valor;
        System.out.println("El nuevo valor del contador es: " + this.valor);
    }


}
