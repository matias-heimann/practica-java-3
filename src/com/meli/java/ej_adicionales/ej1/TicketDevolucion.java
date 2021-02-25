package com.meli.java.ej_adicionales.ej1;

public class TicketDevolucion {

    private int guardaRopaId;
    private int numeroDeTicket;

    public TicketDevolucion(int guardaRopaId, int numeroDeTicker){
        this.guardaRopaId = guardaRopaId;
        this.numeroDeTicket = numeroDeTicker;
    }

    public int getGuardaRopaId() {
        return guardaRopaId;
    }

    public int getNumeroDeTicket() {
        return numeroDeTicket;
    }
}
