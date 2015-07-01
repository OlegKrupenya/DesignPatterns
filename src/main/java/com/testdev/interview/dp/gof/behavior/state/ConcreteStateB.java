package com.testdev.interview.dp.gof.behavior.state;

/**
 * Created by Taipan on 02.07.2015.
 */
public class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
