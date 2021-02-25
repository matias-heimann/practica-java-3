package com.meli.java.ej_adicionales.ej3;

public abstract class Invitado {

    protected String nombre;
    protected int dni;

    public Invitado(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void recibirTorta(){
        return;
    }


}
