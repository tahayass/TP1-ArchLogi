package com.directi.training.srp.exercise;
public class CarCompare
{

    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : CarDb.get_carsDb()) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }

}
