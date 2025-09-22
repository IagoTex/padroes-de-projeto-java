package org.example.padroesEstruturais.decorator;

import org.example.padroesEstruturais.decorator.funcionalidades.Borda;
import org.example.padroesEstruturais.decorator.funcionalidades.Scroll;
import org.example.padroesEstruturais.decorator.interfaces.Elemento;
import org.example.padroesEstruturais.decorator.pagina.Pagina;

public class mainDecorator {

    public static void main(String[] args) {

        Elemento elemento = Pagina.criarPagina("Texto");

        elemento = new Borda(elemento);

        elemento = new Scroll(elemento);

        elemento.aplicar();
    }
}
