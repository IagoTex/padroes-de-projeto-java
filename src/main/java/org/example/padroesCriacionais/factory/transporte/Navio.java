package org.example.padroesCriacionais.factory.transporte;

public class Navio implements Transporte{


    @Override
    public void entregar() {
        System.out.println("Entrega feita via navio");

    }
}
