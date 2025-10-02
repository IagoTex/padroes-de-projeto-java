package org.example.padroesComportamentais.state.state;

import org.example.padroesComportamentais.state.context.Personagem;

public class StatusSuperVelocidade implements StatusPersonagem {


    @Override
    public void aplicar(Personagem personagem) {
        personagem.setVelocidade(personagem.getVelocidade() * 2);

    }

    @Override
    public void retirar(Personagem personagem) {
        personagem.setVelocidade(4.6);

    }
}
