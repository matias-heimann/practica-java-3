package com.meli.java.ej_adicionales.ej1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {

    private HashMap<Integer, List<Prenda>> prestamos;
    private int lastTicket;
    private int id;

    public GuardaRopa(int id){
        this.lastTicket = 0;
        this.prestamos = new HashMap<>();
        this.id = id;
    }

    public TicketDevolucion guardarPrendas(List<Prenda> prendas) {
        this.prestamos.put(lastTicket, prendas);
        int lastTicketAux = this.lastTicket;
        this.lastTicket++;
        return new TicketDevolucion(this.id, lastTicketAux);
    }

    public void mostrarPrendas() {
        if(this.prestamos.size() == 0){
            System.out.println("No quedan prendas en el guardaropas " + this.id);
            return;
        }
        System.out.println("Prendas restantes en el guardaropas " + this.id + ":");
        for(Map.Entry<Integer, List<Prenda>> entry: prestamos.entrySet()){
            for(Prenda prenda: entry.getValue()){
                System.out.println(prenda);
            }
        }
    }

    public List<Prenda> devolverPrendas(int numeroDeTicket){
        List<Prenda> prendas = this.prestamos.get(numeroDeTicket);
        this.prestamos.remove(numeroDeTicket);
        return prendas;
    }

}
