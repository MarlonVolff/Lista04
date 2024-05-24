package br.edu.up.models;

public class Passageiro extends Pessoa{
    public String identificadorBagagem;
    public Passagem passagem;

    public Passageiro(String nome, String rg, String identificadorBagagem, Passagem passagem) {
        super(nome, rg);
        this.identificadorBagagem = identificadorBagagem;
        this.passagem = passagem;
    }
    
    public String getIndenficadorBagagem() {
        return this.identificadorBagagem;
    }

    public void setIndenficadorBagagem(String idenficadorBagagem) {
        this.identificadorBagagem = idenficadorBagagem;
    }

    public Passagem getPassagem() {
        return this.passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

}