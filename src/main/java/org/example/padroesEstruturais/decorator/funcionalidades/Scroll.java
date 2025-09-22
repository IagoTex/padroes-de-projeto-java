package org.example.padroesEstruturais.decorator.funcionalidades;

import org.example.padroesEstruturais.decorator.interfaces.Elemento;

public class Scroll  extends PaginaDecorator{

    public Scroll(Elemento elemento) {
        super(elemento);
    }

    @Override
    public void aplicar() {
        System.out.println("Scroll aplicado");
        super.aplicar();
    }
}
