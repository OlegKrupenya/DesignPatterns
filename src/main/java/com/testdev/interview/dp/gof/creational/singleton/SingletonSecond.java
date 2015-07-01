package com.testdev.interview.dp.gof.creational.singleton;

/**
 * Created by oleh.krupenia on 7/1/2015.
 */
public class SingletonSecond {

    private SingletonSecond() {}

    private static class SingletonHolder {
        private static final SingletonSecond instance = new SingletonSecond();
    }

    public static SingletonSecond getInstance() {
        return SingletonHolder.instance;
    }
}
