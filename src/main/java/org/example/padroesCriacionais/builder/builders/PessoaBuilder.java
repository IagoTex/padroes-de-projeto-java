package org.example.padroesCriacionais.builder.builders;

import org.example.padroesCriacionais.builder.classes.Pessoa;

public interface PessoaBuilder {

    PessoaBuilder nome(String nome);

    PessoaBuilder idade(int idade);

    PessoaBuilder sexo(String sexo);

    PessoaBuilder cpf(String cpf);

    PessoaBuilder altura (double altura);

    Pessoa build();
}
