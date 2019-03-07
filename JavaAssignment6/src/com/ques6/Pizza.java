package com.ques6;

// Implement Decorator pattern to decorate the Pizza with toppings.


interface Toppings{
    void info();
}

public class Pizza implements Toppings{

    private Toppings toppings;



    public Pizza(Toppings toppings){
        this.toppings = toppings;
    }
    Pizza(){
        this.toppings = null;
    }
    @Override
    public void info() {
        System.out.println("Normal Pizza with ");
        if(toppings == null){
            System.out.println("No toppings");
        }
        else{
            toppings.info();
            System.out.println("as toppings");
        }
    }
}


