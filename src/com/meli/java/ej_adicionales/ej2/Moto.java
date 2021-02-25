package com.meli.java.ej_adicionales.ej2;

public class Moto extends Vehiculo{

    public Moto(int velocidad, double aceleracion, double anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente, 300, 2);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "velocidad=" + velocidad +
                ", aceleracion=" + aceleracion +
                ", anguloDeGiro=" + anguloDeGiro +
                ", patente='" + patente + '\'' +
                ", peso=" + peso +
                ", ruedas=" + ruedas +
                '}';
    }
}
