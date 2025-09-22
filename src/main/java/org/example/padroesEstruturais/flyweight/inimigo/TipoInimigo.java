package org.example.padroesEstruturais.flyweight.inimigo;

public class TipoInimigo {

    private final String tipo;

    private final Integer vidaTotal;

    private final String cor;

    public TipoInimigo(String tipo, Integer vidaTotal, String cor) {
        this.tipo = tipo;
        this.vidaTotal = vidaTotal;
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public Integer getVidaTotal() {
        return vidaTotal;
    }

    public String getCor() {
        return cor;
    }
}
