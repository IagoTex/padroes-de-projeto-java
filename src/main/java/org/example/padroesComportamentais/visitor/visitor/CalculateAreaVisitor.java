package org.example.padroesComportamentais.visitor.visitor;

import org.example.padroesComportamentais.visitor.element.Circulo;
import org.example.padroesComportamentais.visitor.element.Quadrado;

public class CalculateAreaVisitor implements FormaVisitor {


    @Override
    public void visit(Circulo circulo) {
       double raio = Math.PI * circulo.getRaio() * circulo.getRaio();
       System.out.println(raio);
    }

    @Override
    public void visit(Quadrado quadrado) {
        double area = quadrado.getAltura() * quadrado.getAltura();
        System.out.println(area);
    }
}
