package com.ques3;

public class USACarFactory {

    static Car buildCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case SEDAN:
                car = new SedanCar(Location.USA);
                break;
            case HATCHBACK:
                car = new HatchbackCar(Location.USA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.USA);
                break;
        }
        return car;
    }
}
