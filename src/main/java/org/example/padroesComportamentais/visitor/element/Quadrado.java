package org.example.padroesComportamentais.visitor.element;

import org.example.padroesComportamentais.visitor.visitor.FormaVisitor;

public class Quadrado implements Forma{

    public double largura, altura;

    public Quadrado(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public void accept(FormaVisitor visitor) {
        visitor.visit(this);
    }
}
