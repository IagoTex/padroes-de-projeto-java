package org.example.padroesEstruturais.bridge.formas;

import org.example.padroesEstruturais.bridge.cores.Cor;

public abstract class Forma {

    private Cor cor;

    public Forma(Cor cor) {
        this.cor = cor;
    }

    public abstract void mostrar();

    public Cor getCor() {
        return cor;
    }
    public void setCor(Cor cor) {
        this.cor = cor;
    }
}
