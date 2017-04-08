package com.example.usuario.aplicaciondeporte;

/**
 * Created by Usuario on 08/04/2017.
 */

public class Jugador extends Deportes {

    private int pases;
    private int control;
    private int disparos_apuerta;
    private int disparos;
    private int perdida;
    private int robo;
    private int faltas;
    private int asistencias;
    private int goles;



    public Jugador(){}



    public Jugador(String nombre_deporte, int id_jugador, int pases, int control, int disparos_apuerta, int disparos, int perdida, int robo, int faltas, int asistencias, int goles) {
        super(nombre_deporte, id_jugador);
        this.pases = pases;
        this.control = control;
        this.disparos_apuerta = disparos_apuerta;
        this.disparos = disparos;
        this.perdida = perdida;
        this.robo = robo;
        this.faltas = faltas;
        this.asistencias = asistencias;
        this.goles = goles;
    }

    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
    }

    public int getDisparos_apuerta() {
        return disparos_apuerta;
    }

    public void setDisparos_apuerta(int disparos_apuerta) {
        this.disparos_apuerta = disparos_apuerta;
    }

    public int getDisparos() {
        return disparos;
    }

    public void setDisparos(int disparos) {
        this.disparos = disparos;
    }

    public int getPerdida() {
        return perdida;
    }

    public void setPerdida(int perdida) {
        this.perdida = perdida;
    }

    public int getRobo() {
        return robo;
    }

    public void setRobo(int robo) {
        this.robo = robo;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
}
