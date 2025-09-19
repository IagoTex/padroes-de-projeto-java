package org.example.padroesEstruturais.bridge;

import org.example.padroesEstruturais.bridge.cores.CorAzul;
import org.example.padroesEstruturais.bridge.formas.Forma;
import org.example.padroesEstruturais.bridge.formas.Triangulo;

public class mainBridge {

    public static void main(String[] args) {

        Forma trianguloAzul = new Triangulo(new CorAzul());
        trianguloAzul.mostrar();
    }
}
