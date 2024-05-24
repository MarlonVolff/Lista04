package br.edu.up.controllers;

public class Ano {
    private int ano;
    private boolean bissexto;
    private Mes[] meses;
    private int count;

    public Ano(int ano, boolean bissexto){
        this.ano = ano;
        this.bissexto = bissexto;
    }

    public void adicionarMes(Mes mes){
        if(count < meses.length) meses[count++] = mes;
    }

    public void excluirCompromisso(String nomeMes, int diaMes, int hora){
        for(int i = 1; i <= count; i++){
            if(meses[i].getNome() == nomeMes) meses[i].excluirCompromisso(diaMes, hora);
        }
    }

    public String listarComprimissos(String nomeMes){
        String temp = ano + "\n";
        for(int i = 0; i <= count; i++){
            if(meses[i].getNome() == nomeMes) temp += meses[i].listarCompromissos();
        }
        return temp;
    }

    public String listarComprimissos(){
        String temp = ano + "\n";
        for(int i = 1; i <= count; i++){
            temp += meses[i].listarCompromissos();
        }
        return temp;
    }
}
