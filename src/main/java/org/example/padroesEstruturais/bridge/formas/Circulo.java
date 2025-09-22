package org.example.padroesEstruturais.bridge.formas;

import org.example.padroesEstruturais.bridge.cores.Cor;

public class Circulo extends Forma {


    public Circulo(Cor cor) {
        super(cor);
    }

    @Override
    public void mostrar() {
       System.out.println("Circulo "+ getCor().pintar());
    }
}
