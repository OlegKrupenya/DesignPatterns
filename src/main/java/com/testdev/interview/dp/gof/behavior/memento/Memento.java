package com.testdev.interview.dp.gof.behavior.memento;

/**
 * Capture and restore an object's internal state
 * Created by Taipan on 02.07.2015.
 */
public class Memento {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
