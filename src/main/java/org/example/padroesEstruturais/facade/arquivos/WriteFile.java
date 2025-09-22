package org.example.padroesEstruturais.facade.arquivos;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public WriteFile() {
    }

    public void editarArquivo(String nomeArquivo, String texto) {
        try(FileWriter fileWriter = new FileWriter(nomeArquivo, true)) {
            fileWriter.write(texto);
            System.out.println("Arquivo editado com sucesso!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
