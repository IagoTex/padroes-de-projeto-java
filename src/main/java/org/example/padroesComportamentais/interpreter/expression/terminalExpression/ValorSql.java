package org.example.padroesComportamentais.interpreter.expression.terminalExpression;

import org.example.padroesComportamentais.interpreter.expression.AbstractExpression;

public class ValorSql implements AbstractExpression {

    private String valor;

    public ValorSql(String valor) {
        this.valor = valor;
    }

    @Override
    public String interpretar() {
        return "'" + valor + "'";
    }
}
