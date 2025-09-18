package org.example.padroesCriacionais.factory.logistica;

import org.example.padroesCriacionais.factory.transporte.Aviao;
import org.example.padroesCriacionais.factory.transporte.Transporte;

public class LogisticaAerea extends Logistica {

    @Override
    Transporte criarTransporte() {
        return new Aviao();
    }
}
