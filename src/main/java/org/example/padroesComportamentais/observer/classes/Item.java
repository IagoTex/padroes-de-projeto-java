package org.example.padroesComportamentais.observer.classes;

public abstract class Item {

    private double preco;
    private int estoque;

    public Item(double preco, int estoque) {
        this.preco = preco;
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
