package br.edu.up.Views;

import br.edu.up.Controllers.*;
import br.edu.up.Models.*;

public class View {
    private ProfessorController proC;
    private AlunoController aluC;
    private DisciplinaController disC;

    public View(ProfessorController proC, AlunoController aluC, DisciplinaController disC){
        this.proC = proC;
        this.aluC = aluC;
        this.disC = disC;
    }

    // Específico
    public void displayProfessor(int id){
        Professor professor = proC.get(id);
        if(professor != null) System.out.println(professor.toString());
        else{
            System.out.println("Professor não encontrado.");
        }
    }

    public void displayAluno(int id){
        Aluno aluno = aluC.get(id);
        if(aluno != null) System.out.println(aluno.toString());
        else{
            System.out.println("Aluno não encontrado.");
        }
    }

    public void displayDisciplina(int id){
        Disciplina disciplina = disC.get(id);
        if(disciplina != null) System.out.println(disciplina.toString());
        else{
            System.out.println("Disciplina não encontrada.");
        }
    }

    // Todos
    public void displayAllProfessores(){
        for (int i = 0; i < proC.getCount(); i++){
            Professor professor = proC.get(i+1);
            if(professor != null) System.out.println(professor.toString());
        }
    }
    public void displayAllAlunos(){
        for (int i = 0; i < aluC.getCount(); i++){
            Aluno aluno = aluC.get(i+1);
            if(aluno != null) System.out.println(aluno.toString());
        }
    }
    public void displayAllDisciplinas(){
        for (int i = 0; i < disC.getCount(); i++){
            Disciplina disciplina = disC.get(i+1);
            if(disciplina != null) System.out.println(disciplina.toString());
        }
    }
}
