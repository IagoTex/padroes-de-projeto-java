package org.example.padroesCriacionais.prototype.classes;

import org.example.padroesCriacionais.prototype.prototipo.Prototype;

public class Predio implements Prototype<Predio> {

    private int andares;
    private int quartosPorAndar;
    private String bloco;

    public Predio(int andares, int quartosPorAndar, String bloco) {
        this.andares = andares;
        this.quartosPorAndar = quartosPorAndar;
        this.bloco = bloco;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public int getQuartosPorAndar() {
        return quartosPorAndar;
    }

    public void setQuartosPorAndar(int quartosPorAndar) {
        this.quartosPorAndar = quartosPorAndar;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    @Override
    public Predio copy() {
        return new Predio(this.andares, this.quartosPorAndar, this.bloco);
    }
}
