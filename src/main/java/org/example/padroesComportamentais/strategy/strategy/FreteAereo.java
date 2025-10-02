package org.example.padroesComportamentais.strategy.strategy;

import org.example.padroesComportamentais.strategy.context.Pedido;

public class FreteAereo implements Frete {

    @Override
    public void calcular(Pedido pedido) {
        pedido.setValorTotal(pedido.getValorTotal() * 3);

    }
}
