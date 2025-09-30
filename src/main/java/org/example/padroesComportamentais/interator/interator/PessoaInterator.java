package org.example.padroesComportamentais.interator.interator;

import org.example.padroesComportamentais.interator.classes.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaInterator implements Interator<Pessoa> {


    private List<Pessoa> pessoas;

    private Integer posicao = 0;

    public PessoaInterator(List<Pessoa> pessoas) {
        this.pessoas = new ArrayList<Pessoa>(pessoas);
    }

    @Override
    public boolean hasNext() {
        return posicao < pessoas.size() && pessoas.get(posicao) != null;
    }

    @Override
    public Pessoa next() {
        return pessoas.get(posicao++);
    }
}
