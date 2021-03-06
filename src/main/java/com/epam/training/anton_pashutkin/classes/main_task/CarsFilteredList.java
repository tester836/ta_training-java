package com.epam.training.anton_pashutkin.classes.main_task;

import java.util.ArrayList;

public class CarsFilteredList {
    private ArrayList<Car> carList = new ArrayList<>();

    public void addCar(Car car){
        carList.add(car);
    }

    public  ArrayList<Car> getCarBrandFiltered (String carBrand){
        ArrayList<Car> carArrayList = new ArrayList<>();
        for (Car car : carList){
            if (car.getCarBrand() == carBrand) carArrayList.add(car);
        }
        return carArrayList;
    }

    public  ArrayList<Car> getCarModelFiltered (String carModel, int carYear){
        ArrayList<Car> carArrayList = new ArrayList<>();
        for (Car car : carList){
            if (car.getCarModel() == carModel && car.getCarYear() < carYear)
                carArrayList.add(car);
        }
        return carArrayList;
    }

    public  ArrayList<Car> getCarYearPriceFiltered(int carYear, int carPrice){
        ArrayList<Car> carArrayList = new ArrayList<>();
        for (Car car : carList){
            if (car.getCarYear() == carYear && car.getCarPrice() > carPrice) {
                carArrayList.add(car);
            }
        }
        return carArrayList;
    }
}