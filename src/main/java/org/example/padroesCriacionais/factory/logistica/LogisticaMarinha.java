package org.example.padroesCriacionais.factory.logistica;

import org.example.padroesCriacionais.factory.transporte.Navio;
import org.example.padroesCriacionais.factory.transporte.Transporte;

public class LogisticaMarinha extends Logistica {


    @Override
     Transporte criarTransporte() {
        return new Navio();
    }
}
