package org.example.padroesComportamentais.mediator.mediator;

import org.example.padroesComportamentais.mediator.classes.Campo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UiPaisMediator implements Mediator {

    private List<Campo> campos = new ArrayList<Campo>();

    public void addCampo(Campo campo) {
        campos.add(campo);
    }

    @Override
    public void notificar(Campo campo ) {
        for (Campo c : campos) {
            if (Objects.equals(c.getTipo(), "estado")) {
                c.setVisibilidade(campo.getValor() != null);
            }
        }
    }
}
