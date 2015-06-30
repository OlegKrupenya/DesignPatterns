package com.testdev.interview.dp.j2ee.presentation.front.controller;

/**
 * FrontController is a simgle entry point to all types of requests to the application
 *
 * Created by oleh.krupenia on 6/30/2015.
 */
public class FrontController {
    private View homeView = new HomeView();
    private View studentsView = new StudentView();

    public void dispatch(String request) {
        if ("HOME".equalsIgnoreCase(request)) {
            homeView.execute();
        } else {
            studentsView.execute();
        }
    }
}
