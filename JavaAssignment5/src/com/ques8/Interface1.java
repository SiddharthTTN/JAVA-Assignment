package com.ques8;

public interface Interface1 {
    default void methodOfInterface() {
        System.out.println("This is default method of Interface 1");
    }

    void method1();
}
