package org.example.padroesEstruturais.decorator.pagina;

import org.example.padroesEstruturais.decorator.interfaces.Elemento;

public  class Pagina implements Elemento {

    private String texto;

    private Pagina(String texto) {
        this.texto = texto;
    }

    public static Pagina criarPagina(String texto) {
        return new Pagina(texto);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public void aplicar() {
        System.out.println("Aplicando página com o texto "+ texto );
    }
}
