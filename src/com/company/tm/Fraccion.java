package com.company.tm;

public class Fraccion {

    public int dividendo;
    public int divisor;

    public Fraccion(int dividendo, int divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    public Fraccion() {
        this.divisor = 1;
        this.dividendo = 0;
    }

    public void suma(Fraccion suma) {
        this.dividendo = this.dividendo * suma.divisor + suma.dividendo * this.divisor;
        this.divisor *= suma.divisor;
    }

    public void suma(int suma) {
        this.dividendo += (suma * this.divisor);
    }

    public void multiplicacion(int multi) {
        this.dividendo *= multi;
    }

    public void multiplicacion(Fraccion multi) {
        this.dividendo *= multi.dividendo;
        this.divisor *= multi.divisor;
    }

    public void resta(Fraccion resta) {
        this.dividendo = this.dividendo * resta.divisor - resta.dividendo * this.divisor;
        this.divisor *= resta.divisor;
    }

    public void resta(int resta){
        this.dividendo -= (resta * this.divisor);
    }

    public void division(int division) {
        this.divisor *= division;
    }

    public void division(Fraccion division) {
        this.divisor *= division.dividendo;
        this.dividendo *= division.divisor;
    }

    @Override
    public String toString() {
        return this.dividendo + "/" + this.divisor;
    }
}
