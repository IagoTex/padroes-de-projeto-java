package org.example.padroesComportamentais.command;

import org.example.padroesComportamentais.command.commands.AumentarVolumeCommand;
import org.example.padroesComportamentais.command.invokers.Botao;
import org.example.padroesComportamentais.command.receiver.ControladorVolume;

public class mainCommand {

    public static void main(String[] args) {

        ControladorVolume controladorVolume = new ControladorVolume();

        Botao botao = new Botao(new AumentarVolumeCommand(controladorVolume));

        botao.click();
    }
}
