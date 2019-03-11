package com.ques3;

public class Tea implements HotDrink {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void prepareHotDrink() {
        System.out.println("Preparing Tea");
    }
}
