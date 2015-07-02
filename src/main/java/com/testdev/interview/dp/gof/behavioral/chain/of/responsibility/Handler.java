package com.testdev.interview.dp.gof.behavioral.chain.of.responsibility;

/**
 * Created by oleh.krupenia on 7/2/2015.
 */
public interface Handler {
    void setSuccessor(Handler successor);
    void handleRequest(int req);
}
