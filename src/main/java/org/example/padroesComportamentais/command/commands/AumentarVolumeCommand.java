package org.example.padroesComportamentais.command.commands;

import org.example.padroesComportamentais.command.receiver.ControladorVolume;

public class AumentarVolumeCommand implements Command {

    private final ControladorVolume controladorVolume;

    public AumentarVolumeCommand(ControladorVolume controladorVolume) {
        this.controladorVolume = controladorVolume;
    }

    @Override
    public void executar() {
        controladorVolume.aumentarVolume();
    }
}
