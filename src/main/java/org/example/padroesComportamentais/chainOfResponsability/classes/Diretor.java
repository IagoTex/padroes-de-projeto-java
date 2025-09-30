package org.example.padroesComportamentais.chainOfResponsability.classes;

import org.example.padroesComportamentais.chainOfResponsability.componente.Handler;

public class Diretor extends Handler {

    @Override
    public void handleRequest(Integer valor) {
        if(valor > 5000 ){
            System.out.println("Um diretor aprovou sua compra");
        }else{
            getProximo().handleRequest(valor);
        }
    }
}
