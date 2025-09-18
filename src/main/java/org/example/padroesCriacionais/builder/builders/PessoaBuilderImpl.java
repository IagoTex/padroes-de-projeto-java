package org.example.padroesCriacionais.builder.builders;

import org.example.padroesCriacionais.builder.classes.Pessoa;

public class PessoaBuilderImpl implements PessoaBuilder {

    private String nome;
    private int idade;
    private String sexo;
    private String cpf;
    private double altura;

    @Override
    public PessoaBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public PessoaBuilder idade(int idade) {
        this.idade = idade;
        return this;
    }

    @Override
    public PessoaBuilder sexo(String sexo) {
        this.sexo = sexo;
        return this;
    }

    @Override
    public PessoaBuilder cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    @Override
    public PessoaBuilder altura(double altura) {
        this.altura = altura;
        return this;
    }

    @Override
    public Pessoa build() {
        return new Pessoa(nome, idade, sexo, cpf, altura);
    }
}
