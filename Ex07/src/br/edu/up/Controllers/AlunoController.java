package br.edu.up.Controllers;

import br.edu.up.Models.Aluno;

public class AlunoController extends Controller<Aluno> {
    private Aluno[] alunos = new Aluno[100];
    private int currentId = 1;

    @Override
    public void add(Aluno aluno) {
        aluno.setMatricula(currentId);
        alunos[currentId - 1] = aluno;
        currentId++;
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
