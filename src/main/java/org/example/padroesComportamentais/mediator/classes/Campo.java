package org.example.padroesComportamentais.mediator.classes;

import org.example.padroesComportamentais.mediator.mediator.Mediator;
import org.example.padroesComportamentais.mediator.mediator.UiPaisMediator;

public class Campo {

    private String tipo;
    private String valor;
    private Boolean visibilidade;
    private Mediator mediator;

    public Campo(String tipo, String valor,  Boolean visibilidade, UiPaisMediator mediator) {
        this.tipo = tipo;
        this.valor = valor;
        this.visibilidade = visibilidade;
        this.mediator = mediator;
        mediator.addCampo(this);
    }

    public Campo() {
    }

    public String getTipo() {
        return tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Boolean getVisibilidade() {
        return visibilidade;
    }

    public void setVisibilidade(Boolean visibilidade) {
        this.visibilidade = visibilidade;
    }

    public Mediator getMediator() {
        return mediator;
    }

}
