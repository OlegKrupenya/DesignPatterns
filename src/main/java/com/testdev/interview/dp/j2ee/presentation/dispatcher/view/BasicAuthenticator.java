package com.testdev.interview.dp.j2ee.presentation.dispatcher.view;

import com.sun.net.httpserver.Authenticator;
import com.sun.net.httpserver.HttpExchange;

/**
 * Created by oleh.krupenia on 6/30/2015.
 */
public class BasicAuthenticator extends Authenticator {
    public BasicAuthenticator() {
        super();
    }

    @Override
    public Result authenticate(HttpExchange httpExchange) {
        return null;
    }
}
