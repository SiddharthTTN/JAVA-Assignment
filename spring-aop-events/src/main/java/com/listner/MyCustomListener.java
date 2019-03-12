package com.listner;

import com.event.MyCustomEvent;
import org.springframework.context.ApplicationListener;

public class MyCustomListener implements ApplicationListener<MyCustomEvent> {
    @Override
    public void onApplicationEvent(MyCustomEvent event) {
        System.out.println("This is the listener of my custom event");
    }
}
