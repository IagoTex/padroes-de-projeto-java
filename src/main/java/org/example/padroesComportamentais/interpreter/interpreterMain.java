package org.example.padroesComportamentais.interpreter;


import org.example.padroesComportamentais.interpreter.expression.nonTerminalExpression.SelectSql;
import org.example.padroesComportamentais.interpreter.expression.nonTerminalExpression.WhereSql;
import org.example.padroesComportamentais.interpreter.expression.terminalExpression.ColunasSql;
import org.example.padroesComportamentais.interpreter.expression.terminalExpression.TabelaSql;
import org.example.padroesComportamentais.interpreter.expression.terminalExpression.ValorSql;

public class interpreterMain {

    public static void main(String[] args) {

        String expression = new SelectSql(new TabelaSql("Pessoa")).interpretar() + new WhereSql(new ColunasSql("nome"), new ValorSql("Iago")).interpretar();

        System.out.println(expression);
    }
}
