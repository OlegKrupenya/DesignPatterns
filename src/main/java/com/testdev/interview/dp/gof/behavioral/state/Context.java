package com.testdev.interview.dp.gof.behavioral.state;

/**
 * Created by Taipan on 02.07.2015.
 */
public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        System.out.println(state);
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }
}
