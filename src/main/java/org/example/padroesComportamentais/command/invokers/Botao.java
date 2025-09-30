package org.example.padroesComportamentais.command.invokers;

import org.example.padroesComportamentais.command.commands.Command;

public class Botao {

    private Command comando;

    public Botao(Command comando) {
        this.comando = comando;
    }

    public void click() {
        comando.executar();
    }
}
