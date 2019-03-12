package com;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class DummyClass {
    private String dummy;

    public String getDummy() {
        return dummy;
    }

    public void setDummy(String dummy) {
        this.dummy = dummy;
    }

    public void print(){
        System.out.println("print() method of the Dummy class is invoked");
    }


}
