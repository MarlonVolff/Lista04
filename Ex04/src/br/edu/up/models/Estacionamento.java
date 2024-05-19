package br.edu.up.Controllers.models;

public class Estacionamento {
    private Vaga[] vagas;
    private int cont;
    private int totalVagas = 10;
    private int vagaDisponivel;


    public Estacionamento() {
        this.vagas = new Vaga[totalVagas];
        incializarVagas();
    }
    public void incializarVagas(){
        for (int i = 0; i < vagas.length; i++) {
            System.out.println("Vaga: " + (i + 1) + ": " + vagas[i]);
        }
    }

    public Vaga getVagas(int i) {
        return vagas[i];
    }
    public int getTotalVagas() {
        return totalVagas;
    }
    public Vaga[] getVagas() {
        return vagas;
    }

    public int encontrarVagaDisponivel() {
        for (int i = 0; i < totalVagas; i++) {
            if (!vagas[i].ocupada()) { 
                this.vagaDisponivel = i;
                return i;
            }
        }
        return -1;
    }
    public int verificarPlaca(String placa){
        for(int i = 0; i < totalVagas; i++) {
            if (vagas[i].getCarroPlaca() != null && vagas[i].getCarroPlaca().equals(placa)) {
                return i;
            }
        }
        return -1;
    }
    
    public void removerCarro(int vagaOcupada) {
        vagas[vagaOcupada].removerCarro();
    }
    public int getVagaDisponivel() {
        return vagaDisponivel;
    }

    
    
}
