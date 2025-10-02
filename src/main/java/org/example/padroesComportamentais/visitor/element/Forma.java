package org.example.padroesComportamentais.visitor.element;

import org.example.padroesComportamentais.visitor.visitor.FormaVisitor;

public interface Forma {

    void accept(FormaVisitor visitor);
}
