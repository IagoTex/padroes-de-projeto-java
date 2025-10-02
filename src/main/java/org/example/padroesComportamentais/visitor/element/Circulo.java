package org.example.padroesComportamentais.visitor.element;

import org.example.padroesComportamentais.visitor.visitor.FormaVisitor;

public class Circulo implements Forma {

    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public void accept(FormaVisitor visitor) {
        visitor.visit(this);
    }
}
