package com.epam.training.anton_pashutkin.classes.main_task;

public class Car {

    private int id;
    private int carYear;
    private int carPrice;
    private String carBrand;
    private String carModel;
    private String carColor;
    private String carNumber;

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getCarYear() {
        return  carYear;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public Car(
        int id,
        int carYear,
        int carPrice,
        String carBrand,
        String carModel,
        String carColor,
        String carNumber) {
            this.id = id;
            this.carYear = carYear;
            this.carPrice = carPrice;
            this.carBrand = carBrand;
            this.carModel = carModel;
            this.carColor = carColor;
            this.carNumber = carNumber;
    }

    public String toString(){
        return String.format("id: #%s, ", id) +
               String.format("car brand: %s, ",carBrand) +
               String.format("model: %s, ", carModel) +
               String.format("year: %s, ", carYear) +
               String.format("price: $%s ", carPrice);
    }
}