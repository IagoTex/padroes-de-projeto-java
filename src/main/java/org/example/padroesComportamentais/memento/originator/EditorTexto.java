package org.example.padroesComportamentais.memento.originator;

import org.example.padroesComportamentais.memento.memento.TextoMemento;

public class EditorTexto {

    private String texto;

    public EditorTexto(String texto) {
        this.texto = texto;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }

    public TextoMemento salvarTexto() {
        return new TextoMemento(texto);
    }

    public void restoreTexto(TextoMemento memento) {
        this.texto = memento.getTexto();
    }
}
