package org.example.padroesComportamentais.memento.caretaker;

import org.example.padroesComportamentais.memento.memento.TextoMemento;
import org.example.padroesComportamentais.memento.originator.EditorTexto;

import java.util.Stack;

public class Historico {

    private Stack<TextoMemento> texto = new Stack<TextoMemento>();

    public void salvarEstado(EditorTexto editorTexto) {
        texto.push(editorTexto.salvarTexto());
    }

    public void desfazer(EditorTexto editorTexto) {
        if (!texto.isEmpty()) {
            editorTexto.restoreTexto(texto.pop());
        }
    }
}
