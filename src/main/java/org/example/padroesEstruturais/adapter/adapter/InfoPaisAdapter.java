package org.example.padroesEstruturais.adapter.adapter;

import org.example.padroesEstruturais.adapter.api.ApiBrasil;

import java.io.IOException;

public class InfoPaisAdapter implements InfoPais{

    private final ApiBrasil apiBrasil = new ApiBrasil();

    @Override
    public String getNome(String idPais) throws IOException, InterruptedException {
        return apiBrasil.getNomePais(idPais);
    }
}
