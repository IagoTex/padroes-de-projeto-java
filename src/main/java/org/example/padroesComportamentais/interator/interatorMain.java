package org.example.padroesComportamentais.interator;

import org.example.padroesComportamentais.interator.aggregator.PessoaCollection;
import org.example.padroesComportamentais.interator.classes.Pessoa;
import org.example.padroesComportamentais.interator.interator.Interator;

import java.util.ArrayList;
import java.util.List;

public class interatorMain {

    public static void main(String[] args) {
        List<Pessoa> pessoaList = new ArrayList<>();
        pessoaList.add(new Pessoa("Pedro", 18));
        pessoaList.add(new Pessoa("Maria", 19));
        pessoaList.add(new Pessoa("Antonio", 20));
        pessoaList.add(new Pessoa("Carlos", 21));
        pessoaList.add(new Pessoa("Juan", 22));
        pessoaList.add(new Pessoa("Maria", 23));

        PessoaCollection pessoas = new PessoaCollection(pessoaList);

        Interator<Pessoa> interator = pessoas.getInterator();
        while (interator.hasNext()) {
            System.out.println(interator.next());
        }
    }


}
