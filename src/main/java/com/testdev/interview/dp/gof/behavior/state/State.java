package com.testdev.interview.dp.gof.behavior.state;

/**
 * Alter an object's behavior when its state changes
 * Created by Taipan on 02.07.2015.
 */
public interface State {
    void handle(Context context);
}
