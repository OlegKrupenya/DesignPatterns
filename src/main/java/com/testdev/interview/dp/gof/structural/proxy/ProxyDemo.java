package com.testdev.interview.dp.gof.structural.proxy;

/**
 * Provides a surrogate or placeholder for another object to control access to it.
 * Created by oleh.krupenia on 7/1/2015.
 */
public class ProxyDemo {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        Subject proxy = new Proxy(realSubject);
        proxy.operation();
    }
}
