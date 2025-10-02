package org.example.padroesEstruturais.bridge.formas;

import org.example.padroesEstruturais.bridge.cores.Cor;

public class Triangulo extends Forma {


    public Triangulo(Cor cor) {
        super(cor);
    }

    @Override
    public void mostrar() {
        System.out.println("Triângulo "+getCor().pintar());
    }
}
