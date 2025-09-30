package org.example.padroesComportamentais.interator.aggregator;

import org.example.padroesComportamentais.interator.classes.Pessoa;
import org.example.padroesComportamentais.interator.interator.Interator;
import org.example.padroesComportamentais.interator.interator.PessoaInterator;

import java.util.List;

public class PessoaCollection implements Aggregator<Pessoa> {

    private List<Pessoa> pessoas;

    public PessoaCollection(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public void addPessoa(Pessoa pessoa){
        this.pessoas.add(pessoa);
    }

    @Override
    public Interator<Pessoa> getInterator() {
        return new PessoaInterator(pessoas);
    }
}
