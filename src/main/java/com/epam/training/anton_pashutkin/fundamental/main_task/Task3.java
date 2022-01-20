package com.epam.training.anton_pashutkin.fundamental.main_task;

import java.util.Random;

public class Task3 {
    public static void main(String[] args)  {
        System.out.println(" 1st random number: " + new Random().nextInt(100) + ", ");
        System.out.println(" 2nd random number: " + new Random().nextInt(100) + ", ");
        System.out.print(" 3rd random number: " + new Random().nextInt(100) + ", ");
        System.out.print(" 4th random number: " + new Random().nextInt(100) + ", ");
        System.out.print(" 5th random number: " + new Random().nextInt(100) + ".");
    }
}