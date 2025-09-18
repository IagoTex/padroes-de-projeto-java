package org.example.padroesCriacionais.abstractFactory;

import org.example.padroesCriacionais.abstractFactory.botoes.Btn;
import org.example.padroesCriacionais.abstractFactory.fabricas.LinuxUIFactory;
import org.example.padroesCriacionais.abstractFactory.fabricas.UIAbstractFactory;
import org.example.padroesCriacionais.abstractFactory.janelas.Window;

public class MainAbstractFactory {
    public static void main(String[] args) {

        UIAbstractFactory fabricaLinux = new LinuxUIFactory();

        Btn botao = fabricaLinux.criarBotao("Clicar");
        Window janela = fabricaLinux.criarJanela("Janela");

    }
}
