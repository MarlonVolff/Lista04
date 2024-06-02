package br.edu.up.Models;

public class Disciplina {
    private String nome;
    private String curriculo;
    private int competencia;
    private Professor professor;
    private Aluno[] alunos;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCurriculo() {
        return curriculo;
    }
    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }
    public int getCompetencia() {
        return competencia;
    }
    public void setCompetencia(int competencia) {
        this.competencia = competencia;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public Aluno[] getAlunos() {
        return alunos;
    }
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString(){
        return "";
    }

    public String stringAlunos(){
        String temp = "\nAlunos{";
        if(alunos != null && alunos.length > 0){
            for(Aluno aluno : alunos) temp += aluno.toString();
        }
        temp += "\n}";
        return temp;
    }
    
}
