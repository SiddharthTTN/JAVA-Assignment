package com.ques3;

class OtherCarFactory {

    static Car buildCar(CarType carType) {
        Car car = null;
        switch (carType) {
            case SEDAN:
                car = new SedanCar(Location.OTHER);
                break;
            case HATCHBACK:
                car = new HatchbackCar(Location.OTHER);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.OTHER);
                break;
        }
        return car;
    }

}
