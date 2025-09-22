package org.example.padroesEstruturais.composite.classes;

import org.example.padroesEstruturais.composite.interfaceComposite.Produto;

public class Item implements Produto {

    private Double preco;

    public Item(Double preco) {
        this.preco = preco;
    }

    @Override
    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
