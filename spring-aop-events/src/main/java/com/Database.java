package com;

import com.event.MyCustomEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Database implements ApplicationEventPublisherAware {
    private String name;
    private int port;
    ApplicationEventPublisher applicationEventPublisher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void connect() {
        MyCustomEvent myCustomEvent=new MyCustomEvent(this);
        applicationEventPublisher.publishEvent(myCustomEvent);
        System.out.println("connect() method of the database class is invoked");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
