package com.epam.training.anton_pashutkin.fundamental.main_task;

import java.util.Scanner;

public class Task5 {
    //  5.Ввести число от 1 до 12. Вывести на консоль название месяца
    //  соответствующего данному числу. Осуществить проверку корректности ввода чисел.
    public static void main(String[] args) {
        System.out.println("Enter the month number, please:");
        Scanner sc = new Scanner(System.in);

        int monthNum = sc.nextInt();
        System.out.println(months(monthNum));
    }
    public static String months(int monthNumber){
        String[] monthsArray = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };
        if(monthNumber > 0 && monthNumber <= monthsArray.length)
            return monthsArray[monthNumber-1];
        else
            return "Sorry, month number should be from 1 to 12.";
    }
}