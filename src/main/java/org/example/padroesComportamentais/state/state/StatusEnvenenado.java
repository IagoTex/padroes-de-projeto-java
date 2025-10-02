package org.example.padroesComportamentais.state.state;

import org.example.padroesComportamentais.state.context.Personagem;

public class StatusEnvenenado implements StatusPersonagem {


    @Override
    public void aplicar(Personagem personagem) {
        personagem.setVida(personagem.getVida() - 50);

    }

    @Override
    public void retirar(Personagem personagem) {
        personagem.setVida(personagem.getVida());
    }
}
