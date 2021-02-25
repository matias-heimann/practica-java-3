package com.meli.java.ej_adicionales.ej3;

import java.util.LinkedList;
import java.util.List;

public class FuegosArtificailesContainer {

    private List<FuegoArtificial> fuegoArtificialList;

    public FuegosArtificailesContainer(){
        this.fuegoArtificialList = new LinkedList<>();
    }


    public void addFuegoArtificial(FuegoArtificial fuegoArtificial){
        fuegoArtificialList.add(fuegoArtificial);
    }

    public void addFuegoArtificial(PackFuegoArtificial packFuegoArtificial){
        if(packFuegoArtificial.getFuegosIndividuales() != null) {
            for (FuegoArtificial fuegoArtificial : packFuegoArtificial.getFuegosIndividuales()) {
                this.addFuegoArtificial(fuegoArtificial);
            }
        }

        if(packFuegoArtificial.getPacks() != null) {
            for (PackFuegoArtificial p : packFuegoArtificial.getPacks()) {
                this.addFuegoArtificial(p);
            }
        }
    }

    public List<FuegoArtificial> getFuegoArtificialList() {
        return fuegoArtificialList;
    }
}
