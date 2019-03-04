package com.ques6;

public interface StaticAndDefault {
    default void defaultMethod() {
        System.out.println("This is the default Method of the Interface");
    }

    static void staticMethod() {
        System.out.println("This is the static method of the Interface");
    }

    void normalMethod();

}
