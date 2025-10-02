package org.example.padroesComportamentais.state.state;

import org.example.padroesComportamentais.state.context.Personagem;

public interface StatusPersonagem {

    void aplicar(Personagem personagem);

    void retirar(Personagem personagem);


}
