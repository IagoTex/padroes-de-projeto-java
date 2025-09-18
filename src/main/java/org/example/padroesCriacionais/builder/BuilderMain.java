package org.example.padroesCriacionais.builder;

import org.example.padroesCriacionais.builder.builders.PessoaBuilderImpl;
import org.example.padroesCriacionais.builder.classes.Pessoa;

public class BuilderMain {
    public static void main(String[] args) {

        //Com Spring Aqui seria PessoaBuilder com @Autowired
        Pessoa pessoa = new PessoaBuilderImpl()
                        .nome("Iago")
                        .cpf("094.070.116-23")
                        .idade(20)
                        .sexo("Masculino")
                        .altura(1.90)
                        .build();

        System.out.println(pessoa);
    }
}
