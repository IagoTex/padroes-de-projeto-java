package org.example.padroesComportamentais.state;

import org.example.padroesComportamentais.state.context.Personagem;
import org.example.padroesComportamentais.state.state.StatusSuperVelocidade;

public class stateMain {

    public static void main(String[] args) {

        Personagem personagem = new Personagem("Yasuo");
        System.out.println("O personagem " + personagem.getNome() +" está com a seguinte velocidade: " + personagem.getVelocidade());

        personagem.setStatusPersonagem(new StatusSuperVelocidade());

        personagem.aplicarStatus();

        System.out.println("O personagem " + personagem.getNome() +" está com a seguinte velocidade: " + personagem.getVelocidade());

        personagem.retirarStatus();

        System.out.println("O personagem " + personagem.getNome() +" está com a seguinte velocidade: " + personagem.getVelocidade());

    }
}
