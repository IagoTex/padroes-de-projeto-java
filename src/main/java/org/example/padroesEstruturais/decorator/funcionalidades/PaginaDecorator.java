package org.example.padroesEstruturais.decorator.funcionalidades;

import org.example.padroesEstruturais.decorator.interfaces.Elemento;

public abstract class PaginaDecorator implements Elemento {

    protected Elemento elemento;

    public PaginaDecorator(Elemento elemento) {
        this.elemento = elemento;
    }

    @Override
    public void aplicar() {
        elemento.aplicar();
    }
}
