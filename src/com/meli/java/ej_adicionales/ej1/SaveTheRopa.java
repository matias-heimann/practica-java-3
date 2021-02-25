package com.meli.java.ej_adicionales.ej1;

import java.util.LinkedList;
import java.util.List;

public class SaveTheRopa {
    public static void main(String[] args) {
        GuardaRopaContainer guardaRopaContainer = GuardaRopaContainer.getInstance();
        guardaRopaContainer.agregarGuardaRopas();
        Prenda prenda1 = new Buzo("Azul", "Nike", "Modelo 3");
        Prenda prenda2 = new Campera("Negra", "Puma", "Modelo 1");
        List<Prenda> prendas = new LinkedList<>();
        prendas.add(prenda1);
        prendas.add(prenda2);
        TicketDevolucion ticket = guardaRopaContainer.entregarPrenda(0, prendas);
        guardaRopaContainer.mostrarPrendas(0);
        guardaRopaContainer.devolverPrenda(ticket);
        guardaRopaContainer.mostrarPrendas(0);
    }
}
