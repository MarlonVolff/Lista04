package br.edu.up.controllers;

import java.util.ArrayList;

public class Dia {
    private int diaMes;
    private ArrayList<Compromisso> compromissos = new ArrayList<>();

    public int getDiaMes() {
        return diaMes;
    }

    public void setDiaMes(int diaMes) {
        this.diaMes = diaMes;
    }

    public void adicionarCompromisso(Compromisso comp) {
        compromissos.add(comp);
    }

    public Compromisso consultarCompromisso(int hora) {
        for (Compromisso comp : compromissos) {
            if (comp.getHoras() == hora)
                return comp;
        }
        return null;
    }

    public void excluirCompromisso(int hora) {
        for (Compromisso comp : compromissos) {
            if (comp.getHoras() == hora)
                compromissos.remove(comp);
        }
    }

    public String listarCompromissos() {
        String temp = "";
        for (Compromisso comp : compromissos) {
            temp += "\n";
            temp += comp.toString();
        }
        return temp;
    }

}
