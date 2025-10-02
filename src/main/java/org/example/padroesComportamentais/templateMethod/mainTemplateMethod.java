package org.example.padroesComportamentais.templateMethod;

import org.example.padroesComportamentais.templateMethod.abstractClass.FileProcessor;
import org.example.padroesComportamentais.templateMethod.concreteClass.TxtFileProcessor;

import java.io.IOException;

public class mainTemplateMethod {

    public static void main(String[] args) throws IOException {

        FileProcessor fp = new TxtFileProcessor("texto.txt", "Olá, meu nome é Iago Teixeira Dinossauro");
        fp.processarArquivo();
    }
}
