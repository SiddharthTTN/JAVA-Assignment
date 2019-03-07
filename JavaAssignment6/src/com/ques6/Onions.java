package com.ques6;

public class Onions implements Toppings{

    Toppings toppings;
    private  final String type;
    public Onions(Toppings toppings){
        this.toppings = toppings;
        this.type = "Onion";
    }
    Onions(){
        this.type = "Onion";
        this.toppings = null;
    }
    @Override
    public void info() {
        System.out.println(this.type);
        if(toppings != null){
            toppings.info();
        }
    }
}
