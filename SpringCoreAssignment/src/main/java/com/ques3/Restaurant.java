package com.ques3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {

    HotDrink hotDrink;

    @Autowired
    Tea tea;

    ExpressTea expressTea;

    public Restaurant(HotDrink hotDrink, Tea tea, ExpressTea expressTea) {
        this.hotDrink = hotDrink;
        this.tea = tea;
        this.expressTea = expressTea;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    @Autowired
    @Required
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    @Autowired
    public Restaurant(Tea tea) {
        this.tea = tea;
    }

    public Restaurant() {
    }

    public Restaurant(ExpressTea expressTea) {
    }

    public Tea getTea() {
        return tea;
    }

    @Autowired
    public void setTea(Tea tea) {
        this.tea = tea;
    }

    public ExpressTea getExpressTea() {
        return expressTea;
    }

    public void setExpressTea(ExpressTea expressTea) {
        this.expressTea = expressTea;
    }


    @Override
    public String toString() {
        if (this.tea == null)
            return "Restaurant {" +
                    "expressTea=" + expressTea +
                    '}';
        else
            return "Restaurant {" +
                    "tea=" + tea +
                    '}';
    }
}
