package br.edu.up.models;

public class Aeronave extends Passagem{
    public String codigo;
    public String tipo;
    public int qtdAssentos;

    public Aeronave(String codigo, String tipo, int qtdAssentos) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.qtdAssentos = qtdAssentos;
        this.assentosDisponiveis = new boolean[qtdAssentos];
        for (int i = 0; i < qtdAssentos; i++) {
            this.assentosDisponiveis[i] = true;
        }
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidadeAssentos() {
        return this.qtdAssentos;
    }


    public void setQuantidadeAssentos(int qtdAssentos) {
        this.qtdAssentos = qtdAssentos;
    }
}