package com.testdev.interview.dp.j2ee.business.business.delegate;

/**
 * Created by oleh.krupenia on 6/30/2015.
 */
public class BusinessDelegateClient {
    public static void main(String[] args) {
        BusinessDelegate delegate = new BusinessDelegate();
        delegate.doProcessing();
    }
}
