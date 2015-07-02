package com.testdev.interview.dp.gof.behavioral.chain.of.responsibility;

/**
 * Created by oleh.krupenia on 7/2/2015.
 */
public class ChainOfResponsibility {
    public static void main(String[] args) {
        Handler odd = new OddHandler();
        Handler even = new EvenHandler();
        odd.setSuccessor(even);
        odd.handleRequest(10);
        odd.handleRequest(12);
        odd.handleRequest(14);
        odd.handleRequest(15);
        odd.handleRequest(17);
        odd.handleRequest(19);
    }
}
