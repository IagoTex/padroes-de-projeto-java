package org.example.padroesCriacionais.abstractFactory;

import org.example.padroesCriacionais.abstractFactory.botoes.Btn;
import org.example.padroesCriacionais.abstractFactory.fabricas.LinuxUIFactory;
import org.example.padroesCriacionais.abstractFactory.fabricas.UIAbstractFactory;
import org.example.padroesCriacionais.abstractFactory.fabricas.WindowsUIFactory;
import org.example.padroesCriacionais.abstractFactory.janelas.Window;

public class MainAbstractFactory {
    public static void main(String[] args) {

        //Fábricas abstratas
        UIAbstractFactory fabricaLinux = new LinuxUIFactory();
        UIAbstractFactory fabricaWindows = new WindowsUIFactory();


        System.out.println("===============USANDO A FÁBRICA LINUX===============");
        Btn botaoLinux = fabricaLinux.criarBotao("Clicar");
        Window janelaLinux = fabricaLinux.criarJanela("Janela");

        System.out.println("\n");


        System.out.println("===============USANDO A FÁBRICA WINDOWS===============");
        Btn botaoWindows = fabricaWindows.criarBotao("Clicar");
        Window janelaWindows = fabricaWindows.criarJanela("Janela");

    }
}
