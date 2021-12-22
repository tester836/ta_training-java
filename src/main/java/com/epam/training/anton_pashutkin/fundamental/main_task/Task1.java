package com.epam.training.anton_pashutkin.fundamental.main_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
            //1.Приветствовать любого пользователя при вводе его имени через командную строку.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("- What is your name?");
        String name = reader.readLine();
        System.out.println("\n- Hello, " + name + "!");
    }
}
