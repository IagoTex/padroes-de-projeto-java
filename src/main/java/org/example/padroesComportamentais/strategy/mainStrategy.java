package org.example.padroesComportamentais.strategy;

import org.example.padroesComportamentais.strategy.classes.Item;
import org.example.padroesComportamentais.strategy.context.Pedido;
import org.example.padroesComportamentais.strategy.strategy.Frete;
import org.example.padroesComportamentais.strategy.strategy.FreteAereo;
import org.example.padroesComportamentais.strategy.strategy.FreteMarinho;

import java.util.Arrays;
import java.util.List;

public class mainStrategy {

    public static void main(String[] args) {

        Item item = new Item(4.50);
        Item item2 = new Item(10.00);
        Item item3 = new Item(8.50);
        Item item4 = new Item(6.25);
        Item item5 = new Item(23.40);
        Item item6 = new Item(9.99);
        Item item7 = new Item(2.50);

        List<Item> itens = Arrays.asList(item, item2, item3, item4, item5, item6, item7);

        Frete freteAereo = new FreteAereo();
        Frete freteMarinho = new FreteMarinho();

        Pedido pedido = new Pedido(itens,freteAereo);
        Pedido pedido2 = new Pedido(itens,freteMarinho);

        pedido.calcularFrete();
        pedido2.calcularFrete();

        System.out.println("Valor total com frete aereo: " + pedido.getValorTotal());
        System.out.println("Valor total com frete marinho: " + pedido2.getValorTotal());
    }
}
