package org.example.padroesCriacionais.abstractFactory.fabricas;

import org.example.padroesCriacionais.abstractFactory.botoes.Btn;
import org.example.padroesCriacionais.abstractFactory.janelas.Window;

public interface UIAbstractFactory {

    Btn criarBotao(String texto);

    Window criarJanela(String texto);
}
