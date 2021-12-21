package com.epam.training.anton_pashutkin.fundamental.main_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: 21.12.2021
        /* 3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

        4.     Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

        5.   Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.*/
public class Task1 {
    public static void main(String[] args) throws IOException {
            //1.Приветствовать любого пользователя при вводе его имени через командную строку.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("- What is your name?");
        String name = reader.readLine();
        System.out.println("\n- Hello, " + name + "!");
    }
}
