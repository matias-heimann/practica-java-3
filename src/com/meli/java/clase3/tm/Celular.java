package com.meli.java.clase3.tm;

public class Celular implements Precedable<Celular>{

    private String titular;
    private String numero;

    public Celular(String titular, String numero){
        this.titular = titular;
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public int precede(Celular celular) {
        return this.numero.compareTo(celular.getNumero());
    }

    @Override
    public String toString() {
        return "Celular{" +
                "titular='" + titular + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
