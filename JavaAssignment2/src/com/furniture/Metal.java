package com.furniture;

public class Metal extends Furniture {
    public void stressTest(Type type) {
        System.out.println("The Stress of metal " + type.name() + " is high");
    }

    public void fireTest(Type type) {
        System.out.println("com.furniture.Metal " + type.name() + " Don't catches fire");
    }
}
