package com.ques5;

public class Square extends Shape {

    Square(Color color, String type) {
        super( color, type);
    }

    @Override
    public String toString() {
        return "Square{" +
                "type='" + super.getType() + '\'' +
                ", color='" + super.getColor().getColor() + '\'' +
                '}';
    }
}
