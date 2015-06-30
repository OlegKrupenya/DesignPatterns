package com.testdev.interview.dp.j2ee.business.service.locator;

/**
 * The service locator design pattern is used when we want to locate various services using JNDI lookup
 * Created by oleh.krupenia on 6/30/2015.
 */
public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName){

        Service service = cache.getService(jndiName);

        if(service != null){
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = (Service)context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }
}
