package org.example.padroesComportamentais.templateMethod.concreteClass;

import org.example.padroesComportamentais.templateMethod.abstractClass.FileProcessor;

public class TxtFileProcessor extends FileProcessor {


    public TxtFileProcessor(String nomeArquivo, String texto) {
        super(nomeArquivo, texto);
    }

    @Override
    protected void tipoArquivo() {
        System.out.println("Tipo Arquivo TXT");
    }
}
