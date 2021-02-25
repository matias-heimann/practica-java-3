package com.meli.java.ej_adicionales.ej3;

import java.util.List;

public class PackFuegoArtificial {

    private List<FuegoArtificial> fuegosIndividuales;
    private List<PackFuegoArtificial> packs;

    public PackFuegoArtificial(List<FuegoArtificial> fuegosIndividuales, List<PackFuegoArtificial> packs){
        this.fuegosIndividuales = fuegosIndividuales;
        this.packs = packs;
    }

    public List<FuegoArtificial> getFuegosIndividuales() {
        return fuegosIndividuales;
    }

    public List<PackFuegoArtificial> getPacks() {
        return packs;
    }
}
