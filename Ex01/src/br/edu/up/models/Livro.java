package br.edu.up.models;

public class Livro {
    private String codigo;
    private String titulo;
    private String[] autores;
    private String isbn;
    private int ano;

    public Livro(String cod, String tit, String[] aut, String isbn, int ano) {
        this.codigo = cod;
        this.titulo = tit;
        this.autores = aut;
        this.isbn = isbn;
        this.ano = ano;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String[] getAutores() {
        return autores;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
