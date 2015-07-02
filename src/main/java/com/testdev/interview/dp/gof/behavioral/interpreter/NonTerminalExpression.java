package com.testdev.interview.dp.gof.behavioral.interpreter;

/**
 * Created by oleh.krupenia on 7/2/2015.
 */
public class NonTerminalExpression implements AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("NonTerminalExpression.interpret");
    }
}
