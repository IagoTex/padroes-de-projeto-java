package org.example.padroesEstruturais.facade;

import org.example.padroesEstruturais.facade.facade.FacadeArquivos;

import java.io.IOException;

public class FacadeMain {
    public static void main(String[] args) throws IOException {

        FacadeArquivos facadeArquivos = new FacadeArquivos();

        facadeArquivos.criarArquivoEEscreverTexto("texto.txt", "Olá, tudo bem?");
    }
}
