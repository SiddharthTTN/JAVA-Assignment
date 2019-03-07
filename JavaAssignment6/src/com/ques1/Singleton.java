package com.ques1;

public class Singleton {
    private static Singleton soleInstance = null;

    private Singleton() {
        System.out.println("The object is created");
    }

    public synchronized static Singleton getInstance() {
        if(soleInstance==null)
            soleInstance=new Singleton();
        return soleInstance;
    }
}
