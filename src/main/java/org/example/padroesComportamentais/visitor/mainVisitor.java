package org.example.padroesComportamentais.visitor;

import org.example.padroesComportamentais.visitor.element.Circulo;
import org.example.padroesComportamentais.visitor.element.Forma;
import org.example.padroesComportamentais.visitor.element.Quadrado;
import org.example.padroesComportamentais.visitor.visitor.CalculateAreaVisitor;
import org.example.padroesComportamentais.visitor.visitor.ExibidorFormaVisitor;
import org.example.padroesComportamentais.visitor.visitor.FormaVisitor;

public class mainVisitor {

    public static void main(String[] args) {

        Forma forma = new Circulo(5.5);
        Forma forma2 = new Quadrado(5.5, 5.5);

        FormaVisitor visitor = new CalculateAreaVisitor();
        FormaVisitor visitor2 = new ExibidorFormaVisitor();

        forma.accept(visitor);
        forma2.accept(visitor2);


    }
}
