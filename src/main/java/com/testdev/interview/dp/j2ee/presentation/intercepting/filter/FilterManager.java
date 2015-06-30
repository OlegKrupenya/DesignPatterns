package com.testdev.interview.dp.j2ee.presentation.intercepting.filter;

/**
 * Created by oleh.krupenia on 6/30/2015.
 */
public class FilterManager {
    private FilterChain filterChain;
    private Target target;

    public FilterManager() {
        this.filterChain = new FilterChain();
        this.filterChain.addFilter(new AuthFilter());
        this.filterChain.addFilter(new DebugFilter());
    }

    public FilterChain getFilterChain() {
        return filterChain;
    }

    public void setFilterChain(FilterChain filterChain) {
        this.filterChain = filterChain;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void processRequest(String request) {
        this.filterChain.processRequest(request);
        this.target.execute(request);
    }
}
