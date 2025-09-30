package org.example.padroesComportamentais.interpreter.expression.terminalExpression;

import org.example.padroesComportamentais.interpreter.expression.AbstractExpression;

public class TabelaSql implements AbstractExpression {

    private String nomeTabela;

    public TabelaSql(String nomeTabela) {
        this.nomeTabela = nomeTabela;
    }

    @Override
    public String interpretar() {
        return nomeTabela;
    }
}
