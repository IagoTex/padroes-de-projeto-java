package org.example.padroesComportamentais.strategy.strategy;

import org.example.padroesComportamentais.strategy.context.Pedido;

public interface Frete {

    void calcular(Pedido pedido);
}
