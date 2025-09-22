package org.example.padroesEstruturais.flyweight;

import org.example.padroesEstruturais.flyweight.fabrica.TipoInimigoFactory;
import org.example.padroesEstruturais.flyweight.inimigo.Inimigo;
import org.example.padroesEstruturais.flyweight.inimigo.TipoInimigo;

public class mainFlyweight {

    public static void main(String[] args) {
        TipoInimigo orc = TipoInimigoFactory.getTipoInimigo("Orc", 100, "Verde");
        TipoInimigo orc1 = TipoInimigoFactory.getTipoInimigo("Orc", 100, "Verde");

        Inimigo inimigo = new Inimigo(100, orc);

        if (orc.equals(orc1)) System.out.println("Orc e orc1 são iguais");

        System.out.println(inimigo.getTipoInimigo().getTipo());

    }
}
