package com.testdev.interview.dp.gof.behavioral.memento;

/**
 * Created by Taipan on 02.07.2015.
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.setState(state);
        return memento;
    }

    public void setMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
