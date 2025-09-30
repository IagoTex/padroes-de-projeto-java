package org.example.padroesComportamentais.chainOfResponsability.componente;

public abstract class Handler {

    private Handler proximo;

    public Handler() { }


    public abstract void handleRequest(Integer valor );

    public Handler getProximo() {
        return proximo;
    }
    public void setProximo(Handler proximo) {
        this.proximo = proximo;
    }
}
