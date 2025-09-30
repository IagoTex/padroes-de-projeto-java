package org.example.padroesComportamentais.chainOfResponsability;

import org.example.padroesComportamentais.chainOfResponsability.classes.Diretor;
import org.example.padroesComportamentais.chainOfResponsability.classes.Funcionario;
import org.example.padroesComportamentais.chainOfResponsability.classes.Gerente;
import org.example.padroesComportamentais.chainOfResponsability.componente.Handler;

public class mainCOR {

    public static void main(String[] args) {


        Handler funcionario = new Funcionario();
        Handler gerente = new Gerente();
        Handler diretor = new Diretor();

        funcionario.setProximo(gerente);
        gerente.setProximo(diretor);

        funcionario.handleRequest(5500);
    }
}
