package com.epam.training.anton_pashutkin.fundamental.main_task;

import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        System.out.println("- Enter two integer numbers, please.");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("\n- The sum of numbers is:" + (num1 + num2));
        System.out.println("and the product of numbers is: " + (num1 * num2));
    }
}