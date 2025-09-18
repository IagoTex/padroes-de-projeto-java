package org.example.padroesCriacionais.abstractFactory.fabricas;

import org.example.padroesCriacionais.abstractFactory.botoes.LinuxBtn;
import org.example.padroesCriacionais.abstractFactory.janelas.LinuxWindow;

public class LinuxUIFactory implements UIAbstractFactory {


    @Override
    public LinuxBtn criarBotao(String texto) {
        System.out.println("Acaba de ser criado um botao Linux com a label: " + texto);
        return new LinuxBtn(texto);

    }

    @Override
    public LinuxWindow criarJanela(String texto) {
        System.out.println("Acaba de ser criado uma Janela Linux com o title: " + texto);
        return new LinuxWindow(texto);
    }
}

