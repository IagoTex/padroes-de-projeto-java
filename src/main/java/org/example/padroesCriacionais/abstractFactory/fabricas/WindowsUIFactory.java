package org.example.padroesCriacionais.abstractFactory.fabricas;

import org.example.padroesCriacionais.abstractFactory.botoes.WindowsBtn;
import org.example.padroesCriacionais.abstractFactory.janelas.WindowsWindow;

public class WindowsUIFactory implements UIAbstractFactory {

    @Override
    public WindowsBtn criarBotao(String texto) {
        System.out.println("Acaba de ser criado um botao Windows com a label: " + texto);
        return new WindowsBtn(texto);
    }

    @Override
    public WindowsWindow criarJanela(String texto) {
        System.out.println("Acaba de ser criado uma Janela Linux com o title: " + texto);
        return new WindowsWindow(texto);
    }
}
