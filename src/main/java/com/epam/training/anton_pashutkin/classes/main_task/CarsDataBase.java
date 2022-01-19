package com.epam.training.anton_pashutkin.classes.main_task;

import java.util.ArrayList;

public class CarsDataBase {
    public static void main(String[] args) {

        CarsList list = new CarsList();

        list.addCar(new Car(
                1,
                2015,
                16200,
                "BMW",
                "Gran Tourer 216d F46",
                "White",
                "AB 123 FG (AL)"));
        list.addCar(new Car(
                2,
                2016,
                18009,
                "BMW",
                "X1 16d sDrive II",
                "White",
                "S 578 IL (A)"));



        System.out.println("Car brand list filtered with 'BMW':\n");

        ArrayList<Car> listBrand = list.getCarBrandFiltered("BMW");
        for (Car car : listBrand) {
            System.out.println(car);
        }

        System.out.println("Car model list filtered with 'X1':\n");
        ArrayList<Car> listModel = list.getCarModelFiltered("X1");
        for (Car car : listModel) {
            System.out.println(car);
        }

        System.out.println("Car list filtered with year manufactured after 2015 and price up to $20k:\n");
        ArrayList<Car> listYearPrice = list.getCarYearPriceFiltered(2015, 20000);
        for (Car car : listYearPrice) {
            System.out.println(car);
        }

    }
}
