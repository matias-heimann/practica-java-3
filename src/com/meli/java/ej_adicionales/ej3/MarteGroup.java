package com.meli.java.ej_adicionales.ej3;

import java.util.LinkedList;
import java.util.List;

public class MarteGroup {
    public static void main(String[] args) {
        FiestaOrganizacion fiestaOrganizacion = FiestaOrganizacion.getInstance();
        InvitadoMeli invitado1 = new InvitadoMeli("Matias", 40, "Gerente");
        InvitadoMeli invitado2 = new InvitadoMeli("Tomas", 41, "Programador");
        InvitadoStandard invitado3 = new InvitadoStandard("Julian", 43);
        InvitadoStandard invitado4 = new InvitadoStandard("Nicolas", 44);
        fiestaOrganizacion.addInvitado(invitado1);
        fiestaOrganizacion.addInvitado(invitado2);
        fiestaOrganizacion.addInvitado(invitado3);
        fiestaOrganizacion.addInvitado(invitado4);
        FuegoArtificial f1 = new FuegoArtificial("F1");
        fiestaOrganizacion.getFuegosArtificailesContainer().addFuegoArtificial(f1);
        FuegoArtificial f2 = new FuegoArtificial("F2");
        FuegoArtificial f3 = new FuegoArtificial("F3");
        List<FuegoArtificial> ls = new LinkedList<>();
        ls.add(f2);
        ls.add(f3);
        PackFuegoArtificial pack1 = new PackFuegoArtificial(ls, null);
        fiestaOrganizacion.getFuegosArtificailesContainer().addFuegoArtificial(pack1);
        FuegoArtificial f4 = new FuegoArtificial("F4");
        FuegoArtificial f5 = new FuegoArtificial("F5");
        FuegoArtificial f6 = new FuegoArtificial("F6");
        FuegoArtificial f7 = new FuegoArtificial("F7");
        List<PackFuegoArtificial> ls1 = new LinkedList<>();
        ls = new LinkedList<>();
        ls.add(f4);
        ls.add(f5);
        ls.add(f6);
        ls.add(f7);
        PackFuegoArtificial pack2 = new PackFuegoArtificial(ls, null);
        ls1.add(pack2);
        ls = new LinkedList<>();
        FuegoArtificial f8 = new FuegoArtificial("F8");
        FuegoArtificial f9 = new FuegoArtificial("F9");
        FuegoArtificial f10 = new FuegoArtificial("F10");
        ls.add(f8);
        ls.add(f9);
        ls.add(f10);
        PackFuegoArtificial pack3 = new PackFuegoArtificial(ls, ls1);
        fiestaOrganizacion.getFuegosArtificailesContainer().addFuegoArtificial(pack3);
        fiestaOrganizacion.cortarTorta();
        fiestaOrganizacion.tirarFuegosArtificiales();

    }

}
