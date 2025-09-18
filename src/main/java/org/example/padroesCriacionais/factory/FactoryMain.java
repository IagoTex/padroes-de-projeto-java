package org.example.padroesCriacionais.factory;

import org.example.padroesCriacionais.factory.logistica.Logistica;
import org.example.padroesCriacionais.factory.logistica.LogisticaAerea;
import org.example.padroesCriacionais.factory.logistica.LogisticaMarinha;

public class FactoryMain {
    public static void main(String[] args) {

        //Logistica e a fabrica e a logisticaAerea e logisticaMarinha suas implementacoes que o cliente escolhe

        Logistica logistica = new LogisticaAerea();
        logistica.planejarEntrega();

        Logistica logisticaMarinha = new LogisticaMarinha();
        logisticaMarinha.planejarEntrega();
    }
}
