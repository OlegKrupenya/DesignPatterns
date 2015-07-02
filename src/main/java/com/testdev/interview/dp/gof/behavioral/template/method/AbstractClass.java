package com.testdev.interview.dp.gof.behavioral.template.method;

/**
 * Created by oleh.krupenia on 7/2/2015.
 */
public abstract class AbstractClass {
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();
    // The "Template method"
    public void templateMethod()
    {
        primitiveOperation1();
        primitiveOperation2();
    }
}
