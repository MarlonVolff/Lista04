package br.edu.up.Controllers;

import br.edu.up.Models.Aluno;

public class AlunoController extends Controller<Aluno> {
    private Aluno[] alunos = new Aluno[100];
    private int count = 1;

    public int getCount() {
        return count;
    }

    @Override
    public void add(Aluno aluno) {
        aluno.setMatricula(count);
        alunos[count - 1] = aluno;
        count++;
    }

    @Override
    public void update(Aluno aluno) {
        alunos[aluno.getMatricula() - 1] = aluno;
    }

    @Override
    public void delete(Aluno aluno) {
        alunos[aluno.getMatricula() - 1] = null;
    }

    @Override
    public Aluno get(int id) {
        return alunos[id - 1];
    }
}
