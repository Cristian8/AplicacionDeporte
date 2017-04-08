package com.example.usuario.aplicaciondeporte;

/**
 * Created by Usuario on 08/04/2017.
 */

public class JugadorBaloncesto extends Deportes {

    private int perdida;
    private int pases;
    private int robo;
    private int tiro_libres;
    private int tiros_de_dos;
    private int triples;
    private int marcador;
    private int tiros_fallados;
    private int faltas;
    private int rebote;
    private int asistencia;
    private boolean antideportiva;


    public JugadorBaloncesto(){}

    public JugadorBaloncesto(String nombre_deporte, int id_jugador, int perdida, int pases, int robo, int tiro_libres, int tiros_de_dos, int triples, int marcador, int tiros_fallados, int faltas, int rebote, int asistencia, boolean antideportiva) {
        super(nombre_deporte, id_jugador);
        this.perdida = perdida;
        this.pases = pases;
        this.robo = robo;
        this.tiro_libres = tiro_libres;
        this.tiros_de_dos = tiros_de_dos;
        this.triples = triples;
        this.marcador = marcador;
        this.tiros_fallados = tiros_fallados;
        this.faltas = faltas;
        this.rebote = rebote;
        this.asistencia = asistencia;
        this.antideportiva = antideportiva;
    }

    public int getPerdida() {
        return perdida;
    }

    public void setPerdida(int perdida) {
        this.perdida = perdida;
    }

    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public int getRobo() {
        return robo;
    }

    public void setRobo(int robo) {
        this.robo = robo;
    }

    public int getTiro_libres() {
        return tiro_libres;
    }

    public void setTiro_libres(int tiro_libres) {
        this.tiro_libres = tiro_libres;
    }

    public int getTiros_de_dos() {
        return tiros_de_dos;
    }

    public void setTiros_de_dos(int tiros_de_dos) {
        this.tiros_de_dos = tiros_de_dos;
    }

    public int getTriples() {
        return triples;
    }

    public void setTriples(int triples) {
        this.triples = triples;
    }

    public int getMarcador() {
        return marcador;
    }

    public void setMarcador(int marcador) {
        this.marcador = marcador;
    }

    public int getTiros_fallados() {
        return tiros_fallados;
    }

    public void setTiros_fallados(int tiros_fallados) {
        this.tiros_fallados = tiros_fallados;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getRebote() {
        return rebote;
    }

    public void setRebote(int rebote) {
        this.rebote = rebote;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public boolean isAntideportiva() {
        return antideportiva;
    }

    public void setAntideportiva(boolean antideportiva) {
        this.antideportiva = antideportiva;
    }
}
