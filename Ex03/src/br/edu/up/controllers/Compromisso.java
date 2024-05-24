package br.edu.up.controllers;

public class Compromisso {
    private String pessoa;
    private String local;
    private String assunto;
    private int horas;

    public Compromisso(String pessoa, String local, String assunto, int horas) {
        this.pessoa = pessoa;
        this.local = local;
        this.assunto = assunto;
        this.horas = horas;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Compromisso{" +
                "pessoa='" + pessoa + '\'' +
                ", local='" + local + '\'' +
                ", assunto='" + assunto + '\'' +
                ", horas=" + horas +
                '}';
    }
}
