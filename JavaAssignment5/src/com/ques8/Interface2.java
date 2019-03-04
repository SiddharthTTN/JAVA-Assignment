package com.ques8;

public interface Interface2 {
    default void methodOfInterface() {
        System.out.println("This is default method of Interface 2");
    }

    void method2();
}
