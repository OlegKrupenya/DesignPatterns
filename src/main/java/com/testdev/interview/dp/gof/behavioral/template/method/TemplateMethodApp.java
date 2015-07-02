package com.testdev.interview.dp.gof.behavioral.template.method;

/**
 * Defer the exact steps of an algorithm to a subclass
 * Created by oleh.krupenia on 7/2/2015.
 */
public class TemplateMethodApp {
    public static void main(String[] args) {
        AbstractClass a = new ConcreteClassA();
        AbstractClass b = new ConcreteClassB();
        a.templateMethod();
        b.templateMethod();
    }
}
