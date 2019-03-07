package com.ques5;

public abstract class Shape {
    private Color color;
    private String type;


    Color getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    Shape(Color color, String type) {
        this.color = color;
        this.type = type;
    }
}