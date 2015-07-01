package com.testdev.interview.dp.gof.structural.facade;

/**
 * Facade discusses encapsulating a complex subsystem within a single interface object
 * Created by oleh.krupenia on 7/1/2015.
 */
public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public void MethodA() {
        System.out.println("\nMethodA() ---- ");
        one.MethodOne();
        two.MethodTwo();
        four.MethodFour();
    }

    public void MethodB() {
        System.out.println("\nMethodB() ---- ");
        two.MethodTwo();
        three.MethodThree();
    }

    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.MethodA();
        facade.MethodB();
    }
}

// "Subsystem ClassA"
class SubSystemOne {
    public void MethodOne() {
        System.out.println(" SubSystemOne Method");
    }
}

// Subsystem ClassB"
class SubSystemTwo {
    public void MethodTwo() {
        System.out.println(" SubSystemTwo Method");
    }
}

// Subsystem ClassC"
class SubSystemThree {
    public void MethodThree() {
        System.out.println(" SubSystemThree Method");
    }
}

// Subsystem ClassD"
class SubSystemFour {
    public void MethodFour() {
        System.out.println(" SubSystemFour Method");
    }
}

