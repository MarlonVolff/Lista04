package br.edu.up.models;

public class Comandante extends Tripulante{
    private int horasDoVoo;

    public Comandante(String nome, String rg, Aeronave aeronave, String idAeronautica, String matricula, int horasVoo) {
        super(nome, rg, aeronave, idAeronautica, matricula);
        this.horasVoo = horasVoo;
    }

    public int getHorasVoo() {
        return horasVoo;
    }

    public void setHorasVoo(int horasVoo) {
        this.horasVoo = horasVoo;
    }
    
    
}