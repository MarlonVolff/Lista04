package br.edu.up.Models;

public class Pessoa {
    private String nome;
    private String rg;
    private int matricula;

    public Pessoa(){
        
    }

    public Pessoa(String nome, String rg, int matricula) {
        this.nome = nome;
        this.rg = rg;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString(){
        return "\nPessoa{" +
               "\n Nome: " + this.nome +
               "\n RG: " + this.rg +
               "\n Matrícula: " + this.matricula +
               "} ";
    }
}