package org.example.padroesComportamentais.observer.classes;

public class Livro extends Item {

    private String titulo;
    private String autor;
    private String editora;


    public Livro(String titulo, String autor, String editora, double preco, int estoque) {
        super(preco, estoque);
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
