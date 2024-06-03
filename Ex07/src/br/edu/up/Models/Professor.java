package br.edu.up.Models;

public class Professor extends Pessoa {
    private int lattes;
    private Titulacao titulacao;

    public Professor(String nome, int lattes, Titulacao titulacao) {
        super(nome, "", 0);
        this.lattes = lattes;
        this.titulacao = titulacao;
    }

    public static class Titulacao {
        private String nomeInstituicao;
        private int anoConclusao;
        private String nomeTitulo;
        private String tituloTrabalhoConclusao;

        public Titulacao(String nomeInstituicao, int anoConclusao, String nomeTitulo, String tituloTrabalhoConclusao) {
            this.nomeInstituicao = nomeInstituicao;
            this.anoConclusao = anoConclusao;
            this.nomeTitulo = nomeTitulo;
            this.tituloTrabalhoConclusao = tituloTrabalhoConclusao;
        }

        public String getNomeInstituicao() {
            return nomeInstituicao;
        }

        public void setNomeInstituicao(String nomeInstituicao) {
            this.nomeInstituicao = nomeInstituicao;
        }

        public int getAnoConclusao() {
            return anoConclusao;
        }

        public void setAnoConclusao(int anoConclusao) {
            this.anoConclusao = anoConclusao;
        }

        public String getNomeTitulo() {
            return nomeTitulo;
        }

        public void setNomeTitulo(String nomeTitulo) {
            this.nomeTitulo = nomeTitulo;
        }

        public String getTituloTrabalhoConclusao() {
            return tituloTrabalhoConclusao;
        }

        public void setTituloTrabalhoConclusao(String tituloTrabalhoConclusao) {
            this.tituloTrabalhoConclusao = tituloTrabalhoConclusao;
        }

        @Override
        public String toString(){
            return "\nTitulação{" +
               "\n Nome Instituição: " + this.nomeInstituicao +
               "\n Ano Conclusão: " + this.anoConclusao +
               "\n Nome Título: " + this.nomeTitulo +
               "\n Título Trabalho Conclusão: " + this.tituloTrabalhoConclusao +
               "\n} ";
        }
        
    }

    public int getLattes() {
        return lattes;
    }

    public void setLattes(int lattes) {
        this.lattes = lattes;
    }

    public Titulacao getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString(){
        return "\nProfessor{" +
               "\n Lates: " + this.lattes +
               this.titulacao.toString() +
               "} ";
    }
    
}
