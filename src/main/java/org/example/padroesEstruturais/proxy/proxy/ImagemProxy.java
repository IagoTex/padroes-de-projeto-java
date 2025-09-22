package org.example.padroesEstruturais.proxy.proxy;

import org.example.padroesEstruturais.proxy.Imagem.Imagem;
import org.example.padroesEstruturais.proxy.Imagem.RealImage;

import java.io.IOException;

public class ImagemProxy implements Imagem {

    private final String filename;
    private volatile RealImage realImage;

    public ImagemProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() throws IOException {
        if (realImage == null) {
            synchronized (this) {
                if (realImage == null) {
                    realImage = new RealImage(filename);
                }
            }
        }
        realImage.display();
    }
}
