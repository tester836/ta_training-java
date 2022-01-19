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
                "X1",
                "White",
                "S 578 IL (A)"));

        list.addCar(new Car(
                3,
                2021,
                22281,
                "Nissan",
                "Qashqai II",
                "Gray",
                "C 5096 МК (BG)"));

        list.addCar(new Car(
                4,
                2015,
                24450,
                "Infiniti",
                "Q50",
                "Brown",
                "MAA 001 (CY)"));

        list.addCar(new Car(
                5,
                2019,
                15734,
                "Kia",
                "Rio",
                "Gray",
                "307 RTB (EST)"));

        list.addCar(new Car(
                6,
                1993,
                920,
                "Hyundai",
                "X1",
                "Red",
                "1234 AB-7 (BY)"));

        list.addCar(new Car(
                7,
                2020,
                15511,
                "LADA",
                "Vesta SW Cross",
                "Blue",
                "M 777 CK 777 (RU)"));



        System.out.println("\nCar brand list filtered with 'BMW':");

        ArrayList<Car> listBrand = list.getCarBrandFiltered("BMW");
        for (Car car : listBrand) {
            System.out.println(car);
        }

        System.out.println("\nCar model list filtered with 'X1':");
        ArrayList<Car> listModel = list.getCarModelFiltered("X1");
        for (Car car : listModel) {
            System.out.println(car);
        }

        System.out.println("\nCar list filtered with year manufactured after 2015 and price up to $20k:");
        ArrayList<Car> listYearPrice = list.getCarYearPriceFiltered(2015, 20000);
        for (Car car : listYearPrice) {
            System.out.println(car);
        }

    }
}
