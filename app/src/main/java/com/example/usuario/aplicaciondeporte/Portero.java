package com.example.usuario.aplicaciondeporte;

/**
 * Created by Usuario on 08/04/2017.
 */

public class Portero extends Deportes{

    private int paradas;
    private int pases;

    public Portero(){}

    public Portero(String nombre_deporte, int id_jugador, int paradas, int pases) {
        super(nombre_deporte, id_jugador);
        this.paradas = paradas;
        this.pases = pases;
    }

    public int getParadas() {
        return paradas;
    }

    public void setParadas(int paradas) {
        this.paradas = paradas;
    }

    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }
}
