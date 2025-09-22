package org.example.padroesEstruturais.proxy;

import org.example.padroesEstruturais.proxy.proxy.ImagemProxy;

import java.io.IOException;

public class proxyMain {
    public static void main(String[] args) throws IOException {

        ImagemProxy imagemProxy = new ImagemProxy("/home/iago/Development/padroes-de-projeto-java/cachorro.jpg");
        imagemProxy.display();
    }
}
