package com.directi.training.srp.exercise;


public class CarManager
{

    

    public Car getFromDb(final String carId)
    {
        for (Car car : CarDb.get_carsDb()) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public String getCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : CarDb.get_carsDb()) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }


}

