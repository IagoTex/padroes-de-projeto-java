package org.example.padroesComportamentais.memento;

import org.example.padroesComportamentais.memento.caretaker.Historico;
import org.example.padroesComportamentais.memento.originator.EditorTexto;

public class mementoMain {

    public static void main(String[] args) {

        EditorTexto editorTexto = new EditorTexto("Olá Iago");
        Historico historico = new Historico();

        historico.salvarEstado(editorTexto);

        System.out.println(editorTexto.getTexto());

        editorTexto.setTexto("Ola Iury");

        System.out.println(editorTexto.getTexto());

        historico.desfazer(editorTexto);

        System.out.println(editorTexto.getTexto());


    }
}
