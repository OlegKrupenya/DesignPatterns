package com.testdev.interview.dp.gof.behavior.visitor;

/**
 * Created by Taipan on 01.07.2015.
 */
public interface Element {
    void accept(Visitor visitor);
}
