package com.testdev.interview.dp.gof.behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * Specifies how to evaluate sentences in a language
 * Created by oleh.krupenia on 7/2/2015.
 */
public class Interpreter {
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> expressions = new ArrayList<>();
        expressions.add(new TerminalExpression());
        expressions.add(new NonTerminalExpression());
        for (AbstractExpression expression : expressions) {
            expression.interpret(context);
        }
    }
}
