package com.testdev.interview.dp.j2ee.business.business.delegate;

/**
 * Reduces coupling between presentation and business services.
 * Created by oleh.krupenia on 6/30/2015.
 */
public class BusinessDelegate {
    private BusinessDelegateLookupService lookupService = new BusinessDelegateLookupService();
    public void doProcessing() {
        lookupService.getService().doProcessing();
    }
}
