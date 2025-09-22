package org.example.padroesEstruturais.facade.facade;

import org.example.padroesEstruturais.facade.arquivos.CreateFile;
import org.example.padroesEstruturais.facade.arquivos.WriteFile;

import java.io.IOException;

public class FacadeArquivos {


    private final CreateFile createFile = new CreateFile();
    private final WriteFile writeFile = new WriteFile();

    public FacadeArquivos() { }

    public void criarArquivoEEscreverTexto(String nomeArquivo ,String texto) throws IOException {

        createFile.createFile(nomeArquivo);
        writeFile.editarArquivo(nomeArquivo, texto);
    }


}
