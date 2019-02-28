package com.furniture;

public class Wooden extends Furniture {
    public void stressTest(Type type) {
        System.out.println("The Stress of com.furniture.Wooden " + type.name() + " is low");
    }

    public void fireTest(Type type) {
        System.out.println("com.furniture.Wooden " + type.name() + " catches fire");
    }
}
