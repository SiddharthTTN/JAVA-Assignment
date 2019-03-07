package com.ques5;

public class Triangle extends Shape {

    Triangle(Color color, String type) {
        super( color, type);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "type='" + super.getType() + '\'' +
                ", color='" + super.getColor().getColor() + '\'' +
                '}';
    }
}