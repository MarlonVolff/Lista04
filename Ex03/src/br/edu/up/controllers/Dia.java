package br.edu.up.controllers;

import java.util.ArrayList;

public class Dia {
    private int diaMes;
    private Compromisso[] compromissos;
    private int count;

    public Dia(int diaMes) {
        this.compromissos = new Compromisso[24];
        this.diaMes = diaMes;
    }

    public void adicionarCompromisso(Compromisso comp) {
        if (count < compromissos.length) {
            compromissos[count++] = comp;
        }
    }

    public Compromisso consultarCompromisso(int hora) {
        for (int i = 0; i < count; i++) {
            if (compromissos[i].getHoras() == hora) {
                return compromissos[i];
            }
        }
        return null;
    }

    public void excluirCompromisso(int hora) {
        for (int i = 0; i < count; i++) {
            if (compromissos[i].getHoras() == hora) {
                compromissos[i] = compromissos[--count];
                compromissos[count] = null;
                break;
            }
        }
    }

    public String listarCompromissos() {
        String temp = "Compromissos do dia " + getDiaMes();
        for (Compromisso comp : compromissos) {
            if (comp != null) {
                temp += "\n";
                temp += comp.toString();
            }
        }
        return temp;
    }

    public int getDiaMes() {
        return this.diaMes;
    }
}
