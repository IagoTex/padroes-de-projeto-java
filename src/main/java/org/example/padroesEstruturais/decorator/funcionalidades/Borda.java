package org.example.padroesEstruturais.decorator.funcionalidades;

import org.example.padroesEstruturais.decorator.interfaces.Elemento;

public class Borda extends PaginaDecorator{


    public Borda(Elemento elemento) {
        super(elemento);
    }

    @Override
    public void aplicar() {
        System.out.println("Borda aplicada");
        super.aplicar();
    }
}
