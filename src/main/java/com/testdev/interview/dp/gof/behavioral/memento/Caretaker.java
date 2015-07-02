package com.testdev.interview.dp.gof.behavioral.memento;

/**
 * Created by Taipan on 02.07.2015.
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
