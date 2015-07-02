package com.testdev.interview.dp.gof.behavioral.chain.of.responsibility;

/**
 * Created by oleh.krupenia on 7/2/2015.
 */
public class EvenHandler implements Handler {
    private Handler successor;

    @Override
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    @Override
    public void handleRequest(int req) {
        if (req % 2 == 0) {
            System.out.println(req + " has been handled in Even Handler");
        } else if (successor != null) {
            this.successor.handleRequest(req);
        }
    }
}
