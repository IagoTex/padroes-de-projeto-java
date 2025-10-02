package org.example.padroesComportamentais.visitor.visitor;

import org.example.padroesComportamentais.visitor.element.Circulo;
import org.example.padroesComportamentais.visitor.element.Quadrado;

public class ExibidorFormaVisitor implements FormaVisitor {

    @Override
    public void visit(Circulo circulo) {
        System.out.println("Exibindo Circulo com " + circulo.getRaio() + " de Raio");
    }

    @Override
    public void visit(Quadrado quadrado) {
        System.out.println("Exibindo Quadrado com " + quadrado.getAltura() + " de altura e " + quadrado.getLargura() + " de largura");
    }
}
