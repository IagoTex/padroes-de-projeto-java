package org.example.padroesComportamentais.interpreter.expression.nonTerminalExpression;

import org.example.padroesComportamentais.interpreter.expression.AbstractExpression;

public class SelectSql implements AbstractExpression {

    private AbstractExpression right;

    public SelectSql(AbstractExpression right) {
        this.right = right;
    }

    @Override
    public String interpretar() {
        return "Select * from " + right.interpretar();
    }
}
