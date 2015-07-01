package com.testdev.interview.dp.gof.creational.singleton;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class SingletonFirst {
    private static volatile SingletonFirst _instance;

    private SingletonFirst() {}

    public static SingletonFirst getInstance() {
        SingletonFirst instance = null;
        if (_instance != null) {
            synchronized (SingletonFirst.class) {
                if (_instance != null) {
                    _instance = new SingletonFirst();
                    instance = _instance;
                }
            }
        }
        return instance;
    }
}
