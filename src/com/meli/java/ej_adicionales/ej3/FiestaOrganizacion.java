package com.meli.java.ej_adicionales.ej3;

import java.util.LinkedList;
import java.util.List;

public class FiestaOrganizacion {

    private static FiestaOrganizacion INSTANCE = new FiestaOrganizacion();
    private FuegosArtificailesContainer fuegosArtificailesContainer;
    private List<Invitado> invitados;

    public FiestaOrganizacion(){
        this.fuegosArtificailesContainer = new FuegosArtificailesContainer();
        this.invitados = new LinkedList<>();
    }

    public void cortarTorta(){
        for(Invitado invitado: invitados){
            invitado.recibirTorta();
        }
    }

    public void tirarFuegosArtificiales(){
        for(FuegoArtificial fuegoArtificial: fuegosArtificailesContainer.getFuegoArtificialList()){
            fuegoArtificial.explotar();
        }
    }

    public static FiestaOrganizacion getInstance(){
        return INSTANCE;
    }

    public FuegosArtificailesContainer getFuegosArtificailesContainer() {
        return fuegosArtificailesContainer;
    }

    public void addInvitado(Invitado invitado){
        this.invitados.add(invitado);
    }
}
