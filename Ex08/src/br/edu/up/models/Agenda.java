package br.edu.up.models;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> contatos = new ArrayList<Contato>();
    public List<Contato> getContatos(int codigo) {
        return contatos;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    // @Override
    // public String toString() {
    //     for(Contato c: contatos){
    //         System.out.println(c);
    //     }
    //     return "";
    // }
    @Override
public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    for (Contato contato : contatos) {
        stringBuilder.append(contato.toString()).append("\n");
    }
    return stringBuilder.toString();
}
}
