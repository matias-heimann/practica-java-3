package com.meli.java.ej_adicionales.ej3;

public class InvitadoMeli extends Invitado{

    private String puesto;

    public InvitadoMeli(String nombre, int dni, String puesto) {
        super(nombre, dni);
        this.puesto = puesto;
    }

    @Override
    public void recibirTorta() {
        System.out.println(this.nombre + " grito viva la Chiqui!");
    }
}
