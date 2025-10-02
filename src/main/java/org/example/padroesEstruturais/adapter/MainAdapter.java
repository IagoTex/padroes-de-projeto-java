package org.example.padroesEstruturais.adapter;

import org.example.padroesEstruturais.adapter.adapter.InfoPais;
import org.example.padroesEstruturais.adapter.adapter.InfoPaisAdapter;

import java.io.IOException;

public class MainAdapter {

    public static void main(String[] args) throws IOException, InterruptedException {

        InfoPais infoPais = new InfoPaisAdapter();

        String nomePais = infoPais.getNome(76);

        System.out.println("Fazendo a chamada da API pelo adapter... \n");

        System.out.println("Nome do país: " + nomePais);
    }
}
