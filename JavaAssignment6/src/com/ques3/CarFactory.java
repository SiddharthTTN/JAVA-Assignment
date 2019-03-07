package com.ques3;

public class CarFactory {

    public static Car buildCar(CarType carType, Location location) {
        Car car = null;
        switch (location) {
            case INDIA:
                car = IndianCarFactory.buildCar(carType);
                break;
            case USA:
                car = USACarFactory.buildCar(carType);
                break;
            case OTHER:
                car = OtherCarFactory.buildCar(carType);
                break;
        }
        return car;
    }
}
