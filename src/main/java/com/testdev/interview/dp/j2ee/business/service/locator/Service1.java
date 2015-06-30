package com.testdev.interview.dp.j2ee.business.service.locator;

/**
 * Created by oleh.krupenia on 6/30/2015.
 */
public class Service1 implements Service {
    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}