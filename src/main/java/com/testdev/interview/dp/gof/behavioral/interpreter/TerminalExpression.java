package com.testdev.interview.dp.gof.behavioral.interpreter;

/**
 * Created by oleh.krupenia on 7/2/2015.
 */
public class TerminalExpression implements AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("TerminalExpression.interpret");
    }
}
