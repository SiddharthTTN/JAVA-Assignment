package com.ques3;

class IndianCarFactory {

    static Car buildCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case SEDAN:
                car = new SedanCar(Location.INDIA);
                break;
            case HATCHBACK:
                car = new HatchbackCar(Location.INDIA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.INDIA);
                break;
        }
        return car;
    }

}
