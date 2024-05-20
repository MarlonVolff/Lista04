package br.edu.up.Model;

public class Reserva {
    private int id;
    private String nomeResponsavel;
    private int qntPessoas;
    private String data;
    private double valorTotal;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }
    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public int getQntPessoas() {
        return qntPessoas;
    }
    public void setQntPessoas(int qntPessoas) {
        this.qntPessoas = qntPessoas;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    
}
