package com.ques3;

//Blueprint for every car.
public abstract class Car {

    private CarType carType;

    private Location location;

    Car(CarType carType, Location location) {
        this.carType = carType;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Car Build of " +
                "Type : " + carType.toString() +
                " , Location : " + location.toString();
    }
}
