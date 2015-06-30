package com.testdev.interview.dp.j2ee.presentation.intercepting.filter;

/**
 * Use Intercepting Filter to pre-process request and post-proc
 * Created by oleh.krupenia on 6/30/2015.
 */
public class InterceptingFilterClient {
    public static void main(String[] args) {
        FilterManager manager = new FilterManager();
        Target target = new Target();
        manager.setTarget(target);
        manager.processRequest("Simple request");
    }
}
