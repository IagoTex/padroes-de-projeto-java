package org.example.padroesEstruturais.flyweight.inimigo;

public class Inimigo {

    private Integer level;

    private Integer vidaAtual;

    private TipoInimigo tipoInimigo;

    public Inimigo(Integer level, TipoInimigo tipoInimigo) {
        this.level = level;
        this.tipoInimigo = tipoInimigo;
        this.vidaAtual = tipoInimigo.getVidaTotal();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getVidaAtual() {
        return vidaAtual;
    }

    public void setVidaAtual(Integer vidaAtual) {
        this.vidaAtual = vidaAtual;
    }

    public TipoInimigo getTipoInimigo() {
        return tipoInimigo;
    }

    public void setTipoInimigo(TipoInimigo tipoInimigo) {
        this.tipoInimigo = tipoInimigo;
    }
}
