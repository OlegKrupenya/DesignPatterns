package com.testdev.interview.dp.j2ee.presentation.intercepting.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oleh.krupenia on 6/30/2015.
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();

    public void addFilter(Filter filter) {
        this.filters.add(filter);
    }

    public void processRequest(String request) {
        for (Filter filter : filters) {
            filter.execute(request);
        }
    }
}
