package com.meli.java.ej_adicionales.ej2;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Carrera {

    private int distancia;
    private int premioEnDolares;
    private String nombre;
    private int cantidadDeVehiculosPermitidos;
    private List<Vehiculo> listaDeVehiculos;
    private SocorristaAuto socorristaAuto;
    private SocorristaMoto socorristaMoto;

    public Carrera(int distancia, int premioEnDolares, String nombre, int cantidadDeVehiculosPermitidos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.listaDeVehiculos = new LinkedList<>();
        this.socorristaAuto = new SocorristaAuto();
        this.socorristaMoto = new SocorristaMoto();
    }

    public void darDeAltaAuto(int velocidad, double aceleracion, double anguloDeGiro, String patente){
        if(listaDeVehiculos.size() < cantidadDeVehiculosPermitidos){
            listaDeVehiculos.add(new Auto(velocidad, aceleracion, anguloDeGiro, patente));
        }
    }

    public void darDeAltMoto(int velocidad, double aceleracion, double anguloDeGiro, String patente){
        if(listaDeVehiculos.size() < cantidadDeVehiculosPermitidos){
            listaDeVehiculos.add(new Moto(velocidad, aceleracion, anguloDeGiro, patente));
        }
    }

    public void eliminarVehiculo(Vehiculo vehiculo){
        this.listaDeVehiculos.remove(vehiculo);
    }

    public void eliminarVehiculoConPatente(String patente){
        listaDeVehiculos = listaDeVehiculos.stream()
                .filter(vehiculo -> !vehiculo.getPatente().equals(patente))
                .collect(Collectors.toList());
    }

    public Vehiculo ganadorCarrera(){
        Vehiculo ganador = listaDeVehiculos.get(0);
        double maxCriteria = 0.0;
        for(Vehiculo v: listaDeVehiculos){
            if(maxCriteria < obtenerCriterioGanador(v)){
                ganador = v;
                maxCriteria = obtenerCriterioGanador(v);
            }
        }
        return ganador;
    }

    private double obtenerCriterioGanador(Vehiculo v){
        return v.getVelocidad() * 0.5 * v.getAceleracion() / (v.getAnguloDeGiro() * (v.getPeso() - v.getRuedas() * 100));
    }

    public void socorrerAuto(String patente){
        try {
            Optional<Vehiculo> auto = listaDeVehiculos.stream().filter(v -> v.getPatente().equals(patente)).findAny();
            if(auto.isPresent()){
                this.socorristaAuto.socorrer((Auto) auto.get());
            }
            else{
                System.out.println("Patente no existe");
            }
        }
        catch (ClassCastException e){
            System.out.println("No es un auto");
        }
    }

    public void socorrerMoto(String patente){
        try {
            Optional<Vehiculo> moto = listaDeVehiculos.stream().filter(v -> v.getPatente().equals(patente)).findAny();
            if(moto.isPresent()){
                this.socorristaMoto.socorrer((Moto) moto.get());
            }
        }
        catch (ClassCastException e){
            System.out.println("No es una moto");
        }
    }

}
