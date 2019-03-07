package com.ques6;

public class Capsicum implements Toppings{

    Toppings toppings;
    private  final String type;
    Capsicum(Toppings toppings ){
        this.toppings = toppings;
        this.type = "Capsicum";
    }
    public Capsicum(){
        this.type = "Capsicum";
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
