package br.edu.up.controllers;

public class Mes {
    private String nome;
    private int qtdeDias;
    private Dia[] dias;
    private int count;

    public Mes(int qtdeDias, String nome) {
        this.qtdeDias = qtdeDias;
        this.nome = nome;
        this.dias = new Dia[qtdeDias];
        for (int i = 0; i < qtdeDias; i++) dias[i] = new Dia(i + 1);
    }

    public void adicionarDia(Dia dia) {
        if (count < dias.length) dias[count++] = dia;
    }

    public void adicionarCompromisso(Compromisso comp, int diaMes) {
        if (diaMes >= 1 && diaMes <= qtdeDias) dias[diaMes - 1].adicionarCompromisso(comp);
    }

    public void adicionarCompromisso(String pessoa, String local, String assunto, int hora, int diaMes) {
        Compromisso comp = new Compromisso(pessoa, local, assunto, hora);
        adicionarCompromisso(comp, diaMes);
    }

    public void excluirCompromisso(int diaMes, int hora) {
        if (diaMes >= 1 && diaMes <= qtdeDias) dias[diaMes - 1].excluirCompromisso(hora);
    }

    public String listarCompromissos(int diaMes) {
        if (diaMes >= 1 && diaMes <= qtdeDias) return dias[diaMes - 1].listarCompromissos();
        else return "";
    }

    public String listarCompromissos() {
        String temp = "Mês " + getNome();
        for (Dia dia : dias) {
            temp += "\n";
            temp += dia.listarCompromissos();
        }
        return temp;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQtdeDias() {
        return this.qtdeDias;
    }

}
