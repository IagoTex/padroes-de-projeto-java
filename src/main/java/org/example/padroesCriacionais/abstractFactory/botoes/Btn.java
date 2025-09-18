package org.example.padroesCriacionais.abstractFactory.botoes;

public abstract class Btn {

    private String label;

    public Btn(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
