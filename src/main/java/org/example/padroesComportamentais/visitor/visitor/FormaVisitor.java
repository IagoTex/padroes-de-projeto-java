package org.example.padroesComportamentais.visitor.visitor;

import org.example.padroesComportamentais.visitor.element.Circulo;
import org.example.padroesComportamentais.visitor.element.Quadrado;

public interface FormaVisitor {

    void visit(Circulo circulo);
    void visit(Quadrado quadrado);
}
