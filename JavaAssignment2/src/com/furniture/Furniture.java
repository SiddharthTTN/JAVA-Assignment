package com.furniture;

public abstract class Furniture {
    public enum Type {
        CHAIR, TABLE;
    }

    public abstract void stressTest(Type type);

    public abstract void fireTest(Type type);
}
