package org.example.padroesCriacionais.factory.logistica;

import org.example.padroesCriacionais.factory.transporte.Transporte;

public abstract class Logistica {

    abstract Transporte criarTransporte();

    public void planejarEntrega(){

        Transporte transporte = criarTransporte();
        transporte.entregar();
    }


}
