package com.ques5;

public class Rectangle extends Shape {

    public Rectangle(Color color, String type) {
        super( color, type);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "type='" + super.getType() + '\'' +
                ", color='" + super.getColor().getColor() + '\'' +
                '}';
    }
}