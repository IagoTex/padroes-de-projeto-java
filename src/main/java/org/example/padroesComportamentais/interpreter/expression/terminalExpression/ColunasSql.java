package org.example.padroesComportamentais.interpreter.expression.terminalExpression;

import org.example.padroesComportamentais.interpreter.expression.AbstractExpression;

public class ColunasSql implements AbstractExpression {

    private String nomeColuna;

    public ColunasSql(String nomeColuna) {
        this.nomeColuna = nomeColuna;
    }

    @Override
    public String interpretar() {
        return nomeColuna;
    }
}
