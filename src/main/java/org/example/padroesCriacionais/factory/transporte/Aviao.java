package org.example.padroesCriacionais.factory.transporte;

public class Aviao implements Transporte {

    @Override
    public void entregar() {
        System.out.println("Entrega feita via Aviao");
    }
}
