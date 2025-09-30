package org.example.padroesComportamentais.command.commands;

import org.example.padroesComportamentais.command.receiver.ControladorVolume;

public class DiminuirVolumeCommand implements Command {

    private final ControladorVolume controladorVolume;

    public DiminuirVolumeCommand(ControladorVolume controladorVolume) {
        this.controladorVolume = controladorVolume;
    }

    @Override
    public void executar() {
        controladorVolume.diminuirVolume();

    }
}
