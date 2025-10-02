package org.example.padroesComportamentais.strategy.strategy;

import org.example.padroesComportamentais.strategy.context.Pedido;

public class FreteMarinho implements Frete {

    @Override
    public void calcular(Pedido pedido) {
        pedido.setValorTotal(pedido.getValorTotal() * 2);

    }
}
