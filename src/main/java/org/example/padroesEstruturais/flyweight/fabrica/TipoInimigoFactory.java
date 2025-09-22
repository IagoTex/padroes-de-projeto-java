package org.example.padroesEstruturais.flyweight.fabrica;

import org.example.padroesEstruturais.flyweight.inimigo.TipoInimigo;

import java.util.HashMap;
import java.util.Map;

public class TipoInimigoFactory {

    private static final Map<String, TipoInimigo> tipoInimigos = new HashMap<String, TipoInimigo>();

    public static TipoInimigo getTipoInimigo(String tipoInimigo, Integer vidaTotal, String cor) {
        return tipoInimigos.computeIfAbsent(tipoInimigo, n-> {
            return new TipoInimigo(tipoInimigo, vidaTotal, cor);
        });
    }
}
