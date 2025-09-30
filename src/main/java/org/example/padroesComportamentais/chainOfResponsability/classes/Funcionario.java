package org.example.padroesComportamentais.chainOfResponsability.classes;

import org.example.padroesComportamentais.chainOfResponsability.componente.Handler;

public class Funcionario extends Handler {

    @Override
    public void handleRequest(Integer valor) {
        if (valor < 1500){
            System.out.println("Um Funcionário aprovou sua compra!");
        }else{
           getProximo().handleRequest(valor);
        }
    }
}
