package com.testdev.interview.dp.gof.behavioral.memento;

/**
 * Created by Taipan on 02.07.2015.
 */
public class MementoApp {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("State1");
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.setState("State2");
        System.out.println(originator.getState());
        originator.setMemento(caretaker.getMemento());
        System.out.println(originator.getState());
    }
}
