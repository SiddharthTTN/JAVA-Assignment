package com.ques8;

public class MultipleInheritanceClass implements Interface1, Interface2 {
    public void methodOfInterface() {
        System.out.println("This is the Overridden defualt method from both the intefaces");
    }

    @Override
    public void method2() {
        System.out.println("Overridden method from Inteface 1");
    }

    @Override
    public void method1() {
        System.out.println("Overridden method from Inteface 2");
    }

}
