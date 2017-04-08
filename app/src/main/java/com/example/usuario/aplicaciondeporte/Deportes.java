package com.example.usuario.aplicaciondeporte;

/**
 * Created by Usuario on 08/04/2017.
 */

public class Deportes {

    private String nombre_deporte;
    private int id_jugador;

     public Deportes(){}

    public Deportes(String nombre_deporte, int id_jugador) {
        this.nombre_deporte = nombre_deporte;
        this.id_jugador = id_jugador;
    }

    public String getNombre_deporte() {
        return nombre_deporte;
    }

    public void setNombre_deporte(String nombre_deporte) {
        this.nombre_deporte = nombre_deporte;
    }

    public int getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(int id_jugador) {
        this.id_jugador = id_jugador;
    }
}
