package org.example.padroesEstruturais.composite;

import org.example.padroesEstruturais.composite.classes.Caixa;
import org.example.padroesEstruturais.composite.classes.Item;
import org.example.padroesEstruturais.composite.interfaceComposite.Produto;

import java.util.ArrayList;
import java.util.List;

public class mainComposite {
    public static void main(String[] args) {

        Item item = new Item(30.0);
        Item item2 = new Item(25.0);
        Item item3 = new Item(20.0);
        Item item4 = new Item(10.0);
        Item item5 = new Item(5.0);

        List<Produto> items = new ArrayList<>();
        items.add(item);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);

        Caixa caixa = new Caixa(items);

        System.out.println("Preço item 1 = " + item.getPreco());
        System.out.println("Preço item 3 = " + item3.getPreco());
        System.out.println("Preço item 5 = " + item5.getPreco());
        System.out.println("Preço caixa com todos os itens = " + caixa.getPreco());

    }
}
