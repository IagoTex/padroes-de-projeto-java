package org.example.padroesComportamentais.strategy.context;

import org.example.padroesComportamentais.strategy.classes.Item;
import org.example.padroesComportamentais.strategy.strategy.Frete;

import java.util.List;

public class Pedido {

    private List<Item> itens;

    private Double valorTotal;

    private Frete frete;

    public Pedido(List<Item> itens, Frete frete) {
        this.itens = itens;
        this.frete = frete;
        this.valorTotal = calcularValorTotal();
    }

    private Double calcularValorTotal() {
        Double total = 0.0;
        for (Item item : itens) {
            total += item.getValor();
        }
        return total;
    }

    public void calcularFrete() {
        frete.calcular(this);
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }
}
