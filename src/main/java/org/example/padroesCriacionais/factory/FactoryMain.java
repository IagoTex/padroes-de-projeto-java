package org.example.padroesCriacionais.factory;

import org.example.padroesCriacionais.factory.logistica.Logistica;
import org.example.padroesCriacionais.factory.logistica.LogisticaAerea;
import org.example.padroesCriacionais.factory.logistica.LogisticaMarinha;

public class FactoryMain {
    public static void main(String[] args) {

        //Logistica e a fabrica e a logisticaAerea e logisticaMarinha suas implementacoes que o cliente escolhe

        System.out.println("==============LOGISTICA AÉRA===============");
        Logistica logisticaAerea = new LogisticaAerea();
        logisticaAerea.planejarEntrega();

        System.out.println("\n");

        System.out.println("==============LOGISTICA MARINHA===============");
        Logistica logisticaMarinha = new LogisticaMarinha();
        logisticaMarinha.planejarEntrega();
    }
}
