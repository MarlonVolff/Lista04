package br.edu.up.controllers;

import br.edu.up.models.Agenda;
import br.edu.up.models.Comercial;
import br.edu.up.models.Pessoal;

public class ControleAgenda {
    private Agenda agenda;

    public ControleAgenda() {
        this.agenda = new Agenda();
    }

    public void incluirContatoPessoal(int codigo, String nome, String telefone, String aniversario) {
        Pessoal pessoal = new Pessoal(codigo, nome, telefone, aniversario);
        agenda.getContatos().add(pessoal);
        System.out.println("Contatos: " + agenda.toString());
    }

    public void incluirContatoComercial(int codigo, String nome, String telefone, String cnpj) {
        Comercial comercial = new Comercial(codigo, nome, telefone, cnpj);
        agenda.getContatos().add(comercial);
        System.out.println("Contatos: " + agenda.toString());
    }
}