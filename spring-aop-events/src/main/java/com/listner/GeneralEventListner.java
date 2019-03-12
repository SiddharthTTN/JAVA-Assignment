package com.listner;

import org.springframework.context.event.*;

public class GeneralEventListner {

    @EventListener(ContextStartedEvent.class)
    public void start() {
        System.out.println("Event Started");
    }

    @EventListener(ContextClosedEvent.class)
    public void close() {
        System.out.println("Event Closed");
    }

    @EventListener(ContextStoppedEvent.class)
    public void stop() {
        System.out.println("Event Stopped");
    }

//    @EventListener(MyCustomListener.class)
//    public void event(){
//        System.out.println("This is the listenr of Database class");
//    }

}
