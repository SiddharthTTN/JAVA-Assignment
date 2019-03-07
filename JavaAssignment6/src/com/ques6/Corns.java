package com.ques6;

public class Corns implements Toppings{

    private Toppings toppings;
    private  final String type;
    Corns(Toppings toppings ){
        this.toppings = toppings;
        this.type = "Corns";
    }
    Corns(){
        this.type = "Corns";
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
