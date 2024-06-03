package br.edu.up.Models;

public class Aluno extends Pessoa{
    private int anoIngressao;
    private String nomeCurso;
    private String turno;

    public Aluno(){
        
    }

    public Aluno(String nome, String rg, int matricula, int anoIngressao, String nomeCurso, String turno) {
        super(nome, rg, matricula);
        this.anoIngressao = anoIngressao;
        this.nomeCurso = nomeCurso;
        this.turno = turno;
    }

    public int getAnoIngressao() {
        return anoIngressao;
    }
    public void setAnoIngressao(int anoIngressao) {
        this.anoIngressao = anoIngressao;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString(){
        return "\nAluno{" +
               "\n Ano Ingressão: " + this.anoIngressao +
               "\n Nome Curso: " + this.nomeCurso +
               "\n Turno: " + this.turno +
               "\n} ";
    }
    
}
