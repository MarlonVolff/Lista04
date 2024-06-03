import br.edu.up.Controllers.*;
import br.edu.up.Models.*;
import br.edu.up.Views.*;

public class App {
    public static void main(String[] args) throws Exception {
        ProfessorController professorController = new ProfessorController();
        AlunoController alunoController = new AlunoController();
        DisciplinaController disciplinaController = new DisciplinaController();

        // Criar e adicionar um professor
        Professor.Titulacao titulacao = new Professor.Titulacao("Universidade ABC", 2018, "Mestrado em Química", "Pesquisa sobre Reações Orgânicas");
        Professor professor = new Professor("Dr. João Silva", 123456, titulacao);
        professorController.add(professor);

        // Criar e adicionar alunos
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Alice");
        aluno1.setAnoIngressao(2020);
        aluno1.setNomeCurso("Química");
        aluno1.setTurno("Matutino");
        alunoController.add(aluno1);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Bob");
        aluno2.setAnoIngressao(2021);
        aluno2.setNomeCurso("Química");
        aluno2.setTurno("Noturno");
        alunoController.add(aluno2);

        // Criar e adicionar uma disciplina
        Disciplina disciplina = new Disciplina();
        disciplina.setNome("Química Orgânica");
        disciplina.setCurriculo("Estudo avançado das reações orgânicas.");
        disciplina.setCompetencia(80);
        disciplina.setProfessor(professor);
        disciplina.setAlunos(new Aluno[]{aluno1, aluno2});
        disciplinaController.add(disciplina);

        // Criar a view
        View view = new View(professorController, alunoController, disciplinaController);

        // Exibir informações
        view.displayProfessor(1);
        view.displayAluno(1);
        view.displayDisciplina(1);
        view.displayAllProfessores();
        view.displayAllAlunos();
        view.displayAllDisciplinas();
        
    }
}
