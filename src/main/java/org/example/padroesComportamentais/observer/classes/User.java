package org.example.padroesComportamentais.observer.classes;

public class User {

    private String nome;
    private String email;

    private String cpf;
    public User(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
