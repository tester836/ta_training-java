package com.epam.training.anton_pashutkin.classes.main_task;

//todo:
    /*
    Создать классы, спецификации которых приведены ниже.
    Определить конструкторы и методы setТип(), getТип(), toString().
    Определить дополнительно методы в классе, создающем массив объектов.
    Задать критерий выбора данных и вывести эти данные на консоль.
    В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.

    Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
    Создать массив объектов. Вывести:
    a) список автомобилей заданной марки;
    b) список автомобилей заданной модели, которые эксплуатируются больше n лет;
    c) список автомобилей заданного года выпуска, цена которых больше указанной.
    */
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
        return String.format("Car brand: %s, ",carBrand) +
               String.format("model: %s, ", carModel) +
               String.format("year: %s, ", carYear) +
               String.format("price: $%s ", carPrice);
    }
}




