package com.directi.training.srp.exercise;
import java.util.Arrays;
import java.util.List;

public class CarDb {
    private static List<Car> _carsDb = Arrays
    .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
        new Car("3", "Megane", "Renault"));

    public static List<Car> get_carsDb() {
        return _carsDb;
    }
}
