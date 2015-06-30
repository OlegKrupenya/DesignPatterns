package com.testdev.interview.dp.j2ee.presentation.front.controller;

/**
 * Created by oleh.krupenia on 6/30/2015.
 */
public class FrontControllerClient {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatch("home");
        frontController.dispatch("std");
    }
}
