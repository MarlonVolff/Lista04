package br.edu.up.Controllers;

import br.edu.up.Models.Disciplina;

public class DisciplinaController extends Controller<Disciplina> {
    private Disciplina[] disciplinas = new Disciplina[100];
    private int currentId = 1;

    @Override
    public void add(Disciplina disciplina) {
        disciplinas[currentId - 1] = disciplina;
        currentId++;
    }

    @Override
    public void update(Disciplina disciplina) {
        for (int i = 0; i < disciplinas.length; i++) {
            if (disciplinas[i] != null && disciplinas[i].getNome().equals(disciplina.getNome())) {
                disciplinas[i] = disciplina;
                return;
            }
        }
    }

    @Override
    public void delete(Disciplina disciplina) {
        for (int i = 0; i < disciplinas.length; i++) {
            if (disciplinas[i] != null && disciplinas[i].getNome().equals(disciplina.getNome())) {
                disciplinas[i] = null;
                return;
            }
        }
    }

    @Override
    public Disciplina get(int id) {
        return disciplinas[id - 1];
    }

    public Disciplina getByName(String nome) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina != null && disciplina.getNome().equals(nome)) {
                return disciplina;
            }
        }
        return null;
    }
}