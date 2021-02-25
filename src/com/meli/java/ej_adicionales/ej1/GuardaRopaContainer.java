package com.meli.java.ej_adicionales.ej1;

import java.util.HashMap;
import java.util.List;


public class GuardaRopaContainer {

    private static final GuardaRopaContainer INSTANCE = new GuardaRopaContainer();
    private HashMap<Integer, GuardaRopa> guardaropas;

    private GuardaRopaContainer(){
        this.guardaropas = new HashMap<>();
    }

    public static GuardaRopaContainer getInstance(){
        return INSTANCE;
    }


    public void agregarGuardaRopas(){
        this.guardaropas.put(this.guardaropas.size(), new GuardaRopa(this.guardaropas.size()));
    }

    public TicketDevolucion entregarPrenda(int id, List<Prenda> prendas){
        GuardaRopa guardaRopa = this.guardaropas.get(id);
        if(guardaRopa == null){
            throw new RuntimeException("Guardaropa no existe");
        }
        return guardaRopa.guardarPrendas(prendas);
    }

    public List<Prenda> devolverPrenda(TicketDevolucion ticketDevolucion){
        GuardaRopa guardaRopa = this.guardaropas.get(ticketDevolucion.getGuardaRopaId());
        if(guardaRopa == null){
            throw new RuntimeException("Guardaropa no existe");
        }
        List<Prenda> prendas = guardaRopa.devolverPrendas(ticketDevolucion.getNumeroDeTicket());
        if(prendas == null){
            throw new RuntimeException("Numero de ticket no existe en guardarropas " + ticketDevolucion.getGuardaRopaId());
        }
        return prendas;
    }

    public void mostrarPrendas(int id){
        GuardaRopa guardaRopa = this.guardaropas.get(id);
        if(guardaRopa == null){
            throw new RuntimeException("Guardaropa no existe");
        }
        guardaRopa.mostrarPrendas();
    }

    

}
