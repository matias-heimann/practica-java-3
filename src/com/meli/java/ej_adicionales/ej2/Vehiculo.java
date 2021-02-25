package com.meli.java.ej_adicionales.ej2;

import java.util.Objects;

public abstract class Vehiculo {

    protected int velocidad;
    protected double aceleracion;
    protected double anguloDeGiro;
    protected String patente;
    protected double peso;
    protected int ruedas;

    public Vehiculo(int velocidad, double aceleracion, double anguloDeGiro, String patente, double peso, int ruedas) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.anguloDeGiro = anguloDeGiro;
        this.patente = patente;
        this.peso = peso;
        this.ruedas = ruedas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return patente.equals(vehiculo.patente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patente);
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public double getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public double getPeso() {
        return peso;
    }

    public int getRuedas() {
        return ruedas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getPatente() {
        return patente;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "velocidad=" + velocidad +
                ", aceleracion=" + aceleracion +
                ", anguloDeGiro=" + anguloDeGiro +
                ", patente='" + patente + '\'' +
                ", peso=" + peso +
                ", ruedas=" + ruedas +
                '}';
    }
}
