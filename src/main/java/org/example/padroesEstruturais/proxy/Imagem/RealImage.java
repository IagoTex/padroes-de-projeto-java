package org.example.padroesEstruturais.proxy.Imagem;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class RealImage implements Imagem {

    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() throws IOException {
        System.out.println("Abrindo o arquivo de imagem: "+  filename);
        loadFromDisk(filename);

    }

    public void loadFromDisk(String filename) throws IOException {
       java.awt.Desktop.getDesktop().open(new File(filename));
    }
}
