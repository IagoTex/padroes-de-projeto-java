package org.example.padroesEstruturais.facade.arquivos;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

    public CreateFile() {
    }

    public void createFile(String nomeArquivo) throws IOException {
        try(FileWriter fileWriter = new FileWriter(nomeArquivo)) {
            System.out.println("Arquivo criado com sucesso!");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
