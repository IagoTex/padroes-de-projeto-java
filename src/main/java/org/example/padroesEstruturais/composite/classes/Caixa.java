package org.example.padroesEstruturais.composite.classes;

import org.example.padroesEstruturais.composite.interfaceComposite.Produto;

import java.util.List;

public class Caixa implements Produto {

    private List<Produto> produtos;

    public Caixa(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public Double getPreco() {
        return produtos.stream().map(Produto::getPreco).reduce(0.0, Double::sum);
    }
}
