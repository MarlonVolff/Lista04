package br.edu.up.models;

import java.util.Date;

public class Passagem{
    public String numAcento;
    public String classe;
    public Date dataVoo;  

    public Passagem() {
    }

    public Passagem(String numAcento, String classe, Date dataVoo) {
        this.numAcento = numAcento;
        this.classe = classe;
        this.dataVoo = dataVoo;
    }

    public String getNumAcento() {
        return this.numAcento;
    }

    public void setNumAcento(String numAcento) {
        this.numAcento = numAcento;
    }

    public String getClasse() {
        return this.classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Date getDataVoo() {
        return this.dataVoo;
    }

    public void setDataVoo(Date dataVoo) {
        this.dataVoo = dataVoo;
    }

    
}