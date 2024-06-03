package br.edu.up.Controllers;

import br.edu.up.Models.Professor;

public class ProfessorController extends Controller<Professor> {
    private Professor[] professores = new Professor[100];
    private int count = 1;

    public int getCount() {
        return count;
    }

    @Override
    public void add(Professor professor) {
        professor.setMatricula(count);
        professores[count - 1] = professor;
        count++;
    }

    @Override
    public void update(Professor professor) {
        professores[professor.getMatricula() - 1] = professor;
    }

    @Override
    public void delete(Professor professor) {
        professores[professor.getMatricula() - 1] = null;
    }

    @Override
    public Professor get(int id) {
        return professores[id - 1];
    }
}
