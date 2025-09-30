package org.example.padroesComportamentais.interpreter.expression.nonTerminalExpression;

import org.example.padroesComportamentais.interpreter.expression.AbstractExpression;

public class WhereSql implements AbstractExpression {

    private AbstractExpression coluna;

    private AbstractExpression valor;

    public WhereSql(AbstractExpression coluna, AbstractExpression valor) {
        this.coluna = coluna;
        this.valor = valor;
    }

    @Override
    public String interpretar() {
        return " Where " + coluna.interpretar() + " = " + valor.interpretar();
    }
}
