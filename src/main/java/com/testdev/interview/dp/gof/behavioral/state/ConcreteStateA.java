package com.testdev.interview.dp.gof.behavioral.state;

/**
 * Created by Taipan on 02.07.2015.
 */
public class ConcreteStateA implements State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
