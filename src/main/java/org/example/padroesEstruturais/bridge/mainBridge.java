package org.example.padroesEstruturais.bridge;

import org.example.padroesEstruturais.bridge.cores.CorAzul;
import org.example.padroesEstruturais.bridge.cores.CorVermelha;
import org.example.padroesEstruturais.bridge.formas.Circulo;
import org.example.padroesEstruturais.bridge.formas.Forma;
import org.example.padroesEstruturais.bridge.formas.Triangulo;

public class mainBridge {

    public static void main(String[] args) {

        System.out.println("Feita a ponte: \n");
        Forma trianguloAzul = new Triangulo(new CorAzul());
        Forma circuloVermrlho = new Circulo(new CorVermelha());

        System.out.println("Objetos criados: \n");
        trianguloAzul.mostrar();
        circuloVermrlho.mostrar();
    }
}
