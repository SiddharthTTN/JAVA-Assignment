package com.ques7;

public interface DefaultInterface {
    default void defaultMethod() {
        System.out.println("This is the default method of the Interface");
    }
}
