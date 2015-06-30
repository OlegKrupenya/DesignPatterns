package com.testdev.interview.dp.j2ee.presentation.intercepting.filter;

/**
 * Created by oleh.krupenia on 6/30/2015.
 */
public class AuthFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("AuthFilter.execute: " + request);
    }
}
