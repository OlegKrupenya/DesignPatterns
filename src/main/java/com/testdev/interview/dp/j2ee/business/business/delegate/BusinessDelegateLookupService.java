package com.testdev.interview.dp.j2ee.business.business.delegate;

/**
 * Created by oleh.krupenia on 6/30/2015.
 */
public class BusinessDelegateLookupService {
    public Service getService() {
        return new BusinessService1();
    }
}
