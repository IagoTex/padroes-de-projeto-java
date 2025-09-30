package org.example.padroesComportamentais.chainOfResponsability.classes;

import org.example.padroesComportamentais.chainOfResponsability.componente.Handler;

public class Gerente extends Handler {

    @Override
    public void handleRequest(Integer valor) {
        if(valor > 1500 && valor < 5000){
            System.out.println("Um gerente aprovou sua compra");
        }else{
            getProximo().handleRequest(valor);
        }
    }
}
