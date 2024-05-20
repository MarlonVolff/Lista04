package br.edu.up.Model;

public class Evento {
    private int id;
    private String nome;
    private String data;
    private String local;
    private int lotacaoMax;
    private int ingressosVendidos;
    private double precoIngreco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getLotacaoMax() {
        return lotacaoMax;
    }

    public void setLotacaoMax(int lotacaoMax) {
        this.lotacaoMax = lotacaoMax;
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setIngressosVendidos(int ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }

    public double getPrecoIngreco() {
        return precoIngreco;
    }

    public void setPrecoIngreco(double precoIngreco) {
        this.precoIngreco = precoIngreco;
    }

    @Override
    public String toString() {
        return "| Evento{" + "ID: '" + this.id + "'\n" +
                "| Nome: '" + this.nome + "'\n" +
                "| Data: '" + this.data + "'\n" +
                "| Local: '" + this.local + "'\n" +
                "| LotacaoMax: '" + this.lotacaoMax + "'\n" +
                "| IngressosVendidos'" + this.ingressosVendidos + "'\n" +
                "| PrecoIngreco'" + this.precoIngreco + "'\n" +
                "| }";
    }

}
